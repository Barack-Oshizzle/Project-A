package com.BarackOshizzle.ProjectA;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import com.BarackOshizzle.ProjectA.Blocks.CrystalBlock;
import com.BarackOshizzle.ProjectA.Items.Crystal;
import com.BarackOshizzle.ProjectA.Proxies.CommonProxy;
import com.BarackOshizzle.ProjectA.Tools.Chisel;
import com.BarackOshizzle.ProjectA.Tools.CrystalAxe;
import com.BarackOshizzle.ProjectA.Tools.CrystalPickaxe;
import com.BarackOshizzle.ProjectA.Tools.CrystalShovel;
import com.BarackOshizzle.ProjectA.Tools.CrystalSword;
import com.BarackOshizzle.ProjectA.Tools.StoneHammer;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Project_A.MODID, name = Project_A.NAME, version = Project_A.VERSION)
public class Project_A {
	
	@Instance(Project_A.MODID)
	public static Project_A instance;
	
	public static CreativeTabs projectATab = new CreativeTabs("ProjectAdding") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Project_A.crystal;
	    }
	};
	
	
	
	public static final String MODID = "project_a";
	public static final String NAME = "Project A";
	public static final String VERSION = "0.1";
	
	
	
	@SidedProxy(clientSide="com.BarackOshizzle.ProjectA.Proxies.ClientProxy", serverSide="com.BarackOshizzle.ProjectA.Proxies.CommonProxy")
	public static CommonProxy proxy;
	
	public static ToolMaterial toolMaterial = EnumHelper.addToolMaterial("Tool Material", 4, 4000, 10, 1.0F, 32);
	public static ToolMaterial combatMaterial = EnumHelper.addToolMaterial("Combat Material", 4, 4000, 10, 8.0F, 32);
	public static Item crystalPickaxe = new CrystalPickaxe(toolMaterial).setUnlocalizedName("CrystalPickaxe");
	public static Item stoneHammer = new StoneHammer().setUnlocalizedName("StoneHammer");
	public static Item chisel = new Chisel().setUnlocalizedName("Chisel");
	public static Item crystalSword = new CrystalSword(combatMaterial).setUnlocalizedName("CrystalSword");
	public static Item crystalShovel = new CrystalShovel(toolMaterial).setUnlocalizedName("CrystalShovel");
	public static Item crystalAxe = new CrystalAxe(toolMaterial).setUnlocalizedName("CrystalAxe");
	
	public static Block crystalBlock = new CrystalBlock(Material.rock).setBlockName("CrystalBlock");
	
	public static Item crystal = new Crystal().setUnlocalizedName("Crystal");
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		
		GameRegistry.registerItem(crystalPickaxe, "Crystal Pickaxe");
		GameRegistry.registerItem(crystalShovel, "Crystal Shovel");
		GameRegistry.registerItem(crystalAxe, "Crystal Axe");
		GameRegistry.registerItem(stoneHammer, "Stone Hammer");
		GameRegistry.registerItem(crystalSword, "Crystal Sword");
		GameRegistry.registerItem(crystal, "Crystal");
		GameRegistry.registerItem(chisel, "Chisel");
		
		GameRegistry.registerBlock(crystalBlock, "Crystal Block");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
		GameRegistry.addRecipe(new ItemStack(crystal), new Object[] {
			
			"XXX",
			"YYY",
			"XXX",
			
			'X', Items.iron_ingot, 'Y', Items.gold_ingot
			
		});
		
		GameRegistry.addRecipe(new ItemStack(crystalPickaxe), new Object[] {
			
			"XXX",
			" Y ",
			" Y ",
			
			'X', crystal, 'Y', Items.stick
			
		});
		
		GameRegistry.addRecipe(new ItemStack(crystalAxe), new Object[] {
			
			"XX ",
			"XY ",
			" Y ",
			
			'X', crystal, 'Y', Items.stick
			
		});
		
		GameRegistry.addRecipe(new ItemStack(crystalShovel), new Object[] {
			
			" X ",
			" Y ",
			" Y ",
			
			'X', crystal, 'Y', Items.stick
			
		});
		
		GameRegistry.addRecipe(new ItemStack(stoneHammer), new Object[] {
			
			"XYX",
			"XYX",
			" Y ",
			
			'X',Blocks.cobblestone, 'Y', Items.stick
			
		});
		
		GameRegistry.addRecipe(new ItemStack(crystalBlock), new Object[] {
			
			"XXX",
			"XXX",
			"XXX",
			
			'X', crystal
			
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.saddle), new Object[] {
			
			" X ",
			"YXY",
			" X ",
			
			'X', Items.leather, 'Y', Items.iron_ingot
			
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(crystal, 9), new ItemStack(crystalBlock));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 1), new ItemStack(stoneHammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.stone));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 1), new ItemStack(chisel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.cobblestone));
		
		
	}
	
}
