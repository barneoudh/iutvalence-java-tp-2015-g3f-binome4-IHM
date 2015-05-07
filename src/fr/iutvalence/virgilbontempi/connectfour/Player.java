package fr.iutvalence.virgilbontempi.connectfour;

/**
 * Game: the player's setting.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Player
{

	/**
	 * Attribute "name" type "String".
	 */
	private final String name;

	
	/**
	 * The "name" constructor.
	 * 
	 * @param name
	 */
	public Player(String name)
	{
		this.name = name;
	}

	
	/**
	 * Name getter.
	 */
	public String getName()
	{
		return name;
	}
	
	
}
