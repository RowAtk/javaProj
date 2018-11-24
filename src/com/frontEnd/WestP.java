package com.frontEnd;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import com.backEnd.*;
import com.frontEnd.*;

public class WestP extends JPanel implements ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final Dimension d = new Dimension(Specs.wWidth, Specs.wHeight);
    static JButton[] buttons = new JButton[5];

    public WestP() {
        super(new GridLayout(5, 20, 4, 20));
        setBackground(Specs.color);
        setOpaque(true);
        setPreferredSize(d);
        setBorder(BorderFactory.createEmptyBorder(0, 20, 15, 15));

        //Buttons
        createButtons(new String[]{"Add Hall", "View Halls", "Add Room", "Add Resident", "View All"});

        for(JButton b: buttons){
            add(b);
        }

        display();
    }

    private void createButtons(String[] bLabels){
        for(int x = 0; x<buttons.length; x++){
            buttons[x] = new JButton(bLabels[x]);
            buttons[x].addActionListener(this);
        }
    }

    public static void nameButtons(String one, String two, String three, String four) {
        String[] bLabels = {one, two, three, four};
        for (int x = 0; x < buttons.length; x++) {
            buttons[x].setText(bLabels[x]);
        }
    }

    public static void display(){
        //buttons
        for(int x = 0; x<buttons.length; x++){
            if(x < Specs.getLabel().length){
                buttons[x].setLabel(Specs.getLabel()[x]);
                buttons[x].setVisible(true);
            }
            else{
                buttons[x].setVisible(false);
            }
        }

        //fields


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        int buttonNum = Arrays.asList(buttons).indexOf(e.getSource());
        System.out.println(buttonNum);
        switch(buttonNum){

            case 0:
                System.out.println("ADD HALL");
                CentreP.addHall();
        }
    }


}
