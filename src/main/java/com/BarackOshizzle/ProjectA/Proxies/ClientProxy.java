package com.BarackOshizzle.ProjectA.Proxies;

import com.BarackOshizzle.ProjectA.Project_A;
import com.BarackOshizzle.ProjectA.ContainersAndGuis.ProjectAGuiHandler;

import cpw.mods.fml.common.network.NetworkRegistry;


public class ClientProxy extends CommonProxy{
	
	public void registerGuiHandler()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Project_A.instance, new ProjectAGuiHandler());
	}
}
