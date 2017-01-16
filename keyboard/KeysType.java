package org.academniadecodigo.dancedance.keyboard;

import org.academniadecodigo.dancedance.GenRandomNumber;

/**
 * Created by codecadet on 19/10/16.
 */
public enum KeysType {

    UP,
    DOWN,
    LEFT,
    RIGHT,
    SPACE;




    public static KeysType getRandomKey(){
        int random = GenRandomNumber.genRandom(0,3);
        switch (random){
            case 0:
                return KeysType.UP;
            case 1:
                return KeysType.DOWN;
            case 2:
                return KeysType.LEFT;
            case 3:
                return  KeysType.RIGHT;
            case 4:
                return KeysType.SPACE;
            default:
                return null;

        }
    }
}
