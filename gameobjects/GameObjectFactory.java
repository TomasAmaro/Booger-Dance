package org.academniadecodigo.dancedance.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 20/10/16.
 */
public class GameObjectFactory {

    private Arrow arrow;
    private Background backPicture;
    private Dancer dancer;
    private Animations animation;
    private HealthBar healthBar;
    private FxEffects effects;


    public FxEffects createEffects(){ return effects = new FxEffects();}
    public FxEffects getEffects(){return effects;}

    public HealthBar createHealthBar (){return healthBar = new HealthBar();}
    public HealthBar getHealthBar(){return healthBar;}

    public Dancer newDancer() {
        return dancer = new Dancer();
    }
    public Dancer getDancer(){
        return dancer;
    }

    public Arrow newArrow() {
        return arrow = new Arrow();
    }
    public Arrow getArrow() {
        return arrow;
    }

    public Background background() {return backPicture = new Background();}
    public Background getBackPicture(){return backPicture;}

    public Animations createAnimation(){
        return animation = new Animations();
    }
    public Animations getAnimation(){return animation;}

}
