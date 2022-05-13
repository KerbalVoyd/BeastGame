package com.codebind;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.*;

public class App {
    private JPanel panel1;
    private JTextField beastName;
    private JComboBox comboBox1;
    private JTable baseStats;
    private JButton button1;
    private JButton button2;
    private JList list1;
    private JScrollBar scrollBar1;
    public static BlueDragon PseudoCodeDragon = new BlueDragon("Tom","Water", "None", "Dragon", 1, 1, 1, 1, 1, 1, 1, 1);

    public App() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, PseudoCodeDragon.moveList.get(0).attack()); //shows stuff
            }
        });
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (list1.isSelectionEmpty()) {
                    //put stuff I want to do with the selected array thing
                }
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
        //frame.getContentPane().add()
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



        var PseudoCodeSlash = new Move(true, false, 1, 1, "Slashing", "None", 5, 90);

        PseudoCodeDragon.moveList.add(PseudoCodeSlash);
        PseudoCodeDragon.moveList.get(0).attack();
        ArrayList<Move> moveIndex = new ArrayList<Move>();
        moveIndex.add(PseudoCodeSlash);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //THIS IS FIRE MAKE SURE TO UTILIZE CUSTOM CODE MORE

        String[] test = {"lol", "bruh", "zzz"};
        list1 = new JList(test); //data has type Object[]
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list1.setVisibleRowCount(9);

    }
}
