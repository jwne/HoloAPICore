package com.dsh105.holoapi.forge;

import com.google.common.base.Preconditions;

public class ForgePacketStore {

    protected ForgeHoloAPI forgeHoloAPI;

    public ForgePacketStore(ForgeHoloAPI forgeHoloAPI) {
        Preconditions.checkNotNull(forgeHoloAPI);

        this.forgeHoloAPI = forgeHoloAPI;
    }
}
