package org.academniadecodigo.dancedance.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academniadecodigo.dancedance.simplegfx.StageSgfx;

/**
 * Created by codecadet on 23/10/16.
 */
public class Animations {

    private Picture startFirstFrame = new Picture(StageSgfx.PADDING, StageSgfx.PADDING, "resources/art/START_ANIMATION/START_ANIMATION_0.png");
    private Picture endFirstFrame = new Picture(StageSgfx.PADDING, StageSgfx.PADDING, "resources/art/3D Character Movements/YOU_LOSE/YOU_LOSE_0.png");




    public void startAnimation() throws InterruptedException {   // TODO por adaptar às animacoes

        startFirstFrame.draw();
        for (int i = 0; i < 152; i++) {
            Thread.sleep(StageSgfx.ANIMATION_SLEEP);
            startFirstFrame.load("resources/art/START_ANIMATION/START_ANIMATION_"+i+".png");
        }
        startFirstFrame.delete();
    }

    public void hideStartAnimation() {
        startFirstFrame.delete();
    }



    public void youLoseAnimation() throws InterruptedException {

        endFirstFrame.draw();
        for (int i = 0; i < 79; i++) {
            Thread.sleep(StageSgfx.ANIMATION_SLEEP);
            endFirstFrame.load("resources/art/3D Character Movements/YOU_LOSE/YOU_LOSE_" + i + ".png");
        }
        endFirstFrame.load("resources/art/START_ANIMATION/START_ANIMATION_150.png");
    }

    public void hideLoseAnimation() {
        endFirstFrame.delete();
    }

}
