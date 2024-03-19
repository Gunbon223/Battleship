package com.battleship.game;

import GameState.MenuState;
import GameState.StateManager;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	private StateManager stateManager;
	private Music music;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		stateManager = new StateManager();
		stateManager.push(new MenuState(stateManager));

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0,1,0,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stateManager.update(Gdx.graphics.getDeltaTime());
		stateManager.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
