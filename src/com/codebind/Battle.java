package com.codebind;

import java.util.Random;

public class Battle extends App {

    public static boolean p1Turn = false;
    public static boolean p2Turn = false;

    public static void start() {
        Random rand = new Random();
        int tempRand = rand.nextInt(10);

        if (beastIndex.get(p1).speed() > beastIndex.get(p2).speed()) {
            p1Turn = true;
            p2Turn = false;
        } else {
            p1Turn = false;
            p2Turn = true;
        }
        while (beastIndex.get(p1).hp() > 0 || beastIndex.get(p2).hp() > 0) {
            if (p1Turn == true) {
                Jhp.getText() = beastIndex.get(p2).hp();
            }
        }
    }

    public static int moveCalc(int player) {
        Random rand = new Random();
        int tempRand = rand.nextInt(beastIndex.get(player).moveList.size());
        return 1;
    }
}
