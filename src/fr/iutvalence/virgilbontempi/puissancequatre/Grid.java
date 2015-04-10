package fr.iutvalence.virgilbontempi.puissancequatre;

/**
 * Game: the grid.
 * 
 * @author cadetm/bontempv
 * @version 1.0
 */



/* TODO Mettre dans un package. */
/* TODO JAVADOC. */
public class Grid {
    /**
     * Nombre de lignes max du tableau de jeu. 
     */
    private static final int NBLINE = 6;
    /**
     * Nombre de colonnes max du tableau de jeu.
     * 
     */
    private static final int NBCOLUMN = 7;
    /**
     * Attribut grille, un tableau à deux dimensions.
     */
    private final Piece[][] grille;

    /**
     * Initialisation de la grille de jeu.
     * 
     */
    public Grid() {
        this.grille = new Piece[NBLINE][NBCOLUMN];

    }
    
    /* TODO JAVADOC. */
    //fonction d'affichage de la grille
    public void afficher()
    {
        for (int i = 0; i <= NBLINE; i++)
        {
        	 for (int j = 0; j <= NBCOLUMN; j++)
        	 {
        		 System.out.println("|  |");
        	 }
        	//if grille[i][j] == 0


            
        }
    }


}
