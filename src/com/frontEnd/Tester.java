package com.frontEnd;

import java.util.*;
import javax.swing.*;

public class MainFrame extends JFrame{

	public MainFrame() {
		super("Appointments Management System (AMS) v1.0");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//frame.getContentPane().setLayout(new GridBagLayout());
		//frame.getContentPane().setMinimumSize(MainPanel.min);
		getContentPane().setBackground(Specs.color);
		getContentPane().add(new MainPanel());
		pack();
		setVisible(true);
	}
}