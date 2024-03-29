package com.battleship.game;

import Utility.Constrain;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.battleship.game.MyGdxGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setWindowedMode(Constrain.WIDTH, Constrain.HEIGHT);
		config.setTitle("Battleship");
		new Lwjgl3Application(new MyGdxGame(), config);
	}
}
//Hello

//Hi