package fr.iutvalence.virgilbontempi.connectfour;

import java.util.Objects;
import java.util.Scanner;

import fr.iutvalence.virgilbontempi.connectfour.exceptions.FullColumnException;
import fr.iutvalence.virgilbontempi.connectfour.exceptions.OutOfRangeException;

/**
 * Game: the players and the grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Game {
	/** Attribute named "player1" type "Player". */
	private final Player player1;

	/**
	 * Player player1's getter.
	 * 
	 * @return Player player1
	 */
	public Player getPlayer1() {
		return player1;
	}

	/** Attribute named "player2" type "Player". */
	private final Player player2;

	/**
	 * Player player2's getter.
	 * 
	 * @return Player player2
	 */
	public Player getPlayer2() {
		return player2;
	}

	/** Attribute named "grid" type "Grid". */
	private final Grid grid;

	/** Attribute named "currentPlayer" type "Player". */
	private Player currentPlayer;

	/**
	 * Create a new game for the two given players.
	 * 
	 * @param name1
	 * @param name2
	 */
	public Game(final String name1, final String name2) {
		player1 = new Player(name1, Piece.RED);
		player2 = new Player(name2, Piece.YELLOW);
		grid = new Grid();
		currentPlayer = player1;
	}

	/** Switch of player. */
	private void switchPlayer() {
		currentPlayer = (Objects.equals(currentPlayer, player1)) ? player2
				: player1;
	}

	/** Starter function. */
	public void start() {
		System.out.println(grid);

		while (!grid.win() && !grid.areAllColumnFull()) {
			playARound();
			switchPlayer();
		}

		if (grid.win()) {
			switchPlayer();
			System.out.println(currentPlayer + ", you won ! Congratulations !");
		} else {
			System.out.println("Nobody has won");
		}
	}

	/**
	 * Play a round.
	 * 
	 * @param currentPlayer
	 */
	private void playARound() {
		try {
			System.out.format("%s's round ! ", currentPlayer);
			int choosenColumn = inputColumn();
			grid.placementPiece(choosenColumn, currentPlayer.getPiece());
			System.out.println(grid);
		} catch (OutOfRangeException ignore) {
			System.err.println("Insert an other column, the selected column is out of range !");
			playARound();
		} catch (FullColumnException ignore) {
			System.err.println("Insert an other column, the selected column is full !");
			playARound();
		}
	}

	/**
	 * Function input a column.
	 * 
	 * @return int column
	 * @throws OutOfRangeException
	 * @throws FullColumnException
	 */
	public int inputColumn() throws OutOfRangeException, FullColumnException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert a column ranged between 0 and 6 !");
		int column = scanner.nextInt();
		if ((column < 0) || (column >= Grid.NBCOLUMN)) {
			throw new OutOfRangeException();
		}
		if (grid.isColumnFull(column)) {
			throw new FullColumnException();
		}
		return column;
	}

}
