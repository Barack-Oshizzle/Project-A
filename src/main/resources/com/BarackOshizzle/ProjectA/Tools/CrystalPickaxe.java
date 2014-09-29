package com.BarackOshizzle.ProjectA.Tools;

import com.BarackOshizzle.ProjectA.Project_A;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class CrystalPickaxe extends ItemPickaxe{

	public CrystalPickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		setTextureName("project_a:crystalPickaxe");
		setCreativeTab(Project_A.projectATab);
	}

}
