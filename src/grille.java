/* TODO Mettre dans un package. */
/* TODO JAVADOC. */
/* TODO Convention Java sur les noms de classe (i.e Classe et non classe). */
public class grille {
    /* TODO JAVADOC. */
    //composition du tableau de jeu (nombres de lignes et de colonnes)
    private final static int nbLigne   = 5;
    /* TODO JAVADOC. */
    private final static int nbColonne = 6;
    /* TODO JAVADOC. */
    private final cellule grille[][];

    /* TODO JAVADOC. */
    //initialisation de la grille de jeu
    public grille() {
        grille = new cellule[nbLigne][nbColonne];

    }

    /* TODO JAVADOC. */
    //fonction d'affichage de la grille
    public grille afficherGrille() {
        for (int i = 0; i <= nbLigne; i++) {
            for (int j = 0; j <= nbColonne; j++) {
                //if grille[i][j] == 0


            }
        } return null;
    }


}
