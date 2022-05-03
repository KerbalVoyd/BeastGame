package com.codebind;

import javax.swing.*;

public class App {
    private JPanel panel1;
    private JButton button1;

    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame frame = new JFrame("App"); //Define JFrame
        frame.setContentPane(new App().panel1); //call panel1 inside fram
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
