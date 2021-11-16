//package com.zhigalov.game.states;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.Texture;
////import com.badlogic.gdx.graphics.FPSLogger;
//import com.badlogic.gdx.graphics.g2d.*;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//import com.badlogic.gdx.scenes.scene2d.ui.*;
//import com.badlogic.gdx.utils.viewport.StretchViewport;
//import com.zhigalov.game.XylophoneMain;
//import com.zhigalov.game.SongController;
//import com.zhigalov.game.sprites.ButtonMenu;
//import com.zhigalov.game.sprites.Tile;
//
//public class ChangeSongState extends State {
//
//    private Texture background;
//
//    private static ScrollPane scrollPane;
//    private ButtonMenu selectBtn;
//    private static List<String> list;
//    private static Skin skin;
//    private static String selectedSong;
//    TextureAtlas atlas;
//    private static Stage stage;
////    FPSLogger test;
//
//    public ChangeSongState(GameStateManager game) {
//        super(game);
//        background = new Texture("bg_2.png");
//        selectBtn = new ButtonMenu("select2.png", XylophoneMain.WIDTH - 205 , XylophoneMain.HEIGHT - 55);
//
//        atlas = new TextureAtlas(Gdx.files.internal("OS Eight.atlas"));  //"uiskin.atlas"
//        skin = new Skin(Gdx.files.internal("OS Eight.json"), atlas); //"SimpleSkin.json"
//        SongController.init();
//
//        list = new List<>(skin);
//        list.setItems(SongController.getSongList());
//
//        stage = new Stage(new StretchViewport(XylophoneMain.WIDTH, XylophoneMain.HEIGHT));
//        addScrollPaneToStage();
////        test = new FPSLogger();
//    }
//
//    @Override
//    protected void handleInput() {
//        if (Gdx.input.justTouched()) {
//            if (selectBtn.getButtonBounds().contains(Gdx.input.getX(),Gdx.graphics.getHeight() - Gdx.input.getY())){
//                selectedSong = list.getSelected();
//                System.out.println(selectedSong);
//                game.push(new PlayState(game));
//            }
//        }
//    }
//
//    @Override
//    public void update(float dt) {
//        //Очистка экрана
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        handleInput();
//        stage.getBatch().begin();
//        stage.getBatch().draw(background, 0, 0, XylophoneMain.WIDTH, XylophoneMain.HEIGHT);
//        stage.getBatch().end();
//        stage.act(dt);
////        test.log();
//        stage.draw();
//    }
//
//    @Override
//    public void render(SpriteBatch sb) {
//        sb.begin();
//        selectBtn.render(sb);
//        sb.end();
//    }
//
//    @Override
//    public void dispose() {
//        stage.dispose();
//        background.dispose();
//        atlas.dispose();
//        skin.dispose();
//        selectBtn.dispose();
//    }
//
//    private static void addScrollPaneToStage(){
//        scrollPane = new ScrollPane(list, skin);
//        scrollPane.setBounds(0, 0, 470, 740);
//        scrollPane.setPosition(10, 0);
//        scrollPane.setTransform(true);
//        scrollPane.layout();
//        scrollPane.setFadeScrollBars(false);
//        scrollPane.setScrollingDisabled(true, false);
//        scrollPane.setScale(1f);
//        stage.addActor(scrollPane);
//        Gdx.input.setInputProcessor(stage);
//    }
//
//    public static String getSelectedSong() {
//        return selectedSong;
//    }
//}
//
