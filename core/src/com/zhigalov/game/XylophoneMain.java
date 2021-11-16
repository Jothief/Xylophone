package com.zhigalov.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.audio.Music;
//import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.zhigalov.game.states.GameStateManager;
import com.zhigalov.game.states.MenuState;

public class XylophoneMain extends ApplicationAdapter {
	public static final int WIDTH = 1618;
	public static final int HEIGHT = 809;

	public static final String TITLE = "Ксилофон";

	private GameStateManager game;
	SpriteBatch batch;
//	Texture img;

//	private Music music;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		game = new GameStateManager();
//		music = Gdx.audio.newMusic(Gdx.files.internal("sweep.wav"));
//		music.setVolume(0.3f);
//		music.play();
		game.push(new MenuState(game));
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		game.update(Gdx.graphics.getDeltaTime());
		game.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
//		img.dispose();
//		music.dispose();
	}
}
