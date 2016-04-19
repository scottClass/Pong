/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pong.elements;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import static com.pong.elements.Ball.HState.LEFT;
import static com.pong.elements.Ball.HState.RIGHT;
import static com.pong.elements.Ball.VState.DOWN;
import static com.pong.elements.Ball.VState.UP;

/**
 *
 * @author scott
 */
public class Ball {
    
    private Rectangle rect;
    private HState currentHState;
    private VState currentVState;
    
    public enum HState {
        LEFT, RIGHT
    }
    
    public enum VState {
        UP, DOWN
    }
    
    public Ball() {
        rect = new Rectangle(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, 10, 10);
        currentHState = LEFT;
    }
    
    public HState getHState () {
        return currentHState;
    }
    
    public VState getVState () {
       return currentVState; 
    }
    
    public void changeHState () {
        if(currentHState == LEFT) {
            currentHState = RIGHT;
        } else {
            currentHState = LEFT;
        }
    }
    
    public void changeHState (HState state) {
        currentHState = state;
    }
    
    public void changeVState (VState state) {
        currentVState = state;
    }
    
    public void changeVState () {
        if(currentVState == UP) {
            currentVState = DOWN;
        } else {
            currentVState = UP;
        }
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
    
    public float getWidth () {
        return rect.width;
    }
    
    public float getHeight () {
        return rect.height;
    }
    
    public void moveUp(float y) {
        rect.y += y;
    }

    public void moveDown(float y) {
        rect.y -= y;
    }
    
    public void moveLeft(float x) {
        rect.x -= x;
    }

    public void moveRight(float x) {
        rect.x += x;
    }
}
