package com.BarackOshizzle.ProjectA.ContainersAndGuis;

import org.lwjgl.opengl.GL11;

import com.BarackOshizzle.ProjectA.BlocksAndTileEntities.StorageTileEntity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class StorageGui extends GuiContainer{
	
	private static final ResourceLocation bgImage = new ResourceLocation("project_a", "textures/gui/storageUnit.png"); 
	
	public StorageGui(StorageTileEntity entity, InventoryPlayer inv)
	{
		super(new StorageContainer(entity, inv));
		
		xSize = 175;
		ySize = 209;
	}
	
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		
		Minecraft.getMinecraft().renderEngine.bindTexture(bgImage);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

}
