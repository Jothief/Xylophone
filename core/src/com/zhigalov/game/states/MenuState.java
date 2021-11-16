package com.zhigalov.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zhigalov.game.InputHandler;
import com.zhigalov.game.XylophoneMain;

public class MenuState extends AbstractState {
    private Texture background;
    private Texture startBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        startBtn = new Texture("startBtn.png");
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, XylophoneMain.WIDTH, XylophoneMain.HEIGHT);
        sb.draw(startBtn, Gdx.graphics.getWidth()/2 - startBtn.getWidth()/2, Gdx.graphics.getHeight()/2 - startBtn.getHeight()/2);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        startBtn.dispose();
    }

    private void handleInput(){
        if (InputHandler.isClicked()){
            gsm.set(new PlayState(gsm));
        }
    }
}
