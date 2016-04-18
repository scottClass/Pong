package com.pong.game;

import com.badlogic.gdx.Game;

public class Pong extends Game {

    @Override
    public void create() {
        setScreen(new MainGame());
    }

}
