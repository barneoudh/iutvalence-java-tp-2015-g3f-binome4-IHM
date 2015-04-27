package fr.iutvalence.virgilbontempi.connectfour;

/**
 * Game: the players and the grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Game {
	/**
	 * attribute named "player1" type "Player"
	 */
	private final Player player1;
	/**
	 * attribute named "player2" type "Player"
	 */
	private final Player player2;
	/**
	 * attribute named "grid" type "Grid"
	 */
	private final Grid grid;

	/**
	 * "player1" and "player2" constructors
	 * 
	 * @param name1
	 * @param name2
	 *  
	 * "grid" constructor
	 */
	public Game(final String name1, final String name2) {
		player1 = new Player(name1);
		player2 = new Player(name2);
		grid = new Grid();
	}
}
