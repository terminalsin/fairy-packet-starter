package org.fairy.packet.wrapper.client;

public interface CPacketPositionRotation extends CPacketPosition, CPacketRotation {
    @Override
    default String getFancyName() {
        return "PositionRotation";
    }
}
