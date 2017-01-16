package org.academniadecodigo.dancedance;

import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academniadecodigo.dancedance.gameobjects.GameObjectFactory;
import org.academniadecodigo.dancedance.keyboard.KeysType;
import org.academniadecodigo.dancedance.simplegfx.StageSgfx;
import org.academniadecodigo.dancedance.simplegfx.KeyboardSgfx;
import org.academniadecodigo.dancedance.stage.Music;

/**
 * Created by codecadet on 20/10/16.
 */
public class Game {

    //private StageSgfx stageSgfx;
    private GameObjectFactory objects;
    private KeyboardSgfx keyboard;
    private Music music;
    private Music wrongSound;        //change song
    private Music correctSound;
    private Music comboSound;                  //TODO fix this shit == too many Music variables
    private Music startSong;
    private Music gameOverSong;
    private Text totalScore;
    private boolean spacePressed;


    private int health;
    private int correctCounter;
    private int failCounter;
    private int beat;
    private int score;


    public Game() {


        keyboard = new KeyboardSgfx();
        //stageSgfx = new StageSgfx(85, 47);
        objects = new GameObjectFactory();
        music = new Music();
        objects.createEffects();
        correctSound = new Music();
        wrongSound = new Music();
        comboSound = new Music();
        startSong = new Music();
        gameOverSong = new Music();
        spacePressed = false;



        beat = Music.MUSIC_BEATS;

    }

    public void startGame() throws InterruptedException {
        //stageSgfx.init();
        objects.background().showBackground();
        startSong.playSound("resources/music/START_MUSIC.wav");
        Thread.sleep(StageSgfx.ANIMATION_SLEEP);
        objects.createAnimation().startAnimation();
        startSong.stopMusic();
        startLevel();
    }


    public void startLevel() throws InterruptedException {

        //  TODO Level Constructor and implement multiple levels

        health = 20;
        score = 0;
        correctCounter = 0;
        failCounter = 0;
        totalScore = new Text( 680, 43, "SCORE:" + score);
        totalScore.grow(70,20);
        objects.newDancer().loadDancerPictures();
        objects.createHealthBar().showHealthBar();
        totalScore.draw();
        music.playSound("resources/music/Eric_Prydz_-_Call_On_Me_483ms_beat.wav");


        while (true) {

            if (health > 0) {
                KeysType randomKey = KeysType.getRandomKey();
                askKey(randomKey);
                checkKey(randomKey);

            } else {
                music.stopMusic();
                endGame();
                break;
            }

        }
    }


    public void askKey(KeysType randomKey) throws InterruptedException {

        switch (randomKey) {
            case UP:
                objects.newArrow().showUpArrow();
                Thread.sleep(Music.MUSIC_BEATS);
                objects.getArrow().hideUpArrow();
                objects.getEffects().deleteEffects();
                break;
            case DOWN:
                objects.newArrow().showDownArrow();
                Thread.sleep(Music.MUSIC_BEATS);
                objects.getArrow().hideDownArrow();
                objects.getEffects().deleteEffects();

                break;
            case LEFT:
                objects.newArrow().showLeftArrow();
                Thread.sleep(Music.MUSIC_BEATS);
                objects.getArrow().hideLeftArrow();
                objects.getEffects().deleteEffects();

                break;
            case RIGHT:
                objects.newArrow().showRightArrow();
                Thread.sleep(Music.MUSIC_BEATS);
                objects.getArrow().hideRightArrow();
                objects.getEffects().deleteEffects();

                break;
            default:
                System.out.println("something is not ok.");
        }

    }


    public void checkKey(KeysType randomKey) throws InterruptedException {
/*
                RESET BUTTON
        if (keyboard.verifyKeyPressed(KeysType.SPACE.ordinal())){
            music.stopMusic();
            objects.getDancer().hideDancer();
*/
        if (keyboard.verifyKeyPressed(randomKey.ordinal())) {
            switch (randomKey) {
                case UP:
                    objects.getDancer().changeMovement(KeysType.UP);
                    correctSound.playSound("resources/SOUND_FX/CORRECT_SOUND_01.wav");
                    break;
                case DOWN:
                    objects.getDancer().changeMovement(KeysType.DOWN);
                    correctSound.playSound("resources/SOUND_FX/CORRECT_SOUND_01.wav");
                    break;
                case LEFT:
                    objects.getDancer().changeMovement(KeysType.LEFT);
                    correctSound.playSound("resources/SOUND_FX/CORRECT_SOUND_01.wav");
                    break;
                case RIGHT:
                    objects.getDancer().changeMovement(KeysType.RIGHT);
                    correctSound.playSound("resources/SOUND_FX/CORRECT_SOUND_01.wav");
                    break;

                default:
                    System.out.println("something is not ok.");
            }
            failCounter = 0;
            correctCounter++;
            score++;
            totalScore.delete();
            totalScore = new Text( 680, 43, "SCORE:" + score);
            totalScore.grow(70,20);
            totalScore.draw();


            if (correctCounter == 5) {

                objects.getEffects().showCombo();
                comboSound.playSound("resources/SOUND_FX/COMBO_SOUND_01.wav");
                Music.MUSIC_BEATS = beat / 2;
                score += 2;
                totalScore.delete();
                totalScore = new Text( 680, 43, "SCORE:" + score);
                totalScore.grow(70,20);
                totalScore.draw();
            }
            System.out.println(correctCounter);
            System.out.println("well done");


        } else {

            objects.getDancer().changeMovement(KeysType.SPACE); // KeysType.SPACE = Wrong Movement
            health--;
            objects.getHealthBar().decreaseHealthBar();
            objects.getEffects().showWrongKey();
            correctCounter = 0;
            failCounter++;
            if (failCounter == 3) {
                Music.MUSIC_BEATS = beat;
            }
            System.out.println(failCounter);
            System.out.println("shit, my health is: " + health);
        }


    }

    public void endGame() throws InterruptedException {

        System.out.println("Health: " + health + " Game Over!\n" + "score: " + score);
        objects.getEffects().deleteEffects();
        objects.getDancer().hideDancer();
        gameOverSong.playSound("resources/music/GAME_OVER.wav");
        objects.createAnimation().youLoseAnimation();
        objects.getHealthBar().hidehealthBar();
        gameOverSong.stopMusic();
        startGame();
        return;

    }

}
