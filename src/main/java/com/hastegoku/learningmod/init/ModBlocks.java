package com.hastegoku.learningmod.init;

import java.util.ArrayList;
import java.util.List;

import com.hastegoku.learningmod.blocks.BlockBase;
import com.hastegoku.learningmod.blocks.HolyPaperBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//Basic Block
	public static final Block SOLID_STONE_BLOCK = new BlockBase("solid_stone_block", Material.ROCK);
	//New Property Block
	public static final Block HOLY_PAPER_BLOCK = new HolyPaperBlock("holy_paper_block", Material.CRAFTED_SNOW);
}
