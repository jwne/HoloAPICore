package com.dsh105.holoapi.compat.protocol;

public interface IPacketProvider {

    public Class getSpawnEntityPacket();

    public Class getEntityLivingSpawnPacket();

    public Class getMetadataPacket();

    public Class getAttachPacket();

    public Class getTeleportPacket();

    public Class getChatPacket();

}
