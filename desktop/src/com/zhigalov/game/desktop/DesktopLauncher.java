package com.zhigalov.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.zhigalov.game.XylophoneMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = XylophoneMain.WIDTH;
		config.height = XylophoneMain.HEIGHT;
		config.title = XylophoneMain.TITLE;
		new LwjglApplication(new XylophoneMain(), config);
	}
}
