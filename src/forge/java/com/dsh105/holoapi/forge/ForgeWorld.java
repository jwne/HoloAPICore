package com.dsh105.holoapi.forge;

import com.google.common.base.Preconditions;
import net.minecraft.world.World;

import java.lang.ref.WeakReference;

public class ForgeWorld {

    protected WeakReference<World> handle;

    public ForgeWorld(World world) {
        Preconditions.checkNotNull(world);

        this.handle = new WeakReference<World>(world);
    }
}
