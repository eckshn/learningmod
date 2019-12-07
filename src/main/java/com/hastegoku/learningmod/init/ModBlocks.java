package com.hastegoku.learningmod.init;

import java.util.ArrayList;
import java.util.List;

import com.hastegoku.learningmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SOLID_STONE_BLOCK = new BlockBase("solid_stone_block", Material.ROCK);
	
}
