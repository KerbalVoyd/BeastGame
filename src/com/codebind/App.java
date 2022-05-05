package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class App {
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;

    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "hi"); //shows stuff
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

        var PseudoCodeDragon = new BlueDragon("Tom","Water", "None", "Dragon", 1, 1, 1, 1, 1, 1, 1, 1);
        var PseudoCodeSlash = new Move(true, false, 1, 1, "Slashing", "None", 5, 90);

        ArrayList<Move> moveList = new ArrayList<Move>();
        moveList.add(PseudoCodeSlash);
    }

}
