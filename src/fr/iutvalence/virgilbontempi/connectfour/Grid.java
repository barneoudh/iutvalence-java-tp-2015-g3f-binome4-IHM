package fr.iutvalence.virgilbontempi.connectfour;

/**
 * Game: the grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Grid {
    /* TODO Translate. */
    /**
     * Nombre de lignes max du tableau de jeu.
     */
    private static final int NBLINE   = 6;
    /* TODO Translate. */
    /**
     * Nombre de colonnes max du tableau de jeu.
     */
    private static final int NBCOLUMN = 7;
    /* TODO Translate. */
    /**
     * Attribut grille, un tableau � deux dimensions.
     */
    /* TODO Translate. */
    private final Piece[][] grille;

    /* TODO Translate. */
    /**
     * Initialisation de la grille de jeu.
     */
    public Grid() {
        this.grille = new Piece[NBLINE][NBCOLUMN];
        /* TODO Initialize your "grille" with Piece.EMPTY */
    }

    /* TODO JAVADOC. */
    //fonction d'affichage de la grille
    public void afficher() {
        for (int i = 0; i <= NBLINE; i++) {
            for (int j = 0; j <= NBCOLUMN; j++) {
                System.out.println("|  |");
            }
        }
    }
}
