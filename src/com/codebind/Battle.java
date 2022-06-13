package com.codebind;

import javax.swing.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Battle extends App {

    public static boolean p1Turn = false;
    public static boolean p2Turn = false;


    public static void start(int p1Hp, int p1Speed, int p1Strength, int p1Armour, int p1mArmour, int p1Magic, int p1Intel, int p2Hp, int p2Speed, int p2Strength, int p2Armour, int p2mArmour, int p2Magic, int p2Intel) {
        Random rand = new Random();
        int tempRand = rand.nextInt(10);
        if (beastIndex.get(p1).speed() > beastIndex.get(p2).speed()) {
            p1Turn = true;
            p2Turn = false;
        } else if (beastIndex.get(p2).speed() > beastIndex.get(p1).speed()) {
            p1Turn = false;
            p2Turn = true;
        } else if (tempRand < 5) {
            p1Turn = true;
            p2Turn = false;
        } else {
            p1Turn = false;
            p2Turn = true;
        }
        while (p1Hp > 0 || p2Hp > 0) {
            if (p1Turn == true) {
                p2Hp = moveCalc(p1, p1Hp, p1Strength, p1Magic, p1Intel, p2, p2Hp, p2Armour, p2mArmour);
                p1Turn = false;
                p2Turn = true;
                if (p2Hp <= 0) {
                    JOptionPane.showMessageDialog(null, "Player 1's " + beastIndex.get(p1).name() + " won by " + p1Hp + " hit points!");
                    break;
                }
            }
            if (p2Turn == true) {
                p1Hp = moveCalc(p2, p2Hp, p2Strength, p2Magic, p2Intel, p1, p1Hp, p1Armour, p1mArmour);
                p2Turn = false;
                p1Turn = true;
                if (p1Hp <= 0) {
                    JOptionPane.showMessageDialog(null, "Player 2's " + beastIndex.get(p2).name() + " won by " + p2Hp + " hit points!");
                    break;
                }
            }
        }
    }

    public static int moveCalc(int playerAttack, int playerHp,int playerStrength, int playerMagic, int playerIntel, int playerVictim, int victimHp, int victimArmour, int victimMagicArmour) {
        Random rand = new Random();
        float critMultiplier = 1;
        float environmentMultiplier = 1;
        float statMultiplier = 1;
        float defenseMultiplier = 1;
        int damage;
        int tempCrit = rand.nextInt(10);
        int tempMiss = rand.nextInt(100);
        int tempMove = rand.nextInt(beastIndex.get(playerAttack).moveList.size());
        if (beastIndex.get(p1).moveList.get(tempMove).accuracy()+(playerIntel/100) < tempMiss) {
            return victimHp;
        }
        if (tempCrit > 8) {
            critMultiplier = 2;
        }

        if (Setting.typeAdv.equalsIgnoreCase(beastIndex.get(playerAttack).moveList.get(tempMove).elementalType())) {
            environmentMultiplier = (float) (environmentMultiplier*1.5);
        }
        if (Setting.typeDisAdv.equalsIgnoreCase(beastIndex.get(playerAttack).moveList.get(tempMove).elementalType())) {
            defenseMultiplier = defenseMultiplier/2;
        }
        if (Setting.typeDisAdv.equalsIgnoreCase("perfect")) {
            environmentMultiplier = (float) (environmentMultiplier*1.5);
        }
            statMultiplier+=beastIndex.get(playerAttack).strength()/1000;
        if (beastIndex.get(p1).moveList.get(tempMove).elementalType().equalsIgnoreCase("none")) {
            damage = (int) Math.round((beastIndex.get(playerAttack).moveList.get(tempMove).damage() * (playerStrength/100) * (statMultiplier*(victimArmour*defenseMultiplier) / 1000))*critMultiplier*environmentMultiplier);
            System.out.println(victimHp-damage);
            return victimHp - damage;
        } else {
            damage = (int) Math.round((beastIndex.get(playerAttack).moveList.get(tempMove).damage() * (playerMagic/100) * (statMultiplier*(victimArmour*defenseMultiplier) / 1000))*critMultiplier*environmentMultiplier);
            System.out.println(victimHp-damage);
            return victimHp - damage;
        }
    }
}