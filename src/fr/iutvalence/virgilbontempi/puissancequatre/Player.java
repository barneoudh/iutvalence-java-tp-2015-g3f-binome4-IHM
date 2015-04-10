package fr.iutvalence.virgilbontempi.puissancequatre;

/**
 * Game: the player's setting.
 * 
 * @author cadetm/bontempv
 * @version 1.0
 */

public class Player {
	private final String name;

	/** Name getter. */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
	}
}
