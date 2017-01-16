package org.academniadecodigo.dancedance.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academniadecodigo.dancedance.simplegfx.StageSgfx;

/**
 * Created by codecadet on 24/10/16.
 */
public class FxEffects {

    private Picture combo;
    private Picture wrongKey;

    public FxEffects(){
        combo = new Picture(StageSgfx.PADDING,StageSgfx.PADDING, "resources/art/COMBO_.png");
        wrongKey = new Picture(StageSgfx.PADDING,StageSgfx.PADDING, "resources/art/WRONG_KEY_1.png");
    }


    public void showCombo(){
        combo.draw();
    }
    public void showWrongKey(){
        wrongKey.draw();
    }

    public void deleteEffects(){
        combo.delete();
        wrongKey.delete();
    }
}
