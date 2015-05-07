package com.nekokittygames.zmachine.blorb.IFF.Chunks;

import com.google.common.io.CountingInputStream;
import com.nekokittygames.zmachine.blorb.IFF.Chunk;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Created by Katrina on 13/02/2015.
 */
public class OGGVChunk extends Chunk {
    public byte[] sound;

    @Override
    public void Parse(CountingInputStream inStream) throws IOException {
        super.Parse(inStream);
        sound=new byte[getSize()];
        stream.readFully(sound);

    }
}
