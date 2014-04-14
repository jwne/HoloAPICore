package com.dsh105.holoapi.compat.entity;

import com.dsh105.holoapi.compat.world.AbstractWorld;
import com.dsh105.holoapi.compat.world.Location;

public interface AbstractPlayer<T> {

    public T getHandle();

    public String getName();

    public String getUUID();

    public AbstractWorld getWorld();

    public Location getLocation();
}
