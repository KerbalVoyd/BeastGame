package com.codebind;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    private JPanel panel1;
    private JTextField beastName;
    private JComboBox comboBox1;
    private JTable baseStats;
    private JButton button1;
    private JButton button2;
    private JList JMoveList;
    private JScrollBar scrollBar1;
    private JButton addMoveButton;
    public static BlueDragon PseudoCodeDragon = new BlueDragon("Tom","Water", "None", "Dragon", 1, 1, 1, 1, 1, 1, 1, 1);
    public static ArrayList<Move> moveIndex = new ArrayList<Move>();
    public App() {

        JMoveList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //if (moveList.getSelectedIndex() == -1) {
//
                //    //make button to add move to arsenal false
                //}
            }
        });
    }
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame frame = new JFrame("App"); //Define JFrame
        frame.setContentPane(new App().panel1); //call panel1 inside frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



        var PseudoCodeSlash = new Move("Slash", true, false, 1, 1, "Slashing", "None", 5, 90);
        var PseudoCodeBite = new Move("Bite", true, false, 1, 1, "Piercing", "None", 5, 90);
        var PseudoCodeBash = new Move("Bash", true, false, 1, 1, "Bludgeoning", "None", 5, 90);

        PseudoCodeDragon.moveList.add(PseudoCodeSlash);
        PseudoCodeDragon.moveList.add(PseudoCodeBash);
        PseudoCodeDragon.moveList.add(PseudoCodeBite);

        moveIndex.add(PseudoCodeSlash);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //THIS IS FIRE MAKE SURE TO UTILIZE CUSTOM CODE MORE
        ArrayList<String> tempMoveIndex = new ArrayList<String>();
        for (int i = 0; i < moveIndex.size(); i++) {

            tempMoveIndex.add(PseudoCodeDragon.moveList.get(i).name());

        }
        //String[] test = {"lol", "bruh", "zzz"};
        String[] test = new String[10];

        test[0] = PseudoCodeDragon.moveList.get(0).name(); //doesnt work because we make JMoveList before we make anything else
        JMoveList = new JList(test); //data has type Object[]
        JMoveList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JMoveList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        JMoveList.setVisibleRowCount(9);

    }
}
