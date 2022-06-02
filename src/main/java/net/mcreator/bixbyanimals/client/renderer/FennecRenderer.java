
package net.mcreator.bixbyanimals.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bixbyanimals.entity.FennecEntity;
import net.mcreator.bixbyanimals.client.model.Modelwolf;

public class FennecRenderer extends MobRenderer<FennecEntity, Modelwolf<FennecEntity>> {
	public FennecRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwolf(context.bakeLayer(Modelwolf.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FennecEntity entity) {
		return new ResourceLocation("bixby_animals:textures/fennectex.png");
	}
}
