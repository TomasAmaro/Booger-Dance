package org.academniadecodigo.dancedance;

import org.academniadecodigo.dancedance.stage.Music;

public class Tester {
    public static void main(String[] args) {




        Game g = new Game();

        try {
            Thread.sleep(Music.MUSIC_BEATS);

            g.startGame();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
