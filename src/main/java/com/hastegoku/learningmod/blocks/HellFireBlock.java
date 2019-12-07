package com.hastegoku.learningmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class HellFireBlock extends BlockBase{
	public HellFireBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(3.0F);
		setResistance(15.0F);
		setLightLevel(20.0F);
	}
}
