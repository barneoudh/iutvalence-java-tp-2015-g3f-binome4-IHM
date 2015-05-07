package fr.iutvalence.virgilbontempi.connectfour;

/**
 * Game: the players and the grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Game
{
	
	/**
	 * Attribute named "player1" type "Player"
	 */
	private final Player player1;
	
	/**
	 * Attribute named "player2" type "Player".
	 */
	private final Player player2;
	
	/**
	 * Attribute named "grid" type "Grid".
	 */
	private final Grid grid;
	
	/**
	 * Attribute named "currentPlayer" type "Player".
	 */
	private Player currentPlayer;

	/**
	 * The "player1" and "player2" constructors.
	 * 
	 * @param name1
	 * @param name2
	 *  
	 * The "grid" constructor.
	 */
	public Game(final String name1, final String name2)
	{
		player1 = new Player(name1);
		player2 = new Player(name2);
		grid = new Grid();
	}
	
	
	/**
	 * Initialization currentPlayer.
	 */
	private void initCurrentPlayer()
	{
		currentPlayer = player1;
	}
	
	
	/**
	 * Function for player switch.
	 */
	private void switchPlayer()
	{
		
		if(currentPlayer == player1) currentPlayer = player2;
		else currentPlayer = player1; 	
	}
	

	/**
	 * Starter function.
	 */
	public void start()
	{
		System.out.println(grid);
	}
	
	
	/**
	 * Play a round.
	 */
	private void playARound(Player currentPlayer)
	{
		// TODO faire la fonction
		
		switchPlayer();
	}
	
	
	
	
}
