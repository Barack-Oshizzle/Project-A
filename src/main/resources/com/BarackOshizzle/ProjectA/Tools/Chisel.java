package com.BarackOshizzle.ProjectA.Tools;

import com.BarackOshizzle.ProjectA.Project_A;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Chisel extends Item {
	
	public Chisel() {
		setTextureName("project_a:chisel");
		setCreativeTab(Project_A.projectATab);
		setContainerItem(this);
		setMaxDamage(250);
		setMaxStackSize(1);
	}
	
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack){
		return false;
	}
	
	@Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);
        stack.stackSize = 1;

        return stack;
    }

}
