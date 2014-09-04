package com.stmacl.destinymod;

<<<<<<< HEAD
import com.stmacl.destinymod.Handler.ConfigurationHandler;
import com.stmacl.destinymod.proxy.IProxy;
import com.stmacl.destinymod.reference.Reference;
import com.stmacl.destinymod.utility.LogHelper;
=======
import com.stmacl.destinymod.proxy.IProxy;
>>>>>>> parent of 63561da... Config Creation

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

<<<<<<< HEAD
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class DestinyMod {
	@Mod.Instance(Reference.MOD_ID)
	public static DestinyMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
=======
@Mod(modid= reference.Reference.MOD_ID, name=reference.Reference.MOD_NAME, version=reference.Reference.VERSION)
public class DestinyMod 
{
	@Mod.Instance("reference.Reference.MOD_ID")
	public static DestinyMod instance;
	
	@SidedProxy(clientSide="com.stmacl.destinymod.proxy.ClientProxy", serverSide= "com.stmacl.destinymod.proxy.ServerProxy")
>>>>>>> parent of 63561da... Config Creation
	public static IProxy proxy;

	@Mod.EventHandler
<<<<<<< HEAD
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		LogHelper.info("Pre Initialization Complete!");
=======
	public void preInit(FMLPreInitializationEvent event)
	{
	
>>>>>>> parent of 63561da... Config Creation
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		LogHelper.info("Initialization Complete!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("Post Initialization Complete!");
	}

}