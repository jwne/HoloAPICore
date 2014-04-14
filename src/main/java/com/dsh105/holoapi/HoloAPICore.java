package com.dsh105.holoapi;

import com.dsh105.holoapi.compat.ServerPlatform;
import com.google.common.base.Preconditions;

import java.util.logging.Logger;

public class HoloAPICore {

    public static final Logger LOGGER = Logger.getLogger(HoloAPICore.class.getCanonicalName());

    protected ServerPlatform serverPlatform;

    public HoloAPICore(ServerPlatform serverPlatform) {
        Preconditions.checkNotNull(serverPlatform);

        this.serverPlatform = serverPlatform;
    }
}
