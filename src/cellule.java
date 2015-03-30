/* TODO Mettre dans un package. */
/* TODO JAVADOC. */
/* TODO Convention Java sur les noms de classe (i.e Classe et non classe). */
public class cellule {
    /* TODO Pourquoi l'apparence est un caractère ? Il y a tant de possibilités que cela ? */
    /* TODO JAVADOC. */
    private char    apparence;
    /* TODO Pourquoi cellule contient un tableau à deux dimensions de cellules ? */
    /* TODO JAVADOC. */
    private cellule cellule[][];

    /* TODO JAVADOC. */
    public cellule[][] getCellule() {
        return cellule;
    }

    /* TODO JAVADOC. */
    public void setCellule(cellule cellule[][]) {
        this.cellule = cellule;
    }
}
