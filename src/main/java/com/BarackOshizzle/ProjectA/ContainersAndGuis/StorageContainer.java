package com.BarackOshizzle.ProjectA.ContainersAndGuis;

import com.BarackOshizzle.ProjectA.BlocksAndTileEntities.StorageTileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class StorageContainer extends Container {

private final StorageTileEntity tesf;
	
	public StorageContainer(StorageTileEntity tesf, InventoryPlayer inv)
	{
		this.tesf = tesf;
		
		// player inv
		for(int j = 0; j < 3; j++)
		{
			for(int i = 0; i < 9; i++)
			{
				addSlotToContainer(new Slot(inv, 9 + i + j * 9, 8 + i * 18, 128 + j * 18));
			}
		}
		
		/// player hotbar
		for(int i = 0; i < 9; i++)
		{
			addSlotToContainer(new Slot(inv, i, 8 + i * 18, 186));
		}
		
		
		// forge crafting slots
		for(int j = 0; j < 6; j++)
		{
			for(int i = 0; i < 6; i++)
			{
				addSlotToContainer(new Slot(tesf, i + j * 6, 30 + i * 18, 17 + j * 18));
			}
		}
	}
	
	public boolean canInteractWith(EntityPlayer player)
	{
		return tesf.isUseableByPlayer(player);
	}
	
	public ItemStack transferStackInSlot(EntityPlayer player, int slot)
	{
		return null;
	}

}
