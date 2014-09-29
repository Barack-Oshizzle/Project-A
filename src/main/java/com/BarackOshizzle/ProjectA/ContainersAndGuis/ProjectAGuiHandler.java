package com.BarackOshizzle.ProjectA.ContainersAndGuis;

import com.BarackOshizzle.ProjectA.BlocksAndTileEntities.StorageTileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class ProjectAGuiHandler implements IGuiHandler{

	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		switch(id)
		{
			case 0:
				if(entity != null && entity instanceof StorageTileEntity)
				{
					return new StorageContainer((StorageTileEntity)entity, player.inventory);
				}
		}
		
		return null;
	}
	
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		switch(id)
		{
			case 0:
				if(entity != null && entity instanceof StorageTileEntity)
				{
					return new StorageGui((StorageTileEntity)entity, player.inventory);
				}
		}
		
		return null;
	}

}
