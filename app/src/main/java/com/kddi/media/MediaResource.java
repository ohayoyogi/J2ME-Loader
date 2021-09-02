package com.kddi.media;

public class MediaResource {
    public MediaResource(String url) {

    }

    public MediaResource(byte[] resource, String disposition) {

    }

    public MediaPlayerBox[] getPlayer() {
        return new MediaPlayerBox[]{};
    }

    public String getType() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
