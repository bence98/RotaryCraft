/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.TileEntities.Processing;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import Reika.DragonAPI.Base.OneSlotMachine;
import Reika.DragonAPI.Libraries.MathSci.ReikaMathLibrary;
import Reika.DragonAPI.Libraries.World.ReikaRedstoneHelper;
import Reika.RotaryCraft.Auxiliary.ItemStacks;
import Reika.RotaryCraft.Auxiliary.Interfaces.ConditionalOperation;
import Reika.RotaryCraft.Auxiliary.Interfaces.DiscreteFunction;
import Reika.RotaryCraft.Base.TileEntity.InventoriedPowerReceiver;
import Reika.RotaryCraft.Registry.DurationRegistry;
import Reika.RotaryCraft.Registry.MachineRegistry;

public class TileEntityMagnetizer extends InventoriedPowerReceiver implements OneSlotMachine, DiscreteFunction, ConditionalOperation {

	private boolean[] lastPower = new boolean[3];

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		return j == 0;
	}

	@Override
	public void animateWithTick(World world, int x, int y, int z) {
		if (!this.isInWorld()) {
			phi = 0;
			return;
		}
		phi += ReikaMathLibrary.doubpow(ReikaMathLibrary.logbase(omega+1, 2), 1.05);
	}

	@Override
	public MachineRegistry getMachine() {
		return MachineRegistry.MAGNETIZER;
	}

	@Override
	public void updateEntity(World world, int x, int y, int z, int meta) {
		super.updateTileEntity();
		this.getIOSidesDefault(world, x, y, z, meta);
		this.getPower(false);
		if (power < MINPOWER) {
			tickcount = 0;
			return;
		}
		if (omega < MINSPEED) {
			tickcount = 0;
			return;
		}
		if (!this.hasCore()) {
			tickcount = 0;
			return;
		}
		if (!ReikaRedstoneHelper.isGettingACRedstone(world, x, y, z, lastPower))
			return;
		tickcount++;
		if (tickcount < this.getOperationTime())
			return;
		tickcount = 0;
		this.magnetize();
	}

	private boolean hasCore() {
		if (inv[0] == null) {
			return false;
		}
		if (inv[0].stackSize > 1) {
			return false;
		}
		if (inv[0].itemID != ItemStacks.shaftcore.itemID || inv[0].getItemDamage() != ItemStacks.shaftcore.getItemDamage()) {
			return false;
		}
		return true;
	}

	private void magnetize() {
		ItemStack is = inv[0];
		if (is.stackTagCompound == null) {
			is.stackTagCompound = new NBTTagCompound();
			is.stackTagCompound.setInteger("magnet", 1);
		}
		else if (is.stackTagCompound.hasKey("magnet")){
			int m = is.stackTagCompound.getInteger("magnet");
			m++;
			is.stackTagCompound.setInteger("magnet", m);
		}
		else {
			is.stackTagCompound.setInteger("magnet", 1);
		}
	}

	@Override
	public boolean hasModelTransparency() {
		return false;
	}

	@Override
	public int getSizeInventory() {
		return 1;
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack is) {
		return (is.itemID == ItemStacks.shaftcore.itemID && is.getItemDamage() == ItemStacks.shaftcore.getItemDamage() && inv[0] == null);
	}

	@Override
	public int getRedstoneOverride() {
		if (!this.hasCore())
			return 15;
		return 0;
	}

	@Override
	public int getOperationTime() {
		return DurationRegistry.MAGNETIZER.getOperationTime(omega);
	}

	@Override
	public boolean areConditionsMet() {
		return this.hasCore();
	}

	@Override
	public String getOperationalStatus() {
		return this.areConditionsMet() ? "Operational" : "No Shaft Core";
	}

}
