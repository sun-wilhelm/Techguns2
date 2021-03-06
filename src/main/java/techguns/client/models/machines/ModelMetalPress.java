package techguns.client.models.machines;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelMetalPress extends ModelMachine {

	  //fields
  ModelRenderer Shape1;
  ModelRenderer Shape2;
  ModelRenderer Shape3;
  ModelRenderer Shape4;
  ModelRenderer Shape5;
  ModelRenderer Shape6;
  ModelRenderer Shape7;
  ModelRenderer Shape8;
  ModelRenderer Shape10;
  ModelRenderer Shape11;
  ModelRenderer Shape12;
  ModelRenderer Shape13;
  ModelRenderer Shape14;
  ModelRenderer Shape15;
  ModelRenderer MetalPiece;
  ModelRenderer Shape17;
  ModelRenderer Shape18;
  ModelRenderer Shape19;
  ModelRenderer Shape20;
  ModelRenderer Shape21;
  ModelRenderer Shape22;
  ModelRenderer p1;
  ModelRenderer p2;
  ModelRenderer p3;
  ModelRenderer p4;
  ModelRenderer p5;
  ModelRenderer p6;
  ModelRenderer Shape23;
  ModelRenderer Shape24;
  ModelRenderer Shape25;
  ModelRenderer Shape26;
  ModelRenderer Shape27;
  ModelRenderer Shape28;
  ModelRenderer Shape29;
  ModelRenderer Shape30;
  ModelRenderer Shape31;

	public ModelMetalPress() {
		textureWidth = 128;
	    textureHeight = 64;
	    
	      Shape1 = new ModelRenderer(this, 51, 18);
	      Shape1.addBox(0F, 0F, 0F, 3, 2, 10);
	      Shape1.setRotationPoint(5F, 20F, -5F);
	      Shape1.setTextureSize(128, 64);
	      Shape1.mirror = true;
	      setRotation(Shape1, 0F, 0F, 0F);
	      Shape2 = new ModelRenderer(this, 0, 50);
	      Shape2.addBox(0F, 0F, 0F, 16, 2, 12);
	      Shape2.setRotationPoint(-8F, 8F, -6F);
	      Shape2.setTextureSize(128, 64);
	      Shape2.mirror = true;
	      setRotation(Shape2, 0F, 0F, 0F);
	      Shape3 = new ModelRenderer(this, 66, 0);
	      Shape3.addBox(0F, 0F, 0F, 2, 8, 8);
	      Shape3.setRotationPoint(5.5F, 12F, -4F);
	      Shape3.setTextureSize(128, 64);
	      Shape3.mirror = true;
	      setRotation(Shape3, 0F, 0F, 0F);
	      Shape4 = new ModelRenderer(this, 66, 0);
	      Shape4.addBox(-1.5F, 0F, -4F, 2, 8, 8);
	      Shape4.setRotationPoint(0F, 12F, -6F);
	      Shape4.setTextureSize(128, 64);
	      Shape4.mirror = true;
	      setRotation(Shape4, 0F, -1.570796F, 0F);
	      Shape5 = new ModelRenderer(this, 55, 0);
	      Shape5.addBox(0F, 0F, 0F, 1, 1, 3);
	      Shape5.setRotationPoint(6.5F, 10.5F, -7.5F);
	      Shape5.setTextureSize(128, 64);
	      Shape5.mirror = true;
	      setRotation(Shape5, 0F, 0F, 0F);
	      Shape6 = new ModelRenderer(this, 0, 38);
	      Shape6.addBox(0F, 0F, 0F, 2, 2, 10);
	      Shape6.setRotationPoint(6F, 10F, -5F);
	      Shape6.setTextureSize(128, 64);
	      Shape6.mirror = true;
	      setRotation(Shape6, 0F, 0F, 0F);
	      Shape7 = new ModelRenderer(this, 50, 0);
	      Shape7.addBox(0F, 0F, 0F, 1, 11, 1);
	      Shape7.setRotationPoint(6.5F, 11.5F, -7.5F);
	      Shape7.setTextureSize(128, 64);
	      Shape7.mirror = true;
	      setRotation(Shape7, 0F, 0F, 0F);
	      Shape8 = new ModelRenderer(this, 0, 0);
	      Shape8.addBox(0F, 0F, 0F, 16, 2, 16);
	      Shape8.setRotationPoint(-8F, 22F, -8F);
	      Shape8.setTextureSize(128, 64);
	      Shape8.mirror = true;
	      setRotation(Shape8, 0F, 0F, 0F);
	      Shape10 = new ModelRenderer(this, 38, 25);
	      Shape10.addBox(-2F, -2F, -3F, 3, 6, 6);
	      Shape10.setRotationPoint(0F, 15F, -6F);
	      Shape10.setTextureSize(128, 64);
	      Shape10.mirror = true;
	      setRotation(Shape10, 0F, -1.570796F, 0F);
	      Shape11 = new ModelRenderer(this, 51, 18);
	      Shape11.addBox(0F, 0F, 0F, 3, 2, 10);
	      Shape11.setRotationPoint(-8F, 20F, -5F);
	      Shape11.setTextureSize(128, 64);
	      Shape11.mirror = true;
	      setRotation(Shape11, 0F, 0F, 0F);
	      Shape12 = new ModelRenderer(this, 65, 31);
	      Shape12.addBox(0F, 0F, 0F, 10, 2, 12);
	      Shape12.setRotationPoint(-5F, 20F, -6F);
	      Shape12.setTextureSize(128, 64);
	      Shape12.mirror = true;
	      setRotation(Shape12, 0F, 0F, 0F);
	      Shape13 = new ModelRenderer(this, 0, 28);
	      Shape13.addBox(0F, 0F, 0F, 12, 2, 7);
	      Shape13.setRotationPoint(-6F, 10F, -3.5F);
	      Shape13.setTextureSize(128, 64);
	      Shape13.mirror = true;
	      setRotation(Shape13, 0F, 0F, 0F);
	      Shape14 = new ModelRenderer(this, 38, 25);
	      Shape14.addBox(-2F, -2F, -2F, 3, 6, 6);
	      Shape14.setRotationPoint(7F, 15F, -1F);
	      Shape14.setTextureSize(128, 64);
	      Shape14.mirror = true;
	      setRotation(Shape14, 0F, 0F, 0F);
	      Shape15 = new ModelRenderer(this, 24, 37);
	      Shape15.addBox(0F, 0F, 0F, 10, 3, 10);
	      Shape15.setRotationPoint(-5F, 10F, -5F);
	      Shape15.setTextureSize(128, 64);
	      Shape15.mirror = true;
	      setRotation(Shape15, 0F, 0F, 0F);
	      MetalPiece = new ModelRenderer(this, 104, 46);
	      MetalPiece.addBox(0F, 0F, 0F, 6, 1, 6);
	      MetalPiece.setRotationPoint(-3F, 18F, -3F);
	      MetalPiece.setTextureSize(128, 64);
	      MetalPiece.mirror = true;
	      setRotation(MetalPiece, 0F, 0F, 0F);
	      Shape17 = new ModelRenderer(this, 50, 0);
	      Shape17.addBox(0F, 0F, 0F, 1, 11, 1);
	      Shape17.setRotationPoint(6.5F, 11.5F, 6.5F);
	      Shape17.setTextureSize(128, 64);
	      Shape17.mirror = true;
	      setRotation(Shape17, 0F, 0F, 0F);
	      Shape18 = new ModelRenderer(this, 55, 0);
	      Shape18.addBox(0F, 0F, 0F, 1, 1, 3);
	      Shape18.setRotationPoint(6.5F, 10.5F, 4.5F);
	      Shape18.setTextureSize(128, 64);
	      Shape18.mirror = true;
	      setRotation(Shape18, 0F, 0F, 0F);
	      Shape19 = new ModelRenderer(this, 53, 0);
	      Shape19.addBox(-1.5F, 0F, 2.5F, 1, 1, 1);
	      Shape19.setRotationPoint(0F, 11F, -6F);
	      Shape19.setTextureSize(128, 64);
	      Shape19.mirror = true;
	      setRotation(Shape19, 0F, -1.570796F, 0F);
	      Shape20 = new ModelRenderer(this, 55, 0);
	      Shape20.addBox(-1.5F, 0F, -6.5F, 1, 1, 3);
	      Shape20.setRotationPoint(0F, 10.5F, -6F);
	      Shape20.setTextureSize(128, 64);
	      Shape20.mirror = true;
	      setRotation(Shape20, 0F, -1.570796F, 0F);
	      Shape21 = new ModelRenderer(this, 50, 0);
	      Shape21.addBox(0F, 0F, 0F, 1, 11, 1);
	      Shape21.setRotationPoint(-7.5F, 11.5F, -7.5F);
	      Shape21.setTextureSize(128, 64);
	      Shape21.mirror = true;
	      setRotation(Shape21, 0F, 0F, 0F);
	      Shape22 = new ModelRenderer(this, 50, 0);
	      Shape22.addBox(0F, 0F, 0F, 1, 11, 1);
	      Shape22.setRotationPoint(-7.5F, 11.5F, 6.5F);
	      Shape22.setTextureSize(128, 64);
	      Shape22.mirror = true;
	      setRotation(Shape22, 0F, 0F, 0F);
	      p1 = new ModelRenderer(this, 89, 10);
	      p1.addBox(0F, 0F, 0F, 8, 5, 8);
	      p1.setRotationPoint(-4F, 9F, -4F);
	      p1.setTextureSize(128, 64);
	      p1.mirror = true;
	      setRotation(p1, 0F, 0F, 0F);
	      p2 = new ModelRenderer(this, 86, 0);
	      p2.addBox(0F, 0F, 0F, 1, 5, 1);
	      p2.setRotationPoint(3.5F, 9F, -0.5F);
	      p2.setTextureSize(128, 64);
	      p2.mirror = true;
	      setRotation(p2, 0F, 0F, 0F);
	      p3 = new ModelRenderer(this, 86, 0);
	      p3.addBox(0F, 0F, 0F, 9, 1, 9);
	      p3.setRotationPoint(-4.5F, 14F, -4.5F);
	      p3.setTextureSize(128, 64);
	      p3.mirror = true;
	      setRotation(p3, 0F, 0F, 0F);
	      p4 = new ModelRenderer(this, 86, 0);
	      p4.addBox(0F, 0F, 0F, 1, 5, 1);
	      p4.setRotationPoint(-0.5F, 9F, -4.5F);
	      p4.setTextureSize(128, 64);
	      p4.mirror = true;
	      setRotation(p4, 0F, 0F, 0F);
	      p5 = new ModelRenderer(this, 86, 0);
	      p5.addBox(0F, 0F, 0F, 1, 5, 1);
	      p5.setRotationPoint(-0.5F, 9F, 3.5F);
	      p5.setTextureSize(128, 64);
	      p5.mirror = true;
	      setRotation(p5, 0F, 0F, 0F);
	      p6 = new ModelRenderer(this, 86, 0);
	      p6.addBox(0F, 0F, 0F, 1, 5, 1);
	      p6.setRotationPoint(-4.5F, 9F, -0.5F);
	      p6.setTextureSize(128, 64);
	      p6.mirror = true;
	      setRotation(p6, 0F, 0F, 0F);
	      Shape23 = new ModelRenderer(this, 66, 0);
	      Shape23.addBox(0F, 0F, 0F, 2, 8, 8);
	      Shape23.setRotationPoint(-7.5F, 12F, -4F);
	      Shape23.setTextureSize(128, 64);
	      Shape23.mirror = true;
	      setRotation(Shape23, 0F, 0F, 0F);
	      Shape24 = new ModelRenderer(this, 38, 25);
	      Shape24.addBox(-2F, -2F, -2F, 3, 6, 6);
	      Shape24.setRotationPoint(-6F, 15F, -1F);
	      Shape24.setTextureSize(128, 64);
	      Shape24.mirror = true;
	      setRotation(Shape24, 0F, 0F, 0F);
	      Shape25 = new ModelRenderer(this, 0, 38);
	      Shape25.addBox(0F, 0F, 0F, 2, 2, 10);
	      Shape25.setRotationPoint(-8F, 10F, -5F);
	      Shape25.setTextureSize(128, 64);
	      Shape25.mirror = true;
	      setRotation(Shape25, 0F, 0F, 0F);
	      Shape26 = new ModelRenderer(this, 55, 0);
	      Shape26.addBox(0F, 0F, 0F, 1, 1, 3);
	      Shape26.setRotationPoint(-7.5F, 10.5F, -7.5F);
	      Shape26.setTextureSize(128, 64);
	      Shape26.mirror = true;
	      setRotation(Shape26, 0F, 0F, 0F);
	      Shape27 = new ModelRenderer(this, 55, 0);
	      Shape27.addBox(0F, 0F, 0F, 1, 1, 3);
	      Shape27.setRotationPoint(-7.5F, 10.5F, 4.5F);
	      Shape27.setTextureSize(128, 64);
	      Shape27.mirror = true;
	      setRotation(Shape27, 0F, 0F, 0F);
	      Shape28 = new ModelRenderer(this, 0, 38);
	      Shape28.addBox(-2F, 0F, -5F, 2, 2, 10);
	      Shape28.setRotationPoint(0F, 20F, -6F);
	      Shape28.setTextureSize(128, 64);
	      Shape28.mirror = true;
	      setRotation(Shape28, 0F, -1.570796F, 0F);
	      Shape29 = new ModelRenderer(this, 55, 0);
	      Shape29.addBox(-1.5F, 0F, 3.5F, 1, 1, 3);
	      Shape29.setRotationPoint(0F, 10.5F, -6F);
	      Shape29.setTextureSize(128, 64);
	      Shape29.mirror = true;
	      setRotation(Shape29, 0F, -1.570796F, 0F);
	      Shape30 = new ModelRenderer(this, 53, 0);
	      Shape30.addBox(-1.5F, 0F, -3.5F, 1, 1, 1);
	      Shape30.setRotationPoint(0F, 11F, -6F);
	      Shape30.setTextureSize(128, 64);
	      Shape30.mirror = true;
	      setRotation(Shape30, 0F, -1.570796F, 0F);
	      Shape31 = new ModelRenderer(this, 67, 46);
	      Shape31.addBox(0F, 0F, 0F, 9, 1, 9);
	      Shape31.setRotationPoint(-4.5F, 19F, -4.5F);
	      Shape31.setTextureSize(128, 64);
	      Shape31.mirror = true;
	      setRotation(Shape31, 0F, 0F, 0F);
	}

	
	
	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, float progress) {
		Shape1.render(scale);
	    Shape2.render(scale);
	    Shape3.render(scale);
	    Shape4.render(scale);
	    Shape5.render(scale);
	    Shape6.render(scale);
	    Shape7.render(scale);
	    Shape8.render(scale);
	    Shape10.render(scale);
	    Shape11.render(scale);
	    Shape12.render(scale);
	    Shape13.render(scale);
	    Shape14.render(scale);
	    Shape15.render(scale);
	    //MetalPiece.render(f5);
	    Shape17.render(scale);
	    Shape18.render(scale);
	    Shape19.render(scale);
	    Shape20.render(scale);
	    Shape21.render(scale);
	    Shape22.render(scale);
	    Shape23.render(scale);
	    Shape24.render(scale);
	    Shape25.render(scale);
	    Shape26.render(scale);
	    Shape27.render(scale);
	    Shape28.render(scale);
	    Shape29.render(scale);
	    Shape30.render(scale);
	    Shape31.render(scale);
	    
		if (progress > 0.0f) {
			MetalPiece.render(scale);
			if (progress > 0.5f) {
				progress-= 0.5f;
			}
		    float y =0.5f + (float) Math.sin((Math.sqrt(progress*2.0f)+0.75f)*Math.PI*2.0f)/2.0f;
		    GlStateManager.translate(0f, 0.25f*y, 0f);
		}
		p1.render(scale);
		p2.render(scale);
		p3.render(scale);
		p4.render(scale);
		p5.render(scale);
		p6.render(scale);

	}
}

