package com.dsh105.holoapi.forge;

import com.dsh105.holoapi.compat.entity.AbstractPlayer;
import com.dsh105.holoapi.compat.world.AbstractWorld;
import com.dsh105.holoapi.compat.world.Location;
import com.google.common.base.Preconditions;
import net.minecraft.entity.player.EntityPlayerMP;

public class ForgePlayer implements AbstractPlayer<EntityPlayerMP> {

    protected EntityPlayerMP player;

    public ForgePlayer(EntityPlayerMP playerMP) {
        Preconditions.checkNotNull(playerMP);

        this.player = playerMP;
    }

    @Override
    public EntityPlayerMP getHandle() {
        return this.player;
    }

    @Override
    public String getName() {
        return this.player.getDisplayName();
    }

    @Override
    public String getUUID() {
        return null;
    }

    @Override
    public AbstractWorld getWorld() {
        return null;
    }

    @Override
    public Location getLocation() {
        return null;
    }
}
