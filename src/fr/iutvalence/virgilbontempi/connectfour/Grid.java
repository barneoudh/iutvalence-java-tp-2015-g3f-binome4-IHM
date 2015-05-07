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

		// TODO faire la fonction
	}

	/**
	 * Function searching for 4 aligned pieces.
	 */
	public boolean win() {
		for (int line = 0; line < NBLINE; line++) {
			for (int column = 0; column < NBCOLUMN; column++) {
				if (horizontalRight(line, column)
						|| verticalDown(line, column)
						|| diagonalDownRight(line, column)
						|| diagonalDownLeft(line, column)) {
					return true;
				}
			}
		}
		return false;
	}

	
	/**
	 * Function searching for 4 horizontal right aligned pieces.
	 * 
	 * @param line
	 * @param column
	 * @return
	 */
	private boolean horizontalRight(int line, int column) {
		return ((grille[line][column] == grille[line][column + 1])
				&& (grille[line][column + 2] == grille[line][column + 3]) && (grille[line][column + 1] == grille[line][column + 2]));
	}

	
	/**
	 * Function searching for 4 vertical down aligned pieces.
	 * 
	 * @param line
	 * @param column
	 * @return
	 */
	private boolean verticalDown(int line, int column) {
		return ((grille[line][column] == grille[line - 1][column])
				&& (grille[line - 2][column] == grille[line - 3][column]) && (grille[line - 1][column] == grille[line - 2][column]));
	}

	
	/**
	 * Function searching for 4 diagonal down right aligned pieces.
	 * 
	 * @param line
	 * @param column
	 * @return
	 */
	private boolean diagonalDownRight(int line, int column) {
		return ((grille[line][column] == grille[line + 1][column + 1])
				&& (grille[line + 2][column + 2] == grille[line + 3][column + 3]) && (grille[line + 1][column + 1] == grille[line + 2][column + 2]));
	}

	/**
	 * Function searching for 4 diagonal down left aligned pieces.
	 * 
	 * @param line
	 * @param column
	 * @return
	 */
	private boolean diagonalDownLeft(int line, int column) {
		return ((grille[line][column] == grille[line + 1][column - 1])
				&& (grille[line + 2][column - 2] == grille[line + 3][column - 3]) && (grille[line + 1][column - 1] == grille[line + 2][column - 2]));
	}
}
