package fr.iutvalence.virgilbontempi.connectfour;

/**
 * Game: the grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Grid {

	/**
	 * Max line number of the table
	 */
	private static final int NBLINE = 6;

	/**
	 * Max column number of the table
	 */
	private static final int NBCOLUMN = 7;

	/**
	 * Attribute "grille" type "Piece", a tableau with two dimensions
	 */
	private final Piece[][] grille;

	/**
	 * Initialization of "grille"
	 */
	public Grid() {
		this.grille = new Piece[NBLINE][NBCOLUMN];
		/* TODO Initialize your "grille" with Piece.EMPTY */
	}

	/**
	 * Display function of the grid
	 */
	public void afficher() {
		for (int i = 0; i <= NBLINE; i++) {
			for (int j = 0; j <= NBCOLUMN; j++) {
				System.out.println("|  |");
			}
		}
	}
}
