package org.academniadecodigo.dancedance.stage;


import org.academniadecodigo.dancedance.simplegfx.StageSgfx;

/**
 * A factory of different types of stages
 */
public class StageFactory {
    /**
     * Creates a new stage
     *
     * @param stageType the type of stage to create
     * @param cols     the number of columns of the stage
     * @param rows     the number of rows of the stage
     * @return the new stage
     */
    public static Stage createStage(StageType stageType, int cols, int rows) {

        switch (stageType) {
            case SIMPLE_GFX:
                return new StageSgfx(cols, rows);
            default:
                return new StageSgfx(cols, rows);
        }
    }

}
