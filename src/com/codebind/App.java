package com.codebind;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class App {
    private JPanel panel1;
    private JTextField beastName;
    private JComboBox beastPicker;
    private JTable baseStats;
    private JButton startButton;
    private JButton hpIncrease;
    private JList JMoveList;
    private JScrollBar scrollBar1;
    private JButton addMoveButton;
    private JLabel Jhp;
    private JLabel Jspeed;
    private JLabel Jstrength;
    private JLabel Jphysical_armour;
    private JLabel Jmagic_armour;
    private JLabel Jmagic;
    private JLabel Jintel;
    private JLabel Jtype;
    private JLabel Jtype2;
    private JLabel JhpMod;
    private JLabel JspeedMod;
    private JLabel JstrengthMod;
    private JLabel Jphysical_armourMod;
    private JLabel Jmagic_armourMod;
    private JLabel JmagicMod;
    private JLabel JintelMod;
    private JButton speedIncrease;
    private JButton strengthIncrease;
    private JButton armourIncrease;
    private JButton mArmourIncrease;
    private JButton magicIncrease;
    private JButton intelIncrease;
    private JButton hpDecrease;
    private JButton speedDecrease;
    private JButton strengthDecrease;
    private JButton armourDecrease;
    private JButton mArmourDecrease;
    private JButton magicDecrease;
    private JButton intelDecrease;

    public static ArrayList<Stats> beastIndex = new ArrayList<Stats>();
    public static ArrayList<Stats> beastList = new ArrayList<Stats>();
    public static ArrayList<Move> globalMoveIndex = new ArrayList<Move>();
    public static ArrayList<JButton> JbuttonAddList = new ArrayList<JButton>();
    public static ArrayList<JButton> JbuttonSubtractList = new ArrayList<JButton>();



    public App() {
        JbuttonAddList.add(null);
        JbuttonAddList.add(hpIncrease);
        JbuttonAddList.add(speedIncrease);
        JbuttonAddList.add(strengthIncrease);
        JbuttonAddList.add(armourIncrease);
        JbuttonAddList.add(mArmourIncrease);
        JbuttonAddList.add(magicIncrease);
        JbuttonAddList.add(intelIncrease);

        JbuttonSubtractList.add(null);
        JbuttonSubtractList.add(hpDecrease);
        JbuttonSubtractList.add(speedDecrease);
        JbuttonSubtractList.add(strengthDecrease);
        JbuttonSubtractList.add(armourDecrease);
        JbuttonSubtractList.add(mArmourDecrease);
        JbuttonSubtractList.add(magicDecrease);
        JbuttonSubtractList.add(intelDecrease);
        JMoveList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //if (moveList.getSelectedIndex() == -1) {
//
                //    //make button to add move to arsenal false
                //}
            }
        });


        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        beastPicker.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Jhp.setText(String.valueOf(beastIndex.get(beastPicker.getSelectedIndex()).hp()));
                    Jspeed.setText(String.valueOf(beastIndex.get(beastPicker.getSelectedIndex()).speed()));
                    Jstrength.setText(String.valueOf(beastIndex.get(beastPicker.getSelectedIndex()).strength()));
                    Jphysical_armour.setText(String.valueOf(beastIndex.get(beastPicker.getSelectedIndex()).physical_armour()));
                    Jmagic_armour.setText(String.valueOf(beastIndex.get(beastPicker.getSelectedIndex()).magic_armour()));
                    Jmagic.setText(String.valueOf(beastIndex.get(beastPicker.getSelectedIndex()).magic()));
                    Jintel.setText(String.valueOf(beastIndex.get(beastPicker.getSelectedIndex()).intel()));

                    Jtype.setText(beastIndex.get(beastPicker.getSelectedIndex()).type1());
                    Jtype2.setText(beastIndex.get(beastPicker.getSelectedIndex()).type2());

                    DefaultListModel DLM = new DefaultListModel();
                    for (int i = 0; i < beastIndex.get(beastPicker.getSelectedIndex()).moveList.size(); i++) {
                        DLM.addElement(beastIndex.get(beastPicker.getSelectedIndex()).moveList.get(i).name());
                    }
                    for (int i = 0; i < beastIndex.get(beastPicker.getSelectedIndex()).moveList.size(); i++) {
                        System.out.println(beastIndex.get(beastPicker.getSelectedIndex()).moveList.get(i).name());
                    }
                    JMoveList.setModel(DLM);

                }
            }
        });
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        for (int i = 1; i < JbuttonAddList.size(); i++) {
            JbuttonAddList.get(i).addActionListener()
        }
        hpIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        speedIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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

        MoveCreator.create();
        BeastCreator.create();



    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //THIS IS FIRE MAKE SURE TO UTILIZE CUSTOM CODE MORE

        JMoveList = new JList(); //data has type Object[]
        JMoveList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JMoveList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        JMoveList.setVisibleRowCount(9);

    }

}
