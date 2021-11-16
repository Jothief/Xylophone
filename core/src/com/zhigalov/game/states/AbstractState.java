package com.zhigalov.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class AbstractState {

    protected GameStateManager gsm;

    public AbstractState(GameStateManager gsm) {
        this.gsm = gsm;
    }

    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();

}
