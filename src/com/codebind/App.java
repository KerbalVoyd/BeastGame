package com.codebind;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class App {
    private JPanel panel1;
    private JTextField beastName;
    private JComboBox beastPicker;
    private JTable baseStats;
    private JButton startButton;
    private JButton hpIncrease;
    private JList JMoveList;
    private JScrollBar scrollBar1;
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
    private JLabel JmodPool;
    private JTextPane textPane1;
    private JList JrealMoveList;

    public static ArrayList<Stats> beastIndex = new ArrayList<Stats>();
    public static ArrayList<Stats> beastList = new ArrayList<Stats>();
    public static ArrayList<Move> globalMoveIndex = new ArrayList<Move>();
    public static ArrayList<JButton> JbuttonAddList = new ArrayList<JButton>();
    public static ArrayList<JButton> JbuttonSubtractList = new ArrayList<JButton>();

    public static ArrayList<JLabel> JlabelMod = new ArrayList<JLabel>();



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
        //for (int i = 1; i < JbuttonAddList.size(); i++) {
        //    int finalI = i;
        //    JbuttonAddList.get(i).addActionListener(new ActionListener() {
        //        @Override
        //        public void actionPerformed(ActionEvent e) {
        //            int tempModNum = parseInt((JlabelMod.get(finalI).getText()));
        //            tempModNum++;
        //            JlabelMod.get(finalI).setText(String.valueOf(tempModNum));
        //            System.out.println("Button Worked Too");
        //        }
        //    });
        //}

        hpIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(JhpMod.getText());
                    tempModNum += 5;
                    JhpMod.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        speedIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(JspeedMod.getText());
                    tempModNum += 5;
                    JspeedMod.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        strengthIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(JstrengthMod.getText());
                    tempModNum += 5;
                    JstrengthMod.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        armourIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(Jphysical_armourMod.getText());
                    tempModNum += 5;
                    Jphysical_armourMod.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        mArmourIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(Jmagic_armourMod.getText());
                    tempModNum += 5;
                    Jmagic_armourMod.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        magicIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(JmagicMod.getText());
                    tempModNum += 5;
                    JmagicMod.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        intelIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(JintelMod.getText());
                    tempModNum += 5;
                    JintelMod.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        hpDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                int tempModNum = parseInt(JhpMod.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JhpMod.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        speedDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                int tempModNum = parseInt(JspeedMod.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JspeedMod.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        strengthDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                int tempModNum = parseInt(JstrengthMod.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JstrengthMod.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        armourDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                int tempModNum = parseInt(Jphysical_armourMod.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    Jphysical_armourMod.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        mArmourDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                int tempModNum = parseInt(Jmagic_armourMod.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    Jmagic_armourMod.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        magicDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                int tempModNum = parseInt(JmagicMod.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JmagicMod.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        magicDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                int tempModNum = parseInt(JmagicMod.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JmagicMod.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        intelDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPool.getText());
                int tempModNum = parseInt(JintelMod.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JintelMod.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPool.setText(String.valueOf(tempPoolNum));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
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
