package com.hastegoku.learningmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class HolyPaperBlock extends BlockBase{

	public HolyPaperBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.SNOW);
		setHardness(0.1F);
		setResistance(10.0F);
		setHarvestLevel("sword", 0);
		setLightLevel(10.0F);
		setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
