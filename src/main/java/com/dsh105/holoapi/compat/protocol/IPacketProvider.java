package com.dsh105.holoapi.compat.protocol;

public interface IPacketProvider {

    public AbstractPacket getSpawnEntityPacket();

    public AbstractPacket getEntityLivingSpawnPacket();

    public AbstractPacket getMetadataPacket();

    public AbstractPacket getAttachPacket();

    public AbstractPacket getTeleportPacket();

    public AbstractPacket getChatPacket();

}
