package com.codebind;

public class BeastCreator {

    public static void create() {

        for (int i = 1; i < App.beastIndex.size(); i++) {

            App.beastIndex.get(i).moveList.add(App.globalMoveIndex.get(1));
            App.beastIndex.get(i).moveList.add(App.globalMoveIndex.get(2));
            App.beastIndex.get(i).moveList.add(App.globalMoveIndex.get(3));
        }

        App.beastIndex.add(null);
        /**Just some code to remember how to make a new beast**/
        BlueDragon blueDragon = new BlueDragon("Tom", "Water", "None", "Dragon", 250, 150, 150, 70, 100, 150, 200, 170);
        App.beastIndex.add(blueDragon);

        /**Red Dragon making**/
        RedDragon redDragon = new RedDragon("name", "Fire", "None", "Dragon", 250, 150, 150, 70, 100, 150, 200, 170);
        App.beastIndex.add(redDragon);

        WhiteDragon whiteDragon = new WhiteDragon("name", "Ice", "None", "Dragon", 250, 150, 150, 70, 100, 150, 200, 170);
        App.beastIndex.add(whiteDragon);

        Argos argos = new Argos("name", "Radiant", "Magical", "Deer", 200, 200, 70, 200, 70, 100, 250, 140);
        App.beastIndex.add(argos);

        Albion albion = new Albion("name", "Holy", "Magical", "Albion", 230, 220, 70, 230, 60, 90, 200, 160);
    }

}
