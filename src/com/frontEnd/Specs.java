
package com.frontEnd;

import com.backEnd.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Specs {

	public static final Color color = Color.lightGray;
	public static final Color panelColor = new Color(255, 255, 255);
	public static final int tWidth = 960, tHeight = 480; // Total Dimensions
	//Border Dimensions
	public static final int wWidth = 200, wHeight = 0,
			eHeight = 400, eWidth = 0,
			nWidth = tWidth, nHeight = 0,
			sWidth = tWidth, sHeight = 0;
	public static final Dimension min = new Dimension(tWidth, tHeight);

	public static int screen = 0;

	//Buttons
	public static JButton[] buttons = new JButton[5];

	//Labels
	public static JLabel[] labels = new JLabel[5];
	public static String[][] labelStr = {
			{"Add Hall", "View Hall"},
			{"Add Hall", "View Hall", "Add Room"},
			{"Add Hall", "View Hall", "Add Room", "Add Resident"},
			{"Add Hall", "View Hall", "Add Room", "Add Resident", "View Residents"}
	};

	public static String[] getLabel(){
		return labelStr[screen];
	}



}
