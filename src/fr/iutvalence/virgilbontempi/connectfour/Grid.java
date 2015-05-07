package fr.iutvalence.virgilbontempi.connectfour;

/**
 * Game: the grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Grid {

	/**
	 * Max line number of the table.
	 */
	private static final int NBLINE = 6;

	/**
	 * Max column number of the table.
	 */
	private static final int NBCOLUMN = 7;
	
	/**
	 * Attribute "grille" type "Piece", a tableau with two dimensions.
	 */
	private final Piece[][] grille;

	/**
	 * Initialization of "grille".
	 */
	public Grid() {
		this.grille = new Piece[NBLINE][NBCOLUMN];
		for (int line = 0; line < NBLINE; line++) {
			for (int column = 0; column < NBCOLUMN; column++) {
				grille[line][column] = Piece.EMPTY;
			}
		}
	}

	
	/**
	 * Function for the grid. 
	 */
	
	public String toString() {
		// TODO StringBuilder
		String res = "";
		for (int line = 0; line < NBLINE; line++) {
			for (int column = 0; column < NBCOLUMN; column++) {
				res += String.format("| %s |", grille[line][column]);
			}
			res += "\n";		
		}
		return res;
	}
	
	public void ChooseColumn() {
		
		
	}
}

