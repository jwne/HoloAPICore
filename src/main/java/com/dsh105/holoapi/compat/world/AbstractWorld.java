package com.dsh105.holoapi.compat.world;

import com.dsh105.holoapi.compat.entity.AbstractPlayer;

import java.util.List;

public abstract class AbstractWorld<T> {

    public abstract List<AbstractPlayer> getPlayers();
}
