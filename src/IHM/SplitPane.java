package IHM;
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
	 
	 public static void main(String[] args) {
         
	        SplitPane sp = new SplitPane();
	        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        sp.setVisible(true);
	   }
}
