/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pong.game;

import com.badlogic.gdx.Gdx;
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

    private int player1Score;
    private int player2Score;

    boolean gameOver;

    public MainGame() {
        ball = new Ball();
        player1 = new Paddle(10, Gdx.graphics.getHeight() / 2);
        player2 = new Paddle(Gdx.graphics.getWidth() - 30, Gdx.graphics.getHeight() / 2);
        renderer = new WorldRenderer(ball, player1, player2);
        gameOver = false;
    }

    @Override
    public void render(float delta) {
        renderer.render(delta);

        if (!gameOver) {
            paddleLogic();
            ballLogic();

            if (ball.getRect().overlaps(player1.getRect())) {
                //if ball hits player 1
                ball.changeHState();
                //if the ball touches the upper half of the paddle
                if(ball.getY() >= player1.getY() + (player1.getHeight() / 2)) {
                    ball.changeVState(UP);
                } else {
                    ball.changeVState(DOWN);
                }
            } else if (ball.getRect().overlaps(player2.getRect())) {
                //if ball hits player 2
                ball.changeHState();
                //if the ball touches the upper half of the paddle
                if(ball.getY() >= player2.getY() + (player2.getHeight() / 2)) {
                    ball.changeVState(UP);
                } else {
                    ball.changeVState(DOWN);
                }
            }
        }
    }

    public void paddleLogic() {
        //player 1 movement
        if (Gdx.input.isKeyPressed(Keys.W)) {
            //move player 1 up
            player1.moveUp(5);
        } else if (Gdx.input.isKeyPressed(Keys.S)) {
            //move player 1 down
            player1.moveDown(5);
        }

        //player 2 movement
        if (Gdx.input.isKeyPressed(Keys.UP)) {
            //move player 2 up
            player2.moveUp(5);
        } else if (Gdx.input.isKeyPressed(Keys.DOWN)) {
            //move player 2 down
            player2.moveDown(5);
        }
    }

    public void ballLogic() {
        if(ball.getX() == Gdx.graphics.getHeight()) {
            ball.changeVState();
        } else if (ball.getX() + ball.getHeight() == 0) {
            ball.changeVState();
        }
        
        if (ball.getHState() == LEFT) {
            //if ball goes left
            ball.moveLeft(10);
        } else if (ball.getHState() == RIGHT) {
            //if ball goes right
            ball.moveRight(10);
        }

        if (ball.getVState() == UP) {
            //if ball goes up
            ball.moveUp(8);
        } else if (ball.getVState() == DOWN) {
            //if ball goes down
            ball.moveDown(8);
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
