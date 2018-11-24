package com.frontEnd;

import java.awt.*;
import javax.swing.*;
import com.backEnd.*;

public class NorthP extends JPanel{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Dimension d = new Dimension(Specs.nWidth, Specs.nHeight);
    private final JLabel title = new JLabel("JLCB Automated Banking Machine");
    private final JLabel date = new JLabel();

    public NorthP(){
        super();
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBackground(Specs.color);
        setPreferredSize(d);

        //addLabels();
    }
}