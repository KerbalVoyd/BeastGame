package com.codebind;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
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
    public static BlueDragon PseudoCodeDragon = new BlueDragon("Tom","Water", "None", "Dragon", 1, 1, 1, 1, 1, 1, 1, 1);

    public App() {

        String[] columnNames = {"Stat", "Value"};

        String[][] data = {
                {"Attack", "5"},
                {"Int", "5"},
                {"HP", "5"},
                {"SOMETHING", "5"},
                {"HAHA", "5"},

        };

        baseStats = new JTable(data, columnNames);
        baseStats.setPreferredScrollableViewportSize(new Dimension(100, 50));
        baseStats.setFillsViewportHeight(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, PseudoCodeDragon.moveList.get(0).attack()); //shows stuff
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



        var PseudoCodeSlash = new Move(true, false, 1, 1, "Slashing", "None", 5, 90);

        PseudoCodeDragon.moveList.add(PseudoCodeSlash);
        PseudoCodeDragon.moveList.get(0).attack();
        ArrayList<Move> moveIndex = new ArrayList<Move>();
        moveIndex.add(PseudoCodeSlash);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here






        DefaultTableModel tblModel = (DefaultTableModel)baseStats.getModel();

        //String tblStat = tblModel.getValueAt(baseStats.getSelectedRow(), 0).toString();
        //String tblNum = tblModel.getValueAt(baseStats.getSelectedRow(), 1).toString();
//
//
        //baseStats.setValueAt("tester", 0, 1);

    }
}
