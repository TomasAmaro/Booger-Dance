package org.academniadecodigo.dancedance.stage.position;

/**
 * A position on the stage that is capable of moving around
 */
public interface StagePosition {

    /**
     * Gets the position column in the stage
     *
     * @return the position column
     */
    public int getCol();

    /**
     * Gets the position row in the stage
     *
     * @return the position row
     */
    public int getRow();

    /**
     * Updates the position column and row
     *
     * @param col the new position column
     * @param row the new position row
     */
    public void setPos(int col, int row);


     /* Displays the position in the stage
     */
    public void show();

    /**
     * Hides the position in the stage
     */
    public void hide();


}
