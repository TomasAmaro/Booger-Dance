package org.academniadecodigo.dancedance.stage.position;


import org.academniadecodigo.dancedance.stage.Stage;

/**
 * Base skeleton for a stage position
 *
 * @see StagePosition
 */

    public abstract class AbstractStagePosition implements StagePosition {

        private int col;
        private int row;
        private Stage stage;

        /**
         * Construct a new stage position at a specific column and row
         *
         * @param col   the column of the stage position
         * @param row   the row of the stage position
         * @param stage  the stage in which the position will be displayed
         */
        public AbstractStagePosition(int col, int row, Stage stage) {
            this.col = col;
            this.row = row;
            this.stage = stage;

        }

        public Stage getStage() {
            return stage;
        }

        /**
         * @see StagePosition#setPos(int, int)
         */
        @Override
        public void setPos(int col, int row) {
            this.col = col;
            this.row = row;
            show();
        }

        /**
         * @see StagePosition#getCol()
         */
        @Override
        public int getCol() {
            return col;
        }

        /**
         * @see StagePosition#getRow()
         */
        @Override
        public int getRow() {
            return row;
        }


}
