package com.zhigalov.game.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.zhigalov.game.InputHandler;

public class Button {
    private static final float BUTTON_WIGTH = 170;
    private static final float BUTTON_HEIGHT = 619;

    private Texture key;
    private Texture keyPressed;
    private Sound sound;
    private Vector2 position;
    private final Sprite sprite;
    private Rectangle border;

    public Button(String keyName, String soundName, float x, float y) {
        this.key = new Texture(keyName + ".png");
        keyPressed = new Texture(keyName + "w" + ".png");
        this.sprite = new Sprite(key);
        this.sound = Gdx.audio.newSound(Gdx.files.internal(soundName));
        this.position = new Vector2(x,y);
        this.border = new Rectangle(position.x, position.y, BUTTON_WIGTH, BUTTON_HEIGHT);
    }

    public void render(SpriteBatch batch) {
        batch.draw(sprite, position.x, position.y, sprite.getWidth(), sprite.getHeight());
    }

    public void pressBtn(){
//        position.add(1,-1);
        sprite.setTexture(keyPressed);
        sound.play();
    }

    public void stayActive(){
        sprite.setTexture(key);

    }

    public void dispose() {
        key.dispose();
    }

    public Rectangle getBorder() {
        return border;
    }

}
