package com.mraof.minestuck.client.model.machine;

import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.blockentity.machine.AlchemiterBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AlchemiterModel extends AnimatedGeoModel<AlchemiterBlockEntity>
{
	@Override
	public ResourceLocation getModelLocation(AlchemiterBlockEntity object)
	{
		return new ResourceLocation(Minestuck.MOD_ID, "geo/alchemiter.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(AlchemiterBlockEntity object)
	{
		return new ResourceLocation(Minestuck.MOD_ID, "textures/block/machine/alchemiter.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(AlchemiterBlockEntity animatable)
	{
		return new ResourceLocation(Minestuck.MOD_ID, "animations/alchemiter.animation.json");
	}
}
