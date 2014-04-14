package com.dsh105.holoapi.forge;

import com.dsh105.holoapi.compat.ServerPlatform;
import com.google.common.base.Preconditions;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.server.MinecraftServer;

public class ForgeServerPlatform extends ServerPlatform {

    protected ForgeServerPlatform forgeServerPlatform;
    protected MinecraftServer minecraftServer;

    public ForgeServerPlatform(ForgeHoloAPI forgeHoloAPI) {
        Preconditions.checkNotNull(forgeHoloAPI);

        this.forgeServerPlatform = forgeServerPlatform;
        this.minecraftServer = FMLCommonHandler.instance().getMinecraftServerInstance();
    }

    @Override
    public String getName() {
        return "ForgeServer";
    }

    @Override
    public String getVersion() {
        return "Forge";
    }
}
