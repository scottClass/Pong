/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pong.elements;

import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author scott
 */
public class Paddle {

    private Rectangle rect;

    public Paddle(float x, float y) {
        rect = new Rectangle(x, y, 20, 100);
    }

    public Rectangle getRect() {
        return rect;
    }

    public float getX() {
        return rect.x;
    }

    public float getY() {
        return rect.y;
    }

    public float getWidth() {
        return rect.width;
    }

    public float getHeight() {
        return rect.height;
    }

    public void moveUp(float y) {
        rect.y += y;
    }

    public void moveDown(float y) {
        rect.y -= y;
    }
    
}
