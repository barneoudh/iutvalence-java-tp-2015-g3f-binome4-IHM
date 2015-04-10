package fr.iutvalence.virgilbontempi.connectfour;

/**
 * Game: the players and the grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Game {
    /* TODO JAVADOC. */
    private final Player player1;
    /* TODO JAVADOC. */
    private final Player player2;
    /* TODO JAVADOC. */
    private final Grid   grid;

    /* TODO JAVADOC. */
    public Game(final String name1, final String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        grid = new Grid();
    }
}
