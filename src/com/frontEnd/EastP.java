package com.frontEnd;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import com.backEnd.*;

public class EastP extends JPanel implements ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Dimension d = new Dimension(Specs.eWidth, Specs.eHeight);
    static JButton[] buttons = new JButton[4];
    static String restoreButtonText;
    private char[] pin;

    public EastP(){
        super(new GridLayout(4, 20, 4, 20));
        setBackground(Specs.color);
        setOpaque(true);
        setPreferredSize(d);
        setBorder(BorderFactory.createEmptyBorder(0, 20, 15, 15));

        //Buttons
        createButtons(new String[]{"","","","Continue"});

        for(JButton b: buttons){
            //add(b);
        }
    }

    private void createButtons(String[] bLabels){
        for(int x = 0; x<buttons.length; x++){
            buttons[x] = new JButton(bLabels[x]);
            buttons[x].addActionListener(this);
        }
    }

    public static void nameButtons(String one, String two, String three, String four){
        String[] bLabels = {one, two, three, four};
        for(int x = 0; x<buttons.length; x++){
            buttons[x].setText(bLabels[x]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}
