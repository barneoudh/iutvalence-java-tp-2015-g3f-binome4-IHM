package fr.iutvalence.virgilbontempi.connectfour;

/**
 * The grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Grid {
    /* TODO Translate even the attribute names. */
    /** Max line number of the table. */
    public static final int NBLINE = 6;
    /** Max column number of the table. */
    public static final int NBCOLUMN = 7;
    /** Attribute "grille" type "Piece", a tableau with two dimensions. */
    private final Piece[][] grille;

    /** Create a new empty grid. */
    public Grid() {
        grille = new Piece[NBLINE][NBCOLUMN];
        for (int line = 0; line < NBLINE; line++) {
            for (int column = 0; column < NBCOLUMN; column++) {
                grille[line][column] = Piece.EMPTY;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder(5*NBLINE*(NBCOLUMN+1));
        for (int line = 0; line < NBLINE; line++) {
            for (int column = 0; column < NBCOLUMN; column++) {
                res.append(String.format("| %s |", grille[line][column]));
            }
            res.append('\n');
        }
        return res.toString();
    }

    /* TODO This method should not exist. */
    /** Getter Grille. */
    public Piece[][] getGrille() {
        return grille;
    }

    /* TODO Very bad name! */
    /** Setter Grille. */
    public void setGrille(int line, int column, Piece piece) {
        grille[line][column] = piece;
    }
}
