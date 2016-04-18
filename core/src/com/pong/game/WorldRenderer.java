/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pong.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.pong.elements.Ball;
import com.pong.elements.Paddle;

/**
 *
 * @author scott
 */
public class WorldRenderer implements Screen {
    
    private Ball ball;
    private Paddle player1;
    private Paddle player2;
    
    ShapeRenderer rend;
    
    public WorldRenderer(Ball ball, Paddle player1, Paddle player2) {
        this.ball = ball;
        this.player1 = player1;
        this.player2 = player2;
        rend  = new ShapeRenderer();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        rend.begin(ShapeType.Filled);
        rend.setColor(Color.WHITE);
        rend.rect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
        rend.rect(player1.getX(), player1.getY(), player1.getWidth(), player1.getHeight());
        rend.rect(player2.getX(), player2.getY(), player2.getWidth(), player2.getHeight());
        rend.end();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }
    
    @Override
    public void show() {
    }
}
