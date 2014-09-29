package com.BarackOshizzle.ProjectA.BlocksAndTileEntities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class StorageTileEntity extends TileEntity implements IInventory{
	
	private ItemStack[] contents = new ItemStack[36];
	
	public int getSizeInventory()
	{
		return 36;
	}
	
	public ItemStack getStackInSlot(int slot)
	{
		return contents[slot];
	}
	
	public ItemStack decrStackSize(int slot, int amount)
	{
		if (contents[slot] != null)
		{
			ItemStack stack;
			
			if (contents[slot].stackSize <= amount)
			{
				stack = contents[slot];
				contents[slot] = null;
			}
			else
			{
				stack = contents[slot].splitStack(amount);
				
				if (contents[slot].stackSize == 0)
				{
					contents[slot] = null;
				}
			}
			
			return stack;
		}
		
		return null;
	}
	
	public ItemStack getStackInSlotOnClosing(int slot)
	{
		return contents[slot];
	}
	
	public void setInventorySlotContents(int slot, ItemStack stack)
	{
		contents[slot] = stack;
	}
	
	public String getInventoryName()
	{
		return "container.storageUnit";
	}
	
	public boolean hasCustomInventoryName()
	{
		return true;
	}
	
	public int getInventoryStackLimit()
	{
		return 64;
	}
	
	public boolean isUseableByPlayer(EntityPlayer player)
	{
		return true;
	}
	
	public void openInventory()
	{
		
	}
	
	public void closeInventory()
	{
		
	}
	
	public void readFromNBT(NBTTagCompound tag)
	{
		super.readFromNBT(tag);
		
		NBTTagList list = tag.getTagList("Contents", 10);
		
		for(int i = 0; i < list.tagCount(); i++)
		{
			NBTTagCompound tag1 = list.getCompoundTagAt(i);
			
			contents[(int)tag1.getByte("Slot")] = ItemStack.loadItemStackFromNBT(tag1);
		}
	}
	
	public void writeToNBT(NBTTagCompound tag)
	{
		super.writeToNBT(tag);
		
		NBTTagList list = new NBTTagList();
		
		for(int i = 0; i < 36; i++)
		{
			ItemStack currentContents = contents[i];
			
			if(currentContents != null)
			{
				NBTTagCompound tag1 = new NBTTagCompound();
				tag1.setByte("Slot", (byte)i);
				currentContents.writeToNBT(tag1);
				list.appendTag(tag1);
			}
		}
		
		tag.setTag("Contents", list);
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		return true;
	}
	
}
