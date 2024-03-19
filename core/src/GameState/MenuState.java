package GameState;

import Utility.Constrain;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import Utility.HUD;


public class MenuState extends State  {
    private Texture background;
    private Texture playButton;
    private Texture exitButton;
    private HUD hud;
    public MenuState(StateManager stateManager) {
        super(stateManager);
        background = new Texture("backgr/background2.jpg");
        playButton = new Texture("backgr/playbtn2.png");
        exitButton = new Texture("backgr/exitbtn.png");
        menuCamera.setToOrtho(false, Constrain.CAMERA_WIDTH, Constrain.CAMERA_HEIGHT);

    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()||Gdx.input.isKeyJustPressed(62)) {

        }
    }

    @Override
    public void update(float deltaTime) {
        camera.update();
        handleInput();
    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.setProjectionMatrix(menuCamera.combined);
        spriteBatch.begin();
        spriteBatch.draw(background, 0, 0, Constrain.WIDTH, Constrain.HEIGHT);
        spriteBatch.draw(playButton, 100, 250);
        spriteBatch.draw(exitButton, 100, 200);
        spriteBatch.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playButton.dispose();
    }
}
