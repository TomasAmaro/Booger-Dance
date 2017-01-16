package org.academniadecodigo.dancedance.stage;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by codecadet on 22/10/16.
 */
public class Music {
    private Clip clip;
    public static int MUSIC_BEATS = 966;


    public void playSound(String source) {
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(new File(source));
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
           // clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void stopMusic(){
        clip.stop();
    }

}
