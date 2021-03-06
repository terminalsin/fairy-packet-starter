package org.fairy.packet.packetevents.netty;

import io.netty.buffer.ByteBuf;

public class PacketEventsBuffer implements org.fairy.packet.bytebuf.ByteBuf {
    private final ByteBuf byteBuf;

    public PacketEventsBuffer(ByteBuf byteBuf) {
        this.byteBuf = byteBuf;
    }

    @Override
    public int getSize() {
        return byteBuf.readableBytes();
    }

    @Override
    public byte[] getData() {
        byte[] bytes = new byte[byteBuf.readableBytes()];
        int readerIndex = byteBuf.readerIndex();
        byteBuf.getBytes(readerIndex, bytes);

        return bytes;
    }

    @Override
    public int getReferenceCount() {
        return byteBuf.refCnt();
    }

    @Override
    public boolean isReadable() {
        return byteBuf.isReadable();
    }

    @Override
    public boolean isWriteable() {
        return byteBuf.isWritable();
    }

    @Override
    public int getReaderIndex() {
        return byteBuf.readerIndex();
    }

    @Override
    public void release() {
        byteBuf.release();
    }

    @Override
    public void clear() {
        byteBuf.clear();
    }
}
