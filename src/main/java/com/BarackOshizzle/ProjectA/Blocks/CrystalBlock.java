package com.BarackOshizzle.ProjectA.Blocks;

import java.util.Random;

import com.BarackOshizzle.ProjectA.Project_A;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class CrystalBlock extends Block {

	public CrystalBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(Project_A.projectATab);
		setBlockTextureName("project_a:crystalBlock");
		setLightLevel(4.0F);
		setHardness(2.0F);
		
		
	}
	
}
