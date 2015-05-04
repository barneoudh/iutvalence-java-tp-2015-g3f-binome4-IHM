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
		for (int i = 0; i < NBLINE; i++) {
			for (int j = 0; j < NBCOLUMN; j++) {
				grille[i][j] = Piece.EMPTY;
			}
		}
	}

	public String toString() {
		// TODO StringBuilder
		String res = "";
		for (int i = 0; i < NBLINE; i++) {
			for (int j = 0; j < NBCOLUMN; j++) {
				res += String.format("| %s |", grille[i][j]);
			}
			res += "\n";
		}
		return res;
	}
}

