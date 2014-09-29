package com.BarackOshizzle.ProjectA.Proxies;

import com.BarackOshizzle.ProjectA.BlocksAndTileEntities.StorageTileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerTileEntities()
	{
		GameRegistry.registerTileEntity(StorageTileEntity.class, "tileEntityCrystal");
	}
	
	public void registerGuiHandler()
	{
		
	}

}
