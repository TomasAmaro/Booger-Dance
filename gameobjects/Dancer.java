package org.academniadecodigo.dancedance.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academniadecodigo.dancedance.GenRandomNumber;
import org.academniadecodigo.dancedance.keyboard.KeysType;
import org.academniadecodigo.dancedance.simplegfx.StageSgfx;

import java.util.Random;

/**
 * Created by codecadet on 20/10/16.
 */
public class Dancer {

    private Picture idle;
    private String[] upMovements = new String[4];
    private String[] downMovements = new String[4];
    private String[] leftMovements = new String[4];
    private String[] rightMovements = new String[4];
    private String[] wrongMovements = new String[4];

    public void loadDancerPictures() {
        idle = new Picture(StageSgfx.PADDING, StageSgfx.PADDING, "resources/art/3D Character Movements/STATIC_MOVEMENTS/3D_STATIC_IDLE_0.png");
        for (int i = 0; i < 4; i++) {
            upMovements[i] = "resources/art/3D Character Movements/STATIC_MOVEMENTS/3D_STATIC_UP_" + i + ".png";
            downMovements[i] = "resources/art/3D Character Movements/STATIC_MOVEMENTS/3D_STATIC_DOWN_" + i + ".png";
            leftMovements[i] = "resources/art/3D Character Movements/STATIC_MOVEMENTS/3D_STATIC_LEFT_" + i + ".png";
            rightMovements[i] = "resources/art/3D Character Movements/STATIC_MOVEMENTS/3D_STATIC_RIGHT_" + i + ".png";
            wrongMovements[i] = "resources/art/3D Character Movements/STATIC_MOVEMENTS/3D_STATIC_WRONG_" + i + ".png";
        }
        idle.draw();
    }
    public void hideDancer(){
        idle.delete();
    }

    public Picture changeMovement(KeysType movement) {


        int varToCompare;
        int tempPicture = 0;
        varToCompare = tempPicture;
        tempPicture = GenRandomNumber.genRandom(0, 3);
        if (varToCompare == tempPicture) {
            tempPicture = GenRandomNumber.genRandom(0, 3);
        }

        switch (movement) {
            case UP:
                idle.load(upMovements[tempPicture]);
                break;
            case DOWN:
                idle.load(downMovements[tempPicture]);
                break;
            case LEFT:
                idle.load(leftMovements[tempPicture]);
                break;
            case RIGHT:
                idle.load(rightMovements[tempPicture]);
                break;
            case SPACE:
                idle.load(wrongMovements[tempPicture]);
                break;
            default:
                return idle;
        }

        return idle;
    }
}


