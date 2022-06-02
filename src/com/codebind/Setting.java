package com.codebind;
import java.util.*;

/**Here will be the random settings like weather, time, biome etc**/
public class Setting {

    public static String area;
    public static int time;
    public static String typeAdv; //this will correspond with the weather
    public static String typeDisAdv;

    public static String[] areaList = {"Dark", "Rainy", "Hot", "Sunny", "Perfect", "Blood Moon", "Dead Forest", "Waterfall", "Mountainous", "Holy Aura", "Foggy"};
    public static String[] advList = {"Dark", "Water", "Fire", "Radiant", "Perfect", "Demonic", "Necrotic", "Water", "Rock", "Holy", "Foggy"};
    public static String[] disAdvList = {"Radiant", "Fire", "Ice", "Dark", "Perfect", "Magical", "Nature", "Fire", "Water", "Demonic", "Foggy"};

    // 1 = day 2 = night
    public static void change() {
        Random rand = new Random();
        int tempRand = rand.nextInt(10);
        time = rand.nextInt(2)+1;
        if (tempRand == 0 || tempRand == 5) {
            time = 2;
        }
        if (tempRand == 3) {
            time = 1;
        }
        area = areaList[tempRand];
        typeAdv = advList[tempRand];
        typeDisAdv = disAdvList[tempRand];
    }

    /*====================================================
    ALL ELEMENTAL TYPES POSSIBLE
    - FIRE
    - WATER
    - ICE
    - ROCK
    - NECROTIC
    - MAGICAL
    - HOLY
    - DARK
    - RADIANT
    - NATURE
    - DEMONIC

    ALL PHYSICAL DAMAGE TYPES
    - ACID
    - BLUDGEONING
    - PIERCING
    - POISON
    - SLASHING
    - BURNING
    - COLD


    ALL ELEMENTAL DAMAGE TYPES
    - LIGHTNING
    - NECROTIC
    - PSYCHIC
    - RADIANT
    - DARK
    - HOLY
    ======================================================*/

}
