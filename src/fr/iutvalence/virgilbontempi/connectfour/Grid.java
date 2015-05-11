package fr.iutvalence.virgilbontempi.connectfour;

import java.util.Scanner;

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
	public static final int NBLINE = 6;

	/**
	 * Max column number of the table.
	 */
	public static final int NBCOLUMN = 7;

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
				getGrille()[line][column] = Piece.EMPTY;
			}
		}
	}

	/**
	 * Function for the grid.
	 */
	public String toString() {
		StringBuilder res = new StringBuilder();
		for (int line = 0; line < NBLINE; line++) {
			for (int column = 0; column < NBCOLUMN; column++) {
				res.append(String.format("| %s |", getGrille()[line][column]));
			}
			res.append("\n");
		}
		return res.toString();
	}

	/**
	 * Getter Grille;
	 * 
	 * @return
	 */
	public Piece[][] getGrille() {
		return grille;
	}

	/**
	 * Setter Grille.
	 * 
	 */
	public void setGrille(int line, int column, Piece piece) {
		this.grille[line][column] = piece;
	}

}
