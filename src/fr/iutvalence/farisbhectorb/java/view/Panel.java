package fr.iutvalence.farisbhectorb.java.view;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JButton;



public class Panel extends JPanel {
	public Panel(){
		this.setLayout(new GridLayout(0,7));
		this.add(new BoutonDuHaut("1"));
		this.add(new BoutonDuHaut("2"));
		this.add(new BoutonDuHaut("3"));
		this.add(new BoutonDuHaut("4"));
		this.add(new BoutonDuHaut("5"));
		this.add(new BoutonDuHaut("6"));
		this.add(new BoutonDuHaut("7"));

	}

}
