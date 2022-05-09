package com.codebind;

import javax.swing.*;
import java.util.ArrayList;

public class App {
    private JPanel panel1;
    private JButton button2;
    private JTextField beastName;
    private JComboBox comboBox1;
    public static BlueDragon PseudoCodeDragon = new BlueDragon("Tom","Water", "None", "Dragon", 1, 1, 1, 1, 1, 1, 1, 1);

    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame frame = new JFrame("App"); //Define JFrame
        frame.setLayout(null);
        //frame.setContentPane(new App().panel1); //call panel1 inside frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        var PseudoCodeSlash = new Move(true, false, 1, 1, "Slashing", "None", 5, 90);

        PseudoCodeDragon.moveList.add(PseudoCodeSlash);
        PseudoCodeDragon.moveList.get(0).attack();
        ArrayList<Move> moveIndex = new ArrayList<Move>();
        moveIndex.add(PseudoCodeSlash);
    }
    public App() {
        //button1.addActionListener(new ActionListener() {
        //    @Override
        //    public void actionPerformed(ActionEvent e) {
        //        JOptionPane.showMessageDialog(null, PseudoCodeDragon.moveList.get(0).attack()); //shows stuff
        //    }
        //});
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
