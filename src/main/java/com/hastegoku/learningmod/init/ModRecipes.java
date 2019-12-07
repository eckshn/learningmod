package com.hastegoku.learningmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(Blocks.GLOWSTONE, new ItemStack(ModBlocks.HELL_FIRE_BLOCK, 1), 0.1f);
		GameRegistry.addSmelting(Blocks.CONCRETE, new ItemStack(ModBlocks.SOLID_STONE_BLOCK, 2), 0.1f);
	}
}
