package org.academniadecodigo.dancedance.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academniadecodigo.dancedance.RepresentableStage;
import org.academniadecodigo.dancedance.stage.Stage;
import org.academniadecodigo.dancedance.stage.position.StagePosition;

/**
 * Created by codecadet on 20/10/16.
 */
public class StageSgfx implements RepresentableStage, Stage{

    private int cols;
    private int rows;
    Rectangle rectangle;
    public static final int PADDING = 10;
    public static final int CELL_SIZE = 10;
    public static int ANIMATION_SLEEP = 50;


    public StageSgfx(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        rectangle = new Rectangle(PADDING , PADDING , cols * CELL_SIZE, rows * CELL_SIZE );
    }

    @Override
    public void init() {
        rectangle.draw();
    }

    @Override
    public int getCols() {
        return cols;
    }

    @Override
    public int getRows() {
        return rows;
    }

    @Override
    public StagePosition makeStagePosition() {
        return null;
    }

    @Override
    public StagePosition makeStagePosition(int col, int row) {
        return null;
    }

}
