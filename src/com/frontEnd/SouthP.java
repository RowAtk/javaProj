package com.frontEnd;

import java.awt.*;
import javax.swing.*;
import com.frontEnd.*;

public class SouthP extends JPanel{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Dimension d = new Dimension(Specs.sWidth, Specs.sHeight);
    JButton[] buttons = new JButton[3];

    public SouthP(){
        super();
        setBackground(Specs.color);
        setPreferredSize(d);

    }
}
