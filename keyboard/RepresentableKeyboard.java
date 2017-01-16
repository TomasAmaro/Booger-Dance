package org.academniadecodigo.dancedance.keyboard;

/**
 * Created by codecadet on 19/10/16.
 */
public interface RepresentableKeyboard {

    /**
     * Returns and verify the keyboard input
     */
    void createPressEvent(int key);
    boolean verifyKeyPressed(int iKeyPressed);

}
