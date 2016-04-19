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
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Rectangle;
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
    private int player1Score, player2Score;
    private ShapeRenderer rend;
    private SpriteBatch batch;
    
    BitmapFont font;
    
    public WorldRenderer(Ball ball, Paddle player1, Paddle player2, int player1Score, int player2Score) {
        this.ball = ball;
        this.player1 = player1;
        this.player2 = player2;
        rend  = new ShapeRenderer();
        font = new BitmapFont();
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        batch = new SpriteBatch();
    }

    public void render(float delta, int player1Score, int player2Score) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        rend.begin(ShapeType.Filled);
        batch.begin();
        rend.setColor(Color.WHITE);
        rend.rect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
        rend.rect(player1.getX(), player1.getY(), player1.getWidth(), player1.getHeight());
        rend.rect(player2.getX(), player2.getY(), player2.getWidth(), player2.getHeight());
        font.draw(batch, player1Score + "", Gdx.graphics.getWidth()/2 - 50, Gdx.graphics.getHeight() - 50);
        font.draw(batch, player2Score + "", Gdx.graphics.getWidth()/2 + 50, Gdx.graphics.getHeight() - 50);
        batch.end();
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

    @Override
    public void render(float delta) {
    }
}
