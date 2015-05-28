package fr.iutvalence.farisbhectorb.java.view;

import java.awt.Color;
import javax.swing.JButton;

public class BoutonDuHaut extends JButton {
	public BoutonDuHaut(String numColumn){
		setBackground(Color.LIGHT_GRAY);		
		setText(numColumn);
	}

}

