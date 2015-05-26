package IHM;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color; 
import javax.swing.JButton;
import java.awt.GridLayout; 

public class Window extends JFrame {
	private Panel pan = new Panel();
	private JButton bouton = new JButton("BOUTON");
	private SplitPane splitpane = new SplitPane();

	public Window(){

		this.setTitle("Puissance 4");
	    this.setSize(600,600);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    pan.setBackground(Color.BLACK);
	    this.setContentPane(pan);               
	    this.setVisible(true);
	    
	    
	  }
}
