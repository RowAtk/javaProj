package com.frontEnd;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.Border;

import com.frontEnd.*;
import com.backEnd.*;

public class CentreP extends JPanel implements ActionListener{

    /**
     *

    private static final long serialVersionUID = 1L;
    private Dimension d = new Dimension(Specs.tWidth - (Specs.sWidth + Specs.eWidth),
            Specs.tHeight - (Specs.nHeight + Specs.sHeight));

    //All Screens
    static Box[] box = {Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(),
            Box.createHorizontalBox()};
    static JLabel error = new JLabel();

    //Login Screen
    static JTextField[] field = {new JTextField(), new JPasswordField(10), new JTextField()};
    static JLabel billBreakdown = new JLabel();
    static JLabel[] label = {new JLabel("Enter Card Number"), new JLabel("Enter Pin"),
            new JLabel("Please select from the buttons on the right"),
            new JLabel("Select Account"), new JLabel("Select Business Account"),
            new JLabel("Balance: "), new JLabel("Enter amount"), new JLabel()};

    //Ac Screen
    static JList[] list = {new JList(), new JList()};

    //Exit Screen
    static JButton exitButton = new JButton("EXIT");
    static boolean exitShow = false;

    static boolean[] show = {true,false, false, false, false, false, false, false, false};
     */

    //Panel Size
    private Dimension d = new Dimension(Specs.tWidth - (Specs.sWidth + Specs.eWidth),
            Specs.tHeight - (Specs.nHeight + Specs.sHeight));

    //Exit Screen
    static JButton exitButton = new JButton("EXIT");
    static boolean exitShow = false;

    //buttons
    static JButton submit = new JButton("Submit");

    //box
    static Box[] box = {Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(),
            Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(),Box.createHorizontalBox()};

    static JTextField[] field = {new JTextField(), new JTextField(), new JTextField(), new JTextField()};
    static JLabel[] labels = {new JLabel("Room Number"), new JLabel("Name"),
            new JLabel("Address"), new JLabel("Contact")};


    public CentreP(){
        super(new FlowLayout());
        setPreferredSize(d);
        setBackground(Specs.panelColor);
        createBorder();

        createDisplay();

    }

    public void display(){

    }

    private void createBorder() {
        Border raisedbevel = BorderFactory.createRaisedBevelBorder();
        Border loweredbevel = BorderFactory.createLoweredBevelBorder();
        Border redLine = BorderFactory.createLineBorder(Color.white);
        Border compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
        setBorder(BorderFactory.createCompoundBorder(redLine, compound));
    }

    public static void addHall(){
        Box[] boxes = {Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(),
                Box.createHorizontalBox()};

        for(int x =0; x < field.length; x++){
            labels[x].setVisible(false);
            field[x].setVisible(false);
        }

        box[7].add(submit);
    }

    private void createDisplay(){

        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        System.out.println("AC");


        box[0].add(Box.createRigidArea(new Dimension(0,50)));

        for(JLabel l: labels){
            box[1].add(l);
        }

        box[2].add(Box.createRigidArea(new Dimension(0,50)));

        box[3].add(field[0]); box[3].add(field[1]);
        box[3].add(field[2]);

        for(Box b: box){
            add(b);
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == exitButton){
            //Main.UI.dispose();
        }
    }
}
