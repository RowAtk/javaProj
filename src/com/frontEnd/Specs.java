import backEnd;

import java.awt.*;

public class Specs {

	public static final Color color = Color.lightGray;
	public static final Color panelColor = new Color(90, 154, 215);
	public static final int tWidth = 960, tHeight = 480; // Total Dimensions
	//Border Dimensions
	public static final int eWidth = 200, eHeight = 400,
			wWidth = eWidth, wHeight = eHeight,
			nWidth = tWidth, nHeight = 50,
			sWidth = tWidth, sHeight = 75;
	public static final Dimension min = new Dimension(tWidth, tHeight);

	public static int screen = 0;


	//IGNORE
	public static class Bank {

		public Bank(){};

		public static Banking bank = new Banking();
	}
}
