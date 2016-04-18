/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pong.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.pong.elements.Ball;
import static com.pong.elements.Ball.HState.LEFT;
import static com.pong.elements.Ball.HState.RIGHT;
import static com.pong.elements.Ball.VState.DOWN;
import static com.pong.elements.Ball.VState.UP;
import com.pong.elements.Paddle;

/**
 *
 * @author scott
 */
public class MainGame implements Screen {

    private WorldRenderer renderer;
    private Ball ball;

    private Paddle player1;
    private Paddle player2;

    boolean gameOver;

    public MainGame() {
        ball = new Ball();
        player1 = new Paddle(10, Gdx.graphics.getHeight() / 2);
        player2 = new Paddle(Gdx.graphics.getWidth() - 40, Gdx.graphics.getHeight() / 2);
        renderer = new WorldRenderer(ball, player1, player2);
        gameOver = false;
    }

    @Override
    public void render(float delta) {
        renderer.render(delta);

        if (!gameOver) {
            //player 1 movement
            if (Gdx.input.isKeyPressed(Keys.W)) {
                //move player 1 up
            } else if (Gdx.input.isKeyPressed(Keys.S)) {
                //move player 1 down
            }

            //player 2 movement
            if (Gdx.input.isKeyPressed(Keys.UP)) {
                //move player 2 up
            } else if (Gdx.input.isKeyPressed(Keys.DOWN)) {
                //move player 2 down
            }

            if (ball.getHState() == LEFT) {
                //if ball goes left
            } else if (ball.getHState() == RIGHT) {
                //if ball goes right
            }

            if (ball.getVState() == UP) {
                //if ball goes up
            } else if (ball.getVState() == DOWN) {
                //if ball goes down
            }

            if (ball.getRect().overlaps(player1.getRect())) {
                //if ball hits player 1
            } else if (ball.getRect().overlaps(player2.getRect())) {
                //if ball hits player 2
            }
        }
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
