package com.stmacl.destinymod;

import com.stmacl.destinymod.proxy.IProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= reference.Reference.MOD_ID, name=reference.Reference.MOD_NAME, version=reference.Reference.VERSION)
public class DestinyMod 
{
	@Mod.Instance("reference.Reference.MOD_ID")
	public static DestinyMod instance;
	
	@SidedProxy(clientSide="com.stmacl.destinymod.proxy.ClientProxy", serverSide= "com.stmacl.destinymod.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
	
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}