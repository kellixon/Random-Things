package lumien.randomthings.recipes;

import org.apache.commons.lang3.ArrayUtils;

import lumien.randomthings.block.ModBlocks;
import lumien.randomthings.item.ModItems;
import lumien.randomthings.recipes.imbuing.ImbuingRecipeHandler;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes
{
	public static String[] oreDictDyes = new String[16];
	static String[] dyes = { "Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGray", "Gray", "Pink", "Lime", "Yellow", "LightBlue", "Magenta", "Orange", "White" };

	public static void register()
	{
		final ItemStack stone = new ItemStack(Blocks.stone);
		final ItemStack rottenFlesh = new ItemStack(Items.rotten_flesh);
		final ItemStack boneMeal = new ItemStack(Items.dye, 1, 15);
		final ItemStack lapis = new ItemStack(Items.dye, 1, 4);
		final ItemStack dirt = new ItemStack(Blocks.dirt);
		final ItemStack lapisBlock = new ItemStack(Blocks.lapis_block);
		final ItemStack repeater = new ItemStack(Items.repeater);
		final ItemStack redstoneTorch = new ItemStack(Blocks.redstone_torch);
		final ItemStack obsidian = new ItemStack(Blocks.obsidian);
		final ItemStack stableEnderpearl = new ItemStack(ModItems.stableEnderpearl);
		final ItemStack endStone = new ItemStack(Blocks.end_stone);
		final ItemStack redstoneDust = new ItemStack(Items.redstone);
		final ItemStack enderPearl = new ItemStack(Items.ender_pearl);
		final ItemStack netherStar = new ItemStack(Items.nether_star);
		final ItemStack enderChest = new ItemStack(Blocks.ender_chest);
		final ItemStack redstoneLamp = new ItemStack(Blocks.redstone_lamp);
		final ItemStack blackWool = new ItemStack(Blocks.wool, 1, 15);
		final ItemStack cobblestone = new ItemStack(Blocks.cobblestone);
		final ItemStack biomeCrystal = new ItemStack(ModItems.biomeCrystal);
		final ItemStack stoneBricks = new ItemStack(Blocks.stonebrick);
		final ItemStack crackedStoneBricks = new ItemStack(Blocks.stonebrick, 1, 2);
		final ItemStack chiseledStoneBricks = new ItemStack(Blocks.stonebrick, 1, 3);
		final ItemStack prismarineShard = new ItemStack(Items.prismarine_shard);
		final ItemStack prismarineCrystal = new ItemStack(Items.prismarine_crystals);
		final ItemStack bean = new ItemStack(ModItems.beans);
		final ItemStack wheat = new ItemStack(Items.wheat);
		final ItemStack bowl = new ItemStack(Items.bowl);
		final ItemStack ghastTear = new ItemStack(Items.ghast_tear);
		final ItemStack craftingTable = new ItemStack(Blocks.crafting_table);
		final ItemStack paper = new ItemStack(Items.paper);
		final ItemStack stick = new ItemStack(Items.stick);
		final ItemStack vine = new ItemStack(Blocks.vine);
		final ItemStack waterBottle = new ItemStack(Items.potionitem);
		final ItemStack mossyCobblestone = new ItemStack(Blocks.mossy_cobblestone);
		final ItemStack netherBrick = new ItemStack(Blocks.nether_brick);
		final ItemStack netherRack = new ItemStack(Blocks.netherrack);
		final ItemStack coal = new ItemStack(Items.coal);
		final ItemStack blazePowder = new ItemStack(Items.blaze_powder);
		final ItemStack flint = new ItemStack(Items.flint);
		final ItemStack spiderEye = new ItemStack(Items.spider_eye);
		final ItemStack redMushroom = new ItemStack(Blocks.red_mushroom);
		final ItemStack glowStone = new ItemStack(Items.glowstone_dust);
		final ItemStack glisteringMelon = new ItemStack(Items.speckled_melon);
		final ItemStack witherSkull = new ItemStack(Items.skull, 1, 1);

		for (int i = 0; i < oreDictDyes.length; i++)
		{
			oreDictDyes[i] = "dye" + dyes[i];
		}

		ArrayUtils.reverse(oreDictDyes);

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.playerInterface), "oco", "ono", "oso", 'o', obsidian, 'c', enderChest, 's', stableEnderpearl, 'n', netherStar));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.fertilizedDirt, 2, 0), "rbr", "bdb", "rbr", 'r', rottenFlesh, 'b', boneMeal, 'd', dirt));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lapisGlass, 8, 0), "ggg", "glg", "ggg", 'g', "blockGlass", 'l', lapisBlock));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.onlineDetector, 1, 0), "srs", "rtr", "srs", 's', "stone", 'r', repeater, 't', "dyeBlue"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.chatDetector, 1, 0), "srs", "rtr", "srs", 's', "stone", 'r', repeater, 't', "dyeRed"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.enderBridge), "eee", "ers", "eee", 'e', endStone, 'r', redstoneDust, 's', stableEnderpearl));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.enderAnchor), "ooo", "oso", "ooo", 'o', obsidian, 's', stableEnderpearl));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lapisLamp), "xlx", "lal", "xlx", 'l', lapis, 'a', redstoneLamp));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.dyeingMachine), "xgx", "rcb", "xwx", 'g', "dyeGreen", 'r', "dyeRed", 'b', "dyeBlue", 'w', blackWool, 'c', craftingTable));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.prismarineEnderBridge), "scs", "cbc", "scs", 's', prismarineShard, 'c', prismarineCrystal, 'b', new ItemStack(ModBlocks.enderBridge)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lifeAnchor), "dad", "ana", "dad", 'd', "blockDiamond", 'a', new ItemStack(ModBlocks.enderAnchor), 'n', netherStar));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.redstoneInterface), "iri", "rsr", "iri", 'i', "ingotIron", 'r', redstoneDust, 's', stableEnderpearl));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lightRedirector), "pgp", "gxg", "pgp", 'g', "blockGlass", 'p', "plankWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.imbuingStation), "xwx", "vcv", "lel", 'w', Items.water_bucket, 'v', Blocks.vine, 'c', Blocks.hardened_clay, 'l', Blocks.waterlily, 'e', Items.emerald));

		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.grassSeeds), Blocks.grass));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stableEnderpearl), "olo", "lel", "olo", 'o', obsidian, 'l', lapis, 'e', enderPearl));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.beans, 1, 1), "nnn", "nbn", "nnn", 'b', bean, 'n', "nuggetGold"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.beanStew, 1, 0), "xwx", "bbb", "xox", 'b', bean, 'w', wheat, 'o', bowl));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.beanStew, 1, 0), "bbb", "xwx", "xox", 'b', bean, 'w', wheat, 'o', bowl));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.positionFilter, 1, 0), "xdx", "dpd", "xdx", 'd', "purpleDye", 'p', paper));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.inertLinkingOrb), "rtr", "tst", "rtr", 'r', redstoneDust, 't', ghastTear, 's', "stone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneTool), "xrx", "xsx", "xsx", 'r', redstoneDust, 's', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianSkull), "oro", "bwb", "oro", 'o', obsidian, 'r', Items.blaze_rod, 'w', witherSkull, 'b', netherBrick));

		// Biome Blocks
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.biomeStone, 16, 0), "ccc", "cbc", "ccc", 'c', cobblestone, 'b', biomeCrystal));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.biomeStone, 16, 1), "sss", "sbs", "sss", 's', stone, 'b', biomeCrystal));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.biomeStone, 16, 2), "rrr", "rbr", "rrr", 'r', stoneBricks, 'b', biomeCrystal));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.biomeStone, 16, 3), "ccc", "cbc", "ccc", 'c', crackedStoneBricks, 'b', biomeCrystal));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.biomeStone, 16, 4), "ccc", "cbc", "ccc", 'c', chiseledStoneBricks, 'b', biomeCrystal));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.biomeGlass, 16), "ggg", "gbg", "ggg", 'g', "blockGlassColorless", 'b', biomeCrystal));

		createDyeRecipes(new ItemStack(Blocks.brick_block), ModBlocks.stainedBrick);
		createGrassSeedsRecipes();

		// Imbuing Station
		ImbuingRecipeHandler.addRecipe(waterBottle, vine, boneMeal, cobblestone, mossyCobblestone);

		ImbuingRecipeHandler.addRecipe(coal, flint, blazePowder, waterBottle, new ItemStack(ModItems.imbue, 1, 0));
		ImbuingRecipeHandler.addRecipe(spiderEye, rottenFlesh, redMushroom, waterBottle, new ItemStack(ModItems.imbue, 1, 1));
		ImbuingRecipeHandler.addRecipe(new ItemStack(ModItems.beans,1,1), lapis, glowStone, waterBottle, new ItemStack(ModItems.imbue, 1, 2));
		ImbuingRecipeHandler.addRecipe(witherSkull, netherBrick, ghastTear, waterBottle, new ItemStack(ModItems.imbue, 1, 3));

	}

	private static void createGrassSeedsRecipes()
	{
		for (int i = 0; i < 16; i++)
		{
			EnumDyeColor color = EnumDyeColor.byMetadata(i);
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.grassSeeds, 1, i + 1), new ItemStack(ModItems.grassSeeds, 1, 0), oreDictDyes[i]));
		}
	}

	private static void createDyeRecipes(ItemStack original, Block dyedBlock)
	{
		for (int i = 0; i < 16; i++)
		{
			EnumDyeColor color = EnumDyeColor.byMetadata(i);
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(dyedBlock, 8, i), "ttt", "tdt", "ttt", 't', original, 'd', oreDictDyes[i]));
		}
	}
}