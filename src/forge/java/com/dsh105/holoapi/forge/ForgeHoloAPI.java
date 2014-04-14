package com.dsh105.holoapi.forge;

import com.dsh105.holoapi.compat.ServerPlatform;
import com.dsh105.holoapi.forge.proxy.CommonProxy;
import com.dsh105.holoapi.forge.references.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;

import java.util.logging.Logger;

@Mod(modid = Reference.MOD_ID, name= Reference.MOD_NAME, version = Reference.VERSION)
public class ForgeHoloAPI {

    public static final Logger LOGGER = Logger.getLogger(ForgeHoloAPI.class.getCanonicalName());

    protected ServerPlatform serverPlatform;

    @Mod.Instance
    protected static ForgeHoloAPI core;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
    protected static CommonProxy commonProxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // load configs etc...
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

    public ForgePlayer getPlayer(EntityPlayerMP playerMP) {
        return null;
    }

    public ServerPlatform getServerPlatform() {
        return this.serverPlatform;
    }
}
