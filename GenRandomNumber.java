package org.academniadecodigo.dancedance;

/**
 * Created by codecadet on 12/10/16.
 */
public class GenRandomNumber {

    public static int genRandom(int maxElements) {

        return ((int) (Math.random() * maxElements)); // between [0 : max[
    }

    public static int genRandom(int indexMin, int indexMax) {

        return (indexMin + (int) (Math.random() * ((indexMax - indexMin) + 1))); // between [min : max]
    }

}
