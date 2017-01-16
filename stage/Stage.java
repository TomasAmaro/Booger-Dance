package org.academniadecodigo.dancedance.stage;

import org.academniadecodigo.dancedance.stage.position.StagePosition;

public interface Stage {

    /**
     * Initializes the stage
     */
    public void init();

    /**
     * Gets the number of columns in the stage
     *
     * @return the number of columns
     */
    public int getCols();

    /**
     * Gets the number of rows in the stage
     *
     * @return the number of rows
     */
    public int getRows();

    /**
     * Create a random stage position
     *
     * @return the new stage position
     */
    public StagePosition makeStagePosition();

    /**
     * Creates a a stage position in a specific column and row
     *
     * @param col   the position column
     * @param row   the position row
     * @return the new stage position
     */
    public StagePosition makeStagePosition(int col, int row);

}
