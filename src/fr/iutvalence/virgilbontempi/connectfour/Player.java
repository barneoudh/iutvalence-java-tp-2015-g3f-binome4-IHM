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

    /** Build a player by its name. */
    public Player(String name) {
        this.name = name;
    }

    /* TODO unused ? */
    /** Name getter. */
    public String getName() {
        return name;
    }
}
