package com.pong.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.pong.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.title = "Pong";
                config.height = 600;
                config.width = 800;
                config.resizable = false;
                config.addIcon("Icon.png", Files.FileType.Internal);
		new LwjglApplication(new MyGdxGame(), config);
	}
}
