
package com.mycompany.lab_7;

/**
 *
 * @author ksysh
 */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Lab_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 7");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setNorth(frame);
        setWest(frame);
        setEast(frame);
        setCenter(frame);
        setSouth(frame);
        frame.setVisible(true);
    }
        
    public static void setNorth(JFrame fr){
        Box labelBox=new Box(BoxLayout.X_AXIS);
        JLabel[] labels = new JLabel[6];
        for (int i = 0; i < 6; i++){
            labels[i] = new JLabel("Метка " + (i + 1));
            labelBox.add(labels[i]);
            if (i == 2){
                labelBox.add(Box.createHorizontalGlue());
            }else if ((i == 0) || (i == 1) || (i == 3) || (i == 4)){
                labelBox.add(Box.createHorizontalStrut(10));
            }
        }
        fr.getContentPane().add(BorderLayout.NORTH, labelBox);
    }
        
    public static void setWest(JFrame fr){
        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        JButton[] buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttonBox.add(Box.createVerticalStrut(10));
            buttons[i] = new JButton("Кнопка " + (i + 1));
            buttonBox.add(buttons[i]);
            buttonBox.add(Box.createVerticalStrut(10));
        }
        fr.getContentPane().add(BorderLayout.WEST, buttonBox);
    }
        
    public static void setEast(JFrame fr){
        ButtonGroup radioButtonGroup = new ButtonGroup();
        Box radioButtonBox = new Box(BoxLayout.Y_AXIS);
        ArrayList<JRadioButton> masRB = new ArrayList<JRadioButton>();
        for (int i = 0; i < 9; i++){ 
            radioButtonBox.add(Box.createVerticalStrut(10));
            masRB.add(new JRadioButton("Выбор " + (i + 1)));
            radioButtonGroup.add(masRB.get(i));
            radioButtonBox.add(masRB.get(i));
            radioButtonBox.add(Box.createVerticalStrut(15));
            
        }
        masRB.get(6).setSelected(true);
        fr.getContentPane().add(BorderLayout.EAST, radioButtonBox);
    }
        
    public static void setCenter(JFrame fr){
        Box centerBox = new Box(BoxLayout.Y_AXIS);
        centerBox.add(Box.createVerticalStrut(10));
        JTextArea text = new JTextArea("Область текста");
        centerBox.add(text);
        
        Box twoButtonsBox = new Box(BoxLayout.X_AXIS);
        JButton[] buttons = new JButton[2];
        for (int i = 0; i < 2; i++) {
            twoButtonsBox.add(Box.createHorizontalGlue());
            buttons[i] = new JButton("Кнопка " + (i + 1));
            twoButtonsBox.add(buttons[i]);
            twoButtonsBox.add(Box.createHorizontalGlue());
        }
        centerBox.add(Box.createVerticalStrut(10));
        centerBox.add(twoButtonsBox);
        centerBox.add(Box.createVerticalStrut(250));
        
        fr.getContentPane().add(BorderLayout.CENTER, centerBox);
    }
        
    public static void setSouth(JFrame fr){
        Box bottomBox=new Box(BoxLayout.X_AXIS);

        bottomBox.add(Box.createHorizontalStrut(500));
        JPasswordField password = new JPasswordField(10);
        password.setEchoChar('•');
        
        bottomBox.add(password);
        bottomBox.add(Box.createHorizontalStrut(10));
        JButton button = new JButton("Кнопка");
        bottomBox.add(button);
        fr.getContentPane().add(BorderLayout.SOUTH, bottomBox);
    }
}
