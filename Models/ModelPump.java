/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 16/02/2013 11:10:58 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;


public class ModelPump extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;

	public ModelPump()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 36, 29);
		Shape2.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape2.setRotationPoint(-1F, 22.5F, -1F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 27);
		Shape3.addBox(0F, 0F, 0F, 10, 8, 8);
		Shape3.setRotationPoint(-5F, 15F, -4F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 27);
		Shape4.addBox(0F, 0F, 0F, 10, 8, 8);
		Shape4.setRotationPoint(-5F, 17.5F, -5.5F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0.5235988F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 27);
		Shape5.addBox(0F, 0F, 0F, 10, 8, 8);
		Shape5.setRotationPoint(-5F, 20.5F, -5.5F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 1.047198F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 36, 17);
		Shape6.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape6.setRotationPoint(5F, 16F, -3F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 0, 16);
		Shape7.addBox(0F, 0F, 0F, 16, 9, 2);
		Shape7.setRotationPoint(-8F, 14F, -8F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 0, 16);
		Shape8.addBox(0F, 0F, 0F, 16, 9, 2);
		Shape8.setRotationPoint(-8F, 14F, 6F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 64, 0);
		Shape9.addBox(0F, 0F, 0F, 2, 9, 12);
		Shape9.setRotationPoint(6F, 14F, -6F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 64, 0);
		Shape10.addBox(0F, 0F, 0F, 2, 9, 12);
		Shape10.setRotationPoint(-8F, 14F, -6F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 36, 17);
		Shape11.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape11.setRotationPoint(-6F, 16F, -3F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 92, 14);
		Shape12.addBox(0F, 0F, 0F, 14, 2, 1);
		Shape12.setRotationPoint(-7F, 12F, -7F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 92, 14);
		Shape13.addBox(0F, 0F, 0F, 14, 2, 1);
		Shape13.setRotationPoint(-7F, 12F, 6F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 92, 0);
		Shape14.addBox(0F, 0F, 0F, 1, 2, 12);
		Shape14.setRotationPoint(-7F, 12F, -6F);
		Shape14.setTextureSize(128, 128);
		Shape14.mirror = true;
		this.setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 92, 0);
		Shape15.addBox(0F, 0F, 0F, 1, 2, 12);
		Shape15.setRotationPoint(6F, 12F, -6F);
		Shape15.setTextureSize(128, 128);
		Shape15.mirror = true;
		this.setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 0, 43);
		Shape16.addBox(0F, 0F, 0F, 12, 1, 12);
		Shape16.setRotationPoint(-6F, 14F, -6F);
		Shape16.setTextureSize(128, 128);
		Shape16.mirror = true;
		this.setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 0, 56);
		Shape17.addBox(0F, 0F, 0F, 12, 1, 12);
		Shape17.setRotationPoint(-6F, 12F, -6F);
		Shape17.setTextureSize(128, 128);
		Shape17.mirror = true;
		this.setRotation(Shape17, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(List li, float phi)
	{
		this.setRenderPass();
		boolean solid = (Boolean)li.get(1);
		boolean broken = (Boolean)li.get(2);
		//solid = pass == 0;
		if (solid) {
			Shape1.render(f5);
			Shape2.render(f5);
			if (!broken) {
				double d = 1.1875;
				GL11.glTranslated(0, d, 0);
				GL11.glRotatef(phi, 1, 0, 0);
				GL11.glTranslated(0, -d, 0);
				Shape3.render(f5);
				Shape4.render(f5);
				Shape5.render(f5);
				GL11.glTranslated(0, d, 0);
				GL11.glRotatef(-phi, 1, 0, 0);
				GL11.glTranslated(0, -d, 0);
			}

			Shape6.render(f5);
			Shape7.render(f5);
			Shape8.render(f5);
			Shape9.render(f5);
			Shape10.render(f5);
			Shape11.render(f5);
			Shape12.render(f5);
			Shape13.render(f5);
			Shape14.render(f5);
			Shape15.render(f5);
		}
		if (solid)
			Shape17.render(f5);
	}

}
