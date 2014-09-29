package com.BarackOshizzle.ProjectA.BlocksAndTileEntities;

import java.util.Random;

import com.BarackOshizzle.ProjectA.Project_A;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class StorageUnitBlock extends Block implements ITileEntityProvider{
	
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int p_149691_2_) {
		return side == 1 ? this.top : (side == 2 || side == 0 ? this.front : this.blockIcon);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
	this.blockIcon = p_149651_1_.registerIcon("project_a:storageUnitSide");
	this.top = p_149651_1_.registerIcon("project_a:storageUnitTop");
	this.front = p_149651_1_.registerIcon("project_a:storageUnitSide");
	}
	
	public StorageUnitBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(Project_A.projectATab);
		setLightLevel(4.0F);
		setHardness(2.0F);
	}
	
	public TileEntity createNewTileEntity(World world, int i)
	{
		return new StorageTileEntity();
	}
	
	public boolean hasTileEntity(int metadata)
	{
		return true;
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{
		if(!world.isRemote)
		{
			FMLNetworkHandler.openGui(player, Project_A.instance, 0, world, x, y, z);
		}
		
		return true;
	}
}
