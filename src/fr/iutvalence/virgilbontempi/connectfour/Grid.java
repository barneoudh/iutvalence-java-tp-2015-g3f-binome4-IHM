package fr.iutvalence.virgilbontempi.connectfour;

import java.util.Objects;

/**
 * The grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Grid {
	/** Max line number of the table. */
	public static final int NBLINE = 6;
	/** Max column number of the table. */
	public static final int NBCOLUMN = 7;
	/** Attribute "grill" type "Piece", a tableau with two dimensions. */
	private final Piece[][] grill;

	/** Create a new empty grid. */
	public Grid() {
		grill = new Piece[NBLINE][NBCOLUMN];
		for (int line = 0; line < NBLINE; line++) {
			for (int column = 0; column < NBCOLUMN; column++) {
				grill[line][column] = Piece.EMPTY;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder(5 * NBLINE * (NBCOLUMN + 1));
		for (int line = 0; line < NBLINE; line++) {
			for (int column = 0; column < NBCOLUMN; column++) {
				res.append(String.format("| %s |", grill[line][column]));
			}
			res.append('\n');
		}
		return res.toString();
	}

	/** Getter Grill. */
	public Piece[][] getGrille() {
		return grill;
	}

	/** Setter Grill. */
	public void setGrille(int line, int column, Piece piece) {
		grill[line][column] = piece;
	}

	/**
	 * Function piece's placement.
	 * 
	 * @param column
	 */
	public void placementPiece(int column, Piece piece) {
		int line = 0;
		while ((line < Grid.NBLINE) && (grill[line][column] != Piece.EMPTY)) {
			line++;
		}
		setGrille(line - 1, column, piece);
	}

	/**
	 * Function checking column.
	 */
	public boolean isColumnFull(int column) {
		return this.grill[0][column] != Piece.EMPTY;
	}

	/**
	 * Function all columns are full.
	 */
	public boolean areAllColumnFull() {
		for (int column = 0; column < Grid.NBCOLUMN; column++) {
			if (!isColumnFull(column)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Function searching for 4 aligned pieces.
	 */
	public boolean win() {
		for (int line = 0; line < Grid.NBLINE; line++) {
			for (int column = 0; column < Grid.NBCOLUMN; column++) {
				try {
					if (horizontalRight(line, column)
							|| verticalDown(line, column)
							|| diagonalDownRight(line, column)
							|| diagonalDownLeft(line, column)) {
						return true;
					}
				} catch (EmptyPieceException e) {
				System.err.println("All columns are empty.");
				}
			}
		}
		return false;
	}

	/**
	 * Function searching for 4 horizontal right aligned pieces.
	 */
	private boolean horizontalRight(int line, int column)
			throws EmptyPieceException {
		if (grill[line][column] == Piece.EMPTY) {
			throw new EmptyPieceException();
		}
		return (grill[line][column] == grill[line][column + 1])
				&& (grill[line][column + 2] == grill[line][column + 3])
				&& (grill[line][column + 1] == grill[line][column + 2]);
	}

	/**
	 * Function searching for 4 vertical down aligned pieces.
	 */
	private boolean verticalDown(int line, int column)
			throws EmptyPieceException {
		if (grill[line][column] == Piece.EMPTY) {
			throw new EmptyPieceException();
		}
		return (grill[line][column] == grill[line - 1][column])
				&& (grill[line - 2][column] == grill[line - 3][column])
				&& (grill[line - 1][column] == grill[line - 2][column]);
	}

	/**
	 * Function searching for 4 diagonal down right aligned pieces.
	 */
	private boolean diagonalDownRight(int line, int column)
			throws EmptyPieceException {
		if (grill[line][column] == Piece.EMPTY) {
			throw new EmptyPieceException();
		}
		return (grill[line][column] == grill[line + 1][column + 1])
				&& (grill[line + 2][column + 2] == grill[line + 3][column + 3])
				&& (grill[line + 1][column + 1] == grill[line + 2][column + 2]);
	}

	/**
	 * Function searching for 4 diagonal down left aligned pieces.
	 */
	private boolean diagonalDownLeft(int line, int column)
			throws EmptyPieceException {
		if (grill[line][column] == Piece.EMPTY) {
			throw new EmptyPieceException();
		}
		return (grill[line][column] == grill[line + 1][column - 1])
				&& (grill[line + 2][column - 2] == grill[line + 3][column - 3])
				&& (grill[line + 1][column - 1] == grill[line + 2][column - 2]);
	}

}
