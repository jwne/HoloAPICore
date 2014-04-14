package com.dsh105.holoapi;

import com.dsh105.holoapi.proxy.CommonProxy;
import com.dsh105.holoapi.references.Reference;
import com.dsh105.holoapi.util.ModLogger;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name= Reference.MOD_NAME, version = Reference.VERSION)
public class ForgeHoloAPI {

    @Mod.Instance
    protected static ForgeHoloAPI core;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
    protected static CommonProxy commonProxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // load configs etc...
        new ModLogger(FMLLog.getLogger());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // load GUI's etc...
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // load possible addons
    }
}
