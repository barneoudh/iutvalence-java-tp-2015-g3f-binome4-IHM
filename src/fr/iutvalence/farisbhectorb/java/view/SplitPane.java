package fr.iutvalence.farisbhectorb.java.view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class SplitPane extends JFrame {
	 public SplitPane() {
         
	        setTitle("Puissance 4");
	        setSize(500, 500);
	        Panel panel = new Panel();
	        PanelGrid panelGrid = new PanelGrid();

	        
	        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
	                true, panel, panelGrid);
	         
	        splitPane.setOneTouchExpandable(false);
	        getContentPane().add(splitPane);
	        
	   }
} 
