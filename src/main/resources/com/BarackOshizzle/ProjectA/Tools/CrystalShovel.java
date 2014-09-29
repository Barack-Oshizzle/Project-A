package com.BarackOshizzle.ProjectA.Tools;

import com.BarackOshizzle.ProjectA.Project_A;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class CrystalShovel extends ItemSpade{

	public CrystalShovel(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		setTextureName("project_a:crystalShovel");
		setCreativeTab(Project_A.projectATab);
	}

}
