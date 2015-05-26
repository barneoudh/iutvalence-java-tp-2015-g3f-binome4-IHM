package IHM;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelGrid extends JPanel {
	public PanelGrid(){
		
		this.setLayout(new GridLayout(6,7));
		for(int i=0; i<42; i++)
		{
				this.add(new CaseGrid());		
		}
	
			
	}
	

}
