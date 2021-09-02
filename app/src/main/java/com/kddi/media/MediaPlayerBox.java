package com.kddi.media;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public class MediaPlayerBox extends Canvas implements MediaPlayerInterface {

    public MediaPlayerBox() {
        super();
    }

    public MediaPlayerBox(int flag) {
        super();
    }

    public MediaPlayerBox(MediaResource resource, int flag) {
        super();
    }

    @Override
    public void addMediaEventListener(MediaEventListener l) {

    }

    @Override
    public int getAttribute(int attr) {
        return 0;
    }

    @Override
    public int getPitch() {
        return 0;
    }

    @Override
    public MediaResource getResource() {
        return null;
    }

    @Override
    public int getTempo() {
        return 0;
    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void play() {

    }

    @Override
    public void play(int count) {

    }

    @Override
    public void removeMediaEventListener(MediaEventListener l) {

    }

    @Override
    public void resume() {

    }

    @Override
    public void setAttribute(int attr, int value) {

    }

    @Override
    public void setPitch(int pitch) {

    }

    @Override
    public void setResource(MediaResource resource) {

    }

    @Override
    public void setTemp(int tempo) {

    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void show() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void unsetResource(MediaResource resource) {

    }

    @Override
    protected void paint(Graphics g) {

    }
}
