package com.BarackOshizzle.ProjectA.Tools;

import com.BarackOshizzle.ProjectA.Project_A;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class StoneHammer extends Item{

	public StoneHammer() {
		setTextureName("project_a:stoneHammer");
		setCreativeTab(Project_A.projectATab);
		setContainerItem(this);
		setMaxDamage(131);
		
	}

	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
	{
		return false;
	}
	
	@Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);
        stack.stackSize = 1;

        return stack;
    }
   

}
