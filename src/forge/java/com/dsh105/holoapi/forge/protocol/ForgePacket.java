package com.dsh105.holoapi.forge.protocol;

import com.dsh105.holoapi.compat.protocol.AbstractPacket;
import net.minecraft.network.Packet;

public class ForgePacket extends AbstractPacket<Packet> {

    @Override
    public Packet getHandle() {
        return null;
    }
}
