package com.frontEnd;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private CentreP centre = new CentreP();
	private NorthP north = new NorthP();
	private SouthP south = new SouthP();
	private WestP west = new WestP();
	private EastP east = new EastP();

	public MainPanel() {
		super(new BorderLayout());
		setPreferredSize(Specs.min);

		add(centre, BorderLayout.CENTER);
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(east, BorderLayout.EAST);
		add(west, BorderLayout.WEST);

	}
}
