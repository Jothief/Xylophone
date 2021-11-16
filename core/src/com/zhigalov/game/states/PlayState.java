package com.zhigalov.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.zhigalov.game.InputHandler;
import com.zhigalov.game.XylophoneMain;
import com.zhigalov.game.sprites.Button;

public class PlayState extends AbstractState{
    public static final int BUTTON_COUNT = 8;

    private final Texture background;
    private final Texture bars;
    private final Array<Button> buttons;
//    private Button selectBtn;
    int x = 10;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        bars = new Texture("Bruski.png");
        int pos = 95;
        buttons = new Array<>();
        for(int i = 1; i <= BUTTON_COUNT; i++){
//            buttons.add(new Button(i + ".png", i + ".mp3",x + 10,30));
            buttons.add(new Button(String.valueOf(i), i + ".wav",pos,70));
//            buttons.add(new Button(i + ".png",pos ,-10));
            pos = pos + 180;
        }
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        handleInput();
        sb.draw(background, 0,0, XylophoneMain.WIDTH, XylophoneMain.HEIGHT);
        sb.draw(bars, 0,0, XylophoneMain.WIDTH, XylophoneMain.HEIGHT);
        for(Button button: buttons){
            button.render(sb);
        }
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        for(Button button: buttons){
            button.dispose();
        }
    }

    private void handleInput() {
        for(Button button: buttons){
            if (!button.getBorder().contains(InputHandler.getMousePosition())){
                button.stayActive();
            }

            if(InputHandler.isClicked()){
                if (button.getBorder().contains(Gdx.input.getX(),Gdx.graphics.getHeight() - Gdx.input.getY())){
                    button.pressBtn();
                }
            }
        }
    }
}
