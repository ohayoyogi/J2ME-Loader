package com.kddi.media;

import org.ohayoyogi.mmfconverter.MMFConverter;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;

public class MediaResource {

    private Player player;
    private String type;


    public Player _getPlayer() {
        // workaround
        return this.player;
    }

    public MediaResource(String url) {
        this.player = null;
    }

    public MediaResource(byte[] resource, String disposition) {
        this.player = null;
        this.type = disposition;
        String mime = null;
        switch(disposition) {
            case "dev4anm":
            case "devmfan":
            case "devm39z":
            case "devm53z":
                mime = "audio/midi";
                try {
                    MMFConverter converter = new MMFConverter();
                    byte[] midiDat = converter.convertToMDI(resource);
                    try (ByteArrayInputStream bis = new ByteArrayInputStream(midiDat)) {
                        player = Manager.createPlayer(bis, mime);
                        player.realize();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (MediaException e) {
                        e.printStackTrace();
                    }
        
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                mime = null;
        }
    }

    public MediaPlayerBox[] getPlayer() {
        return new MediaPlayerBox[]{};
    }

    public String getType() {
        return this.type;
    }

    public void dispose() {
        if (this.player != null) {
            this.player.close();
            this.player = null;    
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
