package fr.iutvalence.virgilbontempi.connectfour;

// TODO No "toString" method ?
/**
 * Player's settings.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Player {

	/** Attribute "name" type "String". */
	private final String name;

	/** Attribute "piece" type "Piece". */
	private Piece piece;

	public Piece getPiece() {
		return piece;
	}

	/**
	 * Build a player by its name.
	 * 
	 * @param piece
	 */
	public Player(String name, Piece piece) {
		this.name = name;
		this.piece = piece;
	}

}
