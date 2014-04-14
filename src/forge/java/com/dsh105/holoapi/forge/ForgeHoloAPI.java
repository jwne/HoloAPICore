package com.dsh105.holoapi.forge;

import com.dsh105.holoapi.compat.ServerPlatform;
import com.dsh105.holoapi.forge.proxy.CommonProxy;
import com.dsh105.holoapi.forge.references.Reference;
import com.google.common.base.Preconditions;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.CommandEvent;

import java.io.File;
import java.util.logging.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ForgeHoloAPI {

    public static final Logger LOGGER = Logger.getLogger(ForgeHoloAPI.class.getCanonicalName());

    protected File dataFolder;
    protected ServerPlatform serverPlatform;

    @Mod.Instance(Reference.MOD_ID)
    protected static ForgeHoloAPI core;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
    protected static CommonProxy commonProxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // load configs etc...
        LOGGER.info("Starting HoloAPI " + getVersion());
        LOGGER.info("Copyright (c) DSH105, CaptainBern");
        LOGGER.info("Authors: DSH105, CaptainBern, Frostalf");

        this.dataFolder = new File(event.getModConfigurationDirectory() + File.separator + "HoloAPI");
        this.dataFolder.mkdir();

        core = this;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // load GUI's etc...
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // load possible addons
    }

    @Mod.EventHandler
    public void onServerStart(FMLServerStartingEvent event) {

    }

    @Mod.EventHandler
    public void onSerevrStop(FMLServerStoppingEvent event) {

    }

    @SubscribeEvent
    public void onCommand(CommandEvent event) {
       // Handle commands
    }

    public ForgePlayer getPlayer(EntityPlayerMP playerMP) {
        Preconditions.checkNotNull(playerMP);
        return null;
    }

    public ServerPlatform getServerPlatform() {
        return this.serverPlatform;
    }

    public File getDataFolder() {
        return this.dataFolder;
    }

    public String getVersion() {
        return this.getClass().getAnnotation(Mod.class).version();
    }
}
