package org.academniadecodigo.dancedance.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import org.academniadecodigo.dancedance.simplegfx.StageSgfx;

/**
 * Created by codecadet on 20/10/16.
 */
public class Arrow {

    private Picture leftArrow;
    private Picture rightArrow;
    private Picture upArrow;
    private Picture downArrow;

    public Arrow() {

        leftArrow = new Picture(StageSgfx.PADDING, StageSgfx.PADDING, "resources/art/ARROW_LEFT_.png");
        rightArrow = new Picture(StageSgfx.PADDING, StageSgfx.PADDING, "resources/art/ARROW_RIGHT_.png");
        upArrow = new Picture(StageSgfx.PADDING, StageSgfx.PADDING, "resources/art/ARROW_UP_.png");
        downArrow = new Picture(StageSgfx.PADDING, StageSgfx.PADDING, "resources/art/ARROW_DOWN_.png");
    }

    public void showLeftArrow() {
        leftArrow.draw();
    }

    public void hideLeftArrow() {
        leftArrow.delete();
    }


    public void showRightArrow() {
        rightArrow.draw();
    }

    public void hideRightArrow() {
        rightArrow.delete();
    }


    public void showUpArrow() {
        upArrow.draw();
    }

    public void hideUpArrow() {
        upArrow.delete();
    }


    public void showDownArrow() {
        downArrow.draw();
    }

    public void hideDownArrow() {
        downArrow.delete();
    }

}