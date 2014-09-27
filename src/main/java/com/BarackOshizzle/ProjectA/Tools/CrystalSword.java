package com.BarackOshizzle.ProjectA.Tools;

import com.BarackOshizzle.ProjectA.Project_A;

import net.minecraft.item.ItemSword;

public class CrystalSword extends ItemSword{

	public CrystalSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		setTextureName("project_a:crystalSword");
		setCreativeTab(Project_A.projectATab);
	}

}
