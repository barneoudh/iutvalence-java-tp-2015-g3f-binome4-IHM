package fr.iutvalence.virgilbontempi.connectfour;

/**
 * Game: the piece.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public enum Piece {

	/**
	 * Color red, "player1" pieces.
	 */
	RED("X"),

	/**
	 * Color yellow, "player2" pieces.
	 */
	YELLOW("O"),

	/**
	 * No color for an empty location.
	 */
	EMPTY(" ");

	private final String display;

	Piece(String disp) {
		display = disp;
	}

	@Override
	public String toString() {
		return display;
	}
}
