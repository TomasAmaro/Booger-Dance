package org.academniadecodigo.dancedance.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academniadecodigo.dancedance.simplegfx.StageSgfx;

/**
 * Created by codecadet on 22/10/16.
 */
public class Background {

    private Picture background;

    public Background(){

        background = new Picture(StageSgfx.PADDING,StageSgfx.PADDING, "resources/art/stage.png");
    }

    public void showBackground(){
        background.draw();
    }
}
