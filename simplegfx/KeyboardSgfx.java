package org.academniadecodigo.dancedance.simplegfx;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academniadecodigo.dancedance.keyboard.KeysType;
import org.academniadecodigo.dancedance.keyboard.RepresentableKeyboard;

import java.util.Arrays;

/**
 * Created by codecadet on 19/10/16.
 */
public class KeyboardSgfx implements KeyboardHandler, RepresentableKeyboard {

    private Keyboard keyboard;
    private boolean[] keysPressed = new boolean[5];



    /**
     * Creates a new keyboard with move keys and their events
     */
    public KeyboardSgfx() {

        keyboard = new Keyboard(this);
        createPressEvent(KeyboardEvent.KEY_UP);
        createPressEvent(KeyboardEvent.KEY_DOWN);
        createPressEvent(KeyboardEvent.KEY_LEFT);
        createPressEvent(KeyboardEvent.KEY_RIGHT);
        createPressEvent(KeyboardEvent.KEY_SPACE);
    }
    /**
     * Creates a new keyboard event for when a key is pressed
     *
     * @param key the key number
     */
    public void createPressEvent(int key) {

        KeyboardEvent event = new KeyboardEvent();
        event.setKey(key);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event);
    }

    /*
    verify if the key pressed was the correct one and return boolean
     */
    public boolean verifyKeyPressed(int iKeyPressed) {

        if (correctKey(iKeyPressed)) {
            reSetArray();
            return true;

        } else {
            reSetArray();
            return false;
        }

    }


    private boolean correctKey(int keyPosition) {

        for (int i = 0; i < keysPressed.length; i++) {

            if ((keyPosition != i && keysPressed[i]) || (keyPosition == i && !keysPressed[i])) {
                return false;
            }
        }

        return true;

    }

    private void reSetArray() {

        for (int i = 0; i < keysPressed.length; i++) {
            keysPressed[i] = false;
        }
    }

    @Override
    public void keyPressed(KeyboardEvent e) {

        switch (e.getKey()) {
            case KeyboardEvent.KEY_UP:
                keysPressed[KeysType.UP.ordinal()] = true;
                correctKey(KeysType.UP.ordinal());
                break;
            case KeyboardEvent.KEY_DOWN:
                keysPressed[KeysType.DOWN.ordinal()] = true;
                correctKey(KeysType.DOWN.ordinal());
                break;
            case KeyboardEvent.KEY_LEFT:
                keysPressed[KeysType.LEFT.ordinal()] = true;
                correctKey(KeysType.LEFT.ordinal());
                break;
            case KeyboardEvent.KEY_RIGHT:
                keysPressed[KeysType.RIGHT.ordinal()] = true;
                correctKey(KeysType.LEFT.ordinal());
                break;
            case KeyboardEvent.KEY_SPACE:
                keysPressed[KeysType.SPACE.ordinal()] = true;
                correctKey(KeysType.SPACE.ordinal());
                break;
            default:
                System.out.println("Something went terribly wrong");
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent e) {
    }

    @Override
    public String toString() {
        return "KeyboardSgfx{" +
                "keyboard=" + keyboard +
                ", keysPressed=" + Arrays.toString(keysPressed) +
                '}';
    }
}
