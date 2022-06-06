package com.codebind;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Set;

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
    private JLabel Jarea;
    private JLabel Jtime;
    private JButton setTimeWeather;
    private JTextField beastNameP2;
    private JComboBox beastPickerP2;
    private JTable baseStatsP2;
    private JButton startButtonP2;
    private JButton hpIncreaseP2;
    private JList JMoveListP2;
    private JLabel JhpP2;
    private JLabel JspeedP2;
    private JLabel JstrengthP2;
    private JLabel Jphysical_armourP2;
    private JLabel Jmagic_armourP2;
    private JLabel JmagicP2;
    private JLabel JintelP2;
    private JLabel JtypeP2;
    private JLabel Jtype2P2;
    private JLabel JhpModP2;
    private JLabel JspeedModP2;
    private JLabel JstrengthModP2;
    private JLabel Jphysical_armourModP2;
    private JLabel Jmagic_armourModP2;
    private JLabel JmagicModP2;
    private JLabel JintelModP2;
    private JButton speedIncreaseP2;
    private JButton strengthIncreaseP2;
    private JButton armourIncreaseP2;
    private JButton mArmourIncreaseP2;
    private JButton magicIncreaseP2;
    private JButton intelIncreaseP2;
    private JButton hpDecreaseP2;
    private JButton speedDecreaseP2;
    private JButton strengthDecreaseP2;
    private JButton armourDecreaseP2;
    private JButton mArmourDecreaseP2;
    private JButton magicDecreaseP2;
    private JButton intelDecreaseP2;
    private JLabel JmodPoolP2;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextPane textPane1P2;
    private JButton setTimeWeatherP2;

    public static int p1;
    public static int p2;


    public static ArrayList<Stats> beastIndex = new ArrayList<Stats>();
    public static ArrayList<Stats> beastList = new ArrayList<Stats>();
    public static ArrayList<Move> globalMoveIndex = new ArrayList<Move>();
    public static ArrayList<JButton> JbuttonAddList = new ArrayList<JButton>();
    public static ArrayList<JButton> JbuttonSubtractList = new ArrayList<JButton>();

    public static ArrayList<JLabel> JlabelMod = new ArrayList<JLabel>();



    public App() {

        beastPicker.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    p1 = beastPicker.getSelectedIndex();
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
                    Jhp.setText(String.valueOf(beastIndex.get(p1).hp() + parseInt(JhpMod.getText())));
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
                    Jspeed.setText(String.valueOf(beastIndex.get(p1).speed() + parseInt(JspeedMod.getText())));
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
                    Jstrength.setText(String.valueOf(beastIndex.get(p1).strength() + parseInt(JstrengthMod.getText())));
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
                    Jphysical_armour.setText(String.valueOf(beastIndex.get(p1).physical_armour() + parseInt(Jphysical_armourMod.getText())));
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
                    Jmagic_armour.setText(String.valueOf(beastIndex.get(p1).magic_armour() + parseInt(Jmagic_armourMod.getText())));
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
                    Jmagic.setText(String.valueOf(beastIndex.get(p1).magic() + parseInt(JmagicMod.getText())));
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
                    Jintel.setText(String.valueOf(beastIndex.get(p1).intel() + parseInt(JintelMod.getText())));
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
                    Jhp.setText(String.valueOf(beastIndex.get(p1).hp() + parseInt(JhpMod.getText())));
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
                    Jspeed.setText(String.valueOf(beastIndex.get(p1).speed() + parseInt(JspeedMod.getText())));
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
                    Jstrength.setText(String.valueOf(beastIndex.get(p1).strength() + parseInt(JstrengthMod.getText())));
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
                    Jphysical_armour.setText(String.valueOf(beastIndex.get(p1).physical_armour() + parseInt(Jphysical_armourMod.getText())));
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
                    Jmagic_armour.setText(String.valueOf(beastIndex.get(p1).magic_armour() + parseInt(Jmagic_armourMod.getText())));
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
                    Jmagic.setText(String.valueOf(beastIndex.get(p1).magic() + parseInt(JmagicMod.getText())));
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
                    Jintel.setText(String.valueOf(beastIndex.get(p1).intel() + parseInt(JintelMod.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });

        /**THIS IS WHERE PLAYER 2 STUFF STARTS**/

        beastPickerP2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    p2 = beastPickerP2.getSelectedIndex();
                    JhpP2.setText(String.valueOf(beastIndex.get(beastPickerP2.getSelectedIndex()).hp()));
                    JspeedP2.setText(String.valueOf(beastIndex.get(beastPickerP2.getSelectedIndex()).speed()));
                    JstrengthP2.setText(String.valueOf(beastIndex.get(beastPickerP2.getSelectedIndex()).strength()));
                    Jphysical_armourP2.setText(String.valueOf(beastIndex.get(beastPickerP2.getSelectedIndex()).physical_armour()));
                    Jmagic_armourP2.setText(String.valueOf(beastIndex.get(beastPickerP2.getSelectedIndex()).magic_armour()));
                    JmagicP2.setText(String.valueOf(beastIndex.get(beastPickerP2.getSelectedIndex()).magic()));
                    JintelP2.setText(String.valueOf(beastIndex.get(beastPickerP2.getSelectedIndex()).intel()));

                    JtypeP2.setText(beastIndex.get(beastPickerP2.getSelectedIndex()).type1());
                    Jtype2P2.setText(beastIndex.get(beastPickerP2.getSelectedIndex()).type2());

                    DefaultListModel DLM = new DefaultListModel();
                    for (int i = 0; i < beastIndex.get(beastPickerP2.getSelectedIndex()).moveList.size(); i++) {
                        DLM.addElement(beastIndex.get(beastPickerP2.getSelectedIndex()).moveList.get(i).name());
                    }
                    for (int i = 0; i < beastIndex.get(beastPickerP2.getSelectedIndex()).moveList.size(); i++) {
                        System.out.println(beastIndex.get(beastPickerP2.getSelectedIndex()).moveList.get(i).name());
                    }
                    JMoveListP2.setModel(DLM);

                }
            }
        });

        hpIncreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(JhpModP2.getText());
                    tempModNum += 5;
                    JhpModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    JhpP2.setText(String.valueOf(beastIndex.get(p2).hp() + parseInt(JhpModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        speedIncreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(JspeedModP2.getText());
                    tempModNum += 5;
                    JspeedModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    JspeedP2.setText(String.valueOf(beastIndex.get(p2).speed() + parseInt(JspeedModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        strengthIncreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(JstrengthModP2.getText());
                    tempModNum += 5;
                    JstrengthModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    JstrengthP2.setText(String.valueOf(beastIndex.get(p2).strength() + parseInt(JstrengthModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        armourIncreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(Jphysical_armourModP2.getText());
                    tempModNum += 5;
                    Jphysical_armourModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    Jphysical_armourP2.setText(String.valueOf(beastIndex.get(p2).physical_armour() + parseInt(Jphysical_armourModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        mArmourIncreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(Jmagic_armourModP2.getText());
                    tempModNum += 5;
                    Jmagic_armourModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    Jmagic_armourP2.setText(String.valueOf(beastIndex.get(p2).magic_armour() + parseInt(Jmagic_armourModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        magicIncreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(JmagicModP2.getText());
                    tempModNum += 5;
                    JmagicModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    JmagicP2.setText(String.valueOf(beastIndex.get(p2).magic() + parseInt(JmagicModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        intelIncreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                if (tempPoolNum >= 5) {
                    int tempModNum = parseInt(JintelModP2.getText());
                    tempModNum += 5;
                    JintelModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum -= 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    JintelP2.setText(String.valueOf(beastIndex.get(p2).intel() + parseInt(JintelModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You have no more points in your modifier pool!");
                }
            }
        });
        hpDecreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                int tempModNum = parseInt(JhpModP2.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JhpModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    JhpP2.setText(String.valueOf(beastIndex.get(p2).hp() + parseInt(JhpModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        speedDecreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                int tempModNum = parseInt(JspeedModP2.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JspeedModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    JspeedP2.setText(String.valueOf(beastIndex.get(p2).speed() + parseInt(JspeedModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        strengthDecreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                int tempModNum = parseInt(JstrengthModP2.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JstrengthModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    JstrengthP2.setText(String.valueOf(beastIndex.get(p2).strength() + parseInt(JstrengthModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        armourDecreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                int tempModNum = parseInt(Jphysical_armourModP2.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    Jphysical_armourModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    Jphysical_armourP2.setText(String.valueOf(beastIndex.get(p2).physical_armour() + parseInt(Jphysical_armourModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        mArmourDecreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                int tempModNum = parseInt(Jmagic_armourModP2.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    Jmagic_armourModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    Jmagic_armourP2.setText(String.valueOf(beastIndex.get(p2).magic_armour() + parseInt(Jmagic_armourModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        magicDecreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                int tempModNum = parseInt(JmagicModP2.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JmagicModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    JmagicP2.setText(String.valueOf(beastIndex.get(p2).magic() + parseInt(JmagicModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });
        intelDecreaseP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempPoolNum = parseInt(JmodPoolP2.getText());
                int tempModNum = parseInt(JintelModP2.getText());
                if (tempModNum >= 5) {
                    tempModNum -= 5;
                    JintelModP2.setText(String.valueOf(tempModNum));
                    tempPoolNum += 5;
                    JmodPoolP2.setText(String.valueOf(tempPoolNum));
                    JintelP2.setText(String.valueOf(beastIndex.get(p2).intel() + parseInt(JintelModP2.getText())));
                } else {
                    JOptionPane.showMessageDialog(null, "You can't lower your modifier!");
                }
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempModNum = parseInt(Jhp.getText());
                int tempPoolNum = parseInt(JmodPool.getText());
                int tempModNumP2 = parseInt(JhpP2.getText());
                int tempPoolNumP2 = parseInt(JmodPoolP2.getText());

                if (tempModNum <= 0) {
                    JOptionPane.showMessageDialog(null, "You can not start without picking a beast!");
                }
                if (tempPoolNum > 0) {
                    JOptionPane.showMessageDialog(null, "Please allocate all your modifiers");
                }
                if (tempModNum > 0 && tempPoolNum == 0 && tempModNumP2 == 0 && tempPoolNumP2 > 0) {
                    Battle.start();
                }
                if (tempModNum > 0 && tempPoolNum == 0) {
                    Battle.start();
                }

            }
        });
        setTimeWeather.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Setting.change();
                Jarea.setText(Setting.area);
                if (Setting.time == 1) {
                    Jtime.setText("Day");
                } else {
                    Jtime.setText("Night");
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
        JMoveListP2 = new JList(); //data has type Object[]
        JMoveListP2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JMoveListP2.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        JMoveListP2.setVisibleRowCount(9);

    }

}
