package org.academniadecodigo.dancedance.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academniadecodigo.dancedance.simplegfx.StageSgfx;

/**
 * Created by codecadet on 23/10/16.
 */
public class HealthBar {

    private Picture health;
    private int currentHealth;
    private String[] healthBar ;

    public void showHealthBar(){
        health = new Picture(StageSgfx.PADDING,StageSgfx.PADDING, "resources/art/Health_Bar_Sequence/HEALTH_BAR_0.png");
        healthBar = new String[20];

        for (int i = 0; i < healthBar.length; i++) {
            healthBar[i] = "resources/art/Health_Bar_Sequence/HEALTH_BAR_"+i+".png ";
        }
        health.draw();

    }

    public void decreaseHealthBar(){
        System.out.println("CURRENT HEALTH: " + currentHealth);
        currentHealth = currentHealth + 1;
        health.load("resources/art/Health_Bar_Sequence/HEALTH_BAR_"+currentHealth+".png");

    }

    public void hidehealthBar(){
        health.delete();
    }
}
