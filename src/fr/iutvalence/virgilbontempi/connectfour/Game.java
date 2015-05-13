package fr.iutvalence.virgilbontempi.connectfour;

import java.util.Objects;
import java.util.Scanner;

/* TODO No "toString()"? */
/**
 * Game: the players and the grid.
 *
 * @author cadetm/bontempv
 * @version 1.0
 */
public class Game {
    /** Attribute named "player1" type "Player". */
    private final Player player1;
    /** Attribute named "player2" type "Player". */
    private final Player player2;
    /** Attribute named "grid" type "Grid". */
    private final Grid   grid;
    /** Attribute named "currentPlayer" type "Player". */
    private       Player currentPlayer;

    /**
     * Create a new game for the two given players.
     * @param name1
     * @param name2
     */
    public Game(final String name1, final String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        grid = new Grid();
        currentPlayer = player1;
    }

    /** Switch of player. */
    private void switchPlayer() {
        currentPlayer = (Objects.equals(currentPlayer, player1)) ? player2 : player1;
    }

    /** Starter function. */
    public void start() {
        System.out.println(grid);

        while (!win() && !areAllColumnFull()) {
            playARound(currentPlayer);
            switchPlayer();
        }

        /* TODO This second call to "win" is costly! */
        if (win()) {
            switchPlayer();
            System.out.println(currentPlayer + ", you won !!! Congratulations");
        }
        else {
            System.out.println("Nobody has won");
        }
    }

    /** Play a round. */
    private void playARound(Player currentPlayer) {
        try {
            int choosenColumn = inputColumn();
            placementPiece(choosenColumn);
            System.out.println(grid);
        }
        catch (OutOfRangeException ignore) {
            System.out.println("Input an other column, the selected column is out of range");
            playARound(currentPlayer);
        }
        catch (FullColumnException ignore) {
            System.out.println("Input an other column, the selected column is full");
            playARound(currentPlayer);
        }
    }

    /**
     * Function input a column.
     * @return int column
     * @throws OutOfRangeException
     * @throws FullColumnException
     */
    public int inputColumn() throws OutOfRangeException, FullColumnException {
        /* TODO You should avoid to create a new Scanner in each call to this method. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a column");
        int column = scanner.nextInt();
        if ((column < Grid.NBCOLUMN) || (column > Grid.NBCOLUMN)) {
            throw new OutOfRangeException();
        }
        if (isColumnFull(column)) {
            throw new FullColumnException();
        }
        return column;
    }

    /* TODO Translate. */
    /* TODO This method has to be moved to Grid. Why do you put it here??? */
    /**
     * Function piece's placement.
     */
    public void placementPiece(int column) {
        int line = 0;
        while ((line < Grid.NBLINE) && (grid.getGrille()[line][column] != Piece.EMPTY)) {
            line++;
        }
        /* TODO Why this test when the only one caller (playARound()) has already the information? */
        if (Objects.equals(currentPlayer, player1)) {
            grid.setGrille(line - 1, column, Piece.RED);
        }
        else {
            grid.setGrille(line - 1, column, Piece.YELLOW);
        }
    }

    /* TODO This method has to be moved to Grid. Why do you put it here??? */
    /**
     * Function checking column.
     */
    public boolean isColumnFull(int column) {
        return this.grid.getGrille()[0][column] != Piece.EMPTY;
    }

    /* TODO This method has to be moved to Grid. Why do you put it here??? */
    /**
     * Function all columns are full.
     */
    public boolean areAllColumnFull() {
        for (int column = 0; column < Grid.NBCOLUMN; column++) {
            if (!isColumnFull(column)) {
                return false;
            }
        }
        return true;
    }

    /* TODO This method has to be moved to Grid. Why do you put it here??? */
    /**
     * Function searching for 4 aligned pieces.
     */
    public boolean win() {
        for (int line = 0; line < Grid.NBLINE; line++) {
            for (int column = 0; column < Grid.NBCOLUMN; column++) {
                try {
                    if (horizontalRight(line, column) || verticalDown(line, column) ||
                        diagonalDownRight(line, column) || diagonalDownLeft(line, column)) {
                        return true;
                    }
                }
                catch (EmptyPieceException e) {
                    /* TODO Nothing ??? */
                }
            }
        }
        return false;
    }

    /* TODO This method has to be moved to Grid. Why do you put it here??? */
    /**
     * Function searching for 4 horizontal right aligned pieces.
     */
    private boolean horizontalRight(int line, int column) throws EmptyPieceException {
        if (grid.getGrille()[line][column] != Piece.EMPTY) {
            throw new EmptyPieceException();
        }
        return (grid.getGrille()[line][column] == grid.getGrille()[line][column + 1]) &&
               (grid.getGrille()[line][column + 2] == grid.getGrille()[line][column + 3]) &&
               (grid.getGrille()[line][column + 1] == grid.getGrille()[line][column + 2]);
    }

    /* TODO This method has to be moved to Grid. Why do you put it here??? */
    /**
     * Function searching for 4 vertical down aligned pieces.
     */
    private boolean verticalDown(int line, int column) throws EmptyPieceException {
        if (grid.getGrille()[line][column] == Piece.EMPTY) {
            throw new EmptyPieceException();
        }
        return (grid.getGrille()[line][column] == grid.getGrille()[line - 1][column]) &&
               (grid.getGrille()[line - 2][column] == grid.getGrille()[line - 3][column]) &&
               (grid.getGrille()[line - 1][column] == grid.getGrille()[line - 2][column]);
    }

    /* TODO This method has to be moved to Grid. Why do you put it here??? */
    /**
     * Function searching for 4 diagonal down right aligned pieces.
     */
    private boolean diagonalDownRight(int line, int column) throws EmptyPieceException {
        if (grid.getGrille()[line][column] != Piece.EMPTY) {
            throw new EmptyPieceException();
        }
        return (grid.getGrille()[line][column] == grid.getGrille()[line + 1][column + 1]) &&
               (grid.getGrille()[line + 2][column + 2] == grid.getGrille()[line + 3][column + 3]) &&
               (grid.getGrille()[line + 1][column + 1] == grid.getGrille()[line + 2][column + 2]);
    }

    /* TODO This method has to be moved to Grid. Why do you put it here??? */
    /**
     * Function searching for 4 diagonal down left aligned pieces.
     */
    private boolean diagonalDownLeft(int line, int column) throws EmptyPieceException {
        if (grid.getGrille()[line][column] != Piece.EMPTY) {
            throw new EmptyPieceException();
        }
        return (grid.getGrille()[line][column] == grid.getGrille()[line + 1][column - 1]) &&
               (grid.getGrille()[line + 2][column - 2] == grid.getGrille()[line + 3][column - 3]) &&
               (grid.getGrille()[line + 1][column - 1] == grid.getGrille()[line + 2][column - 2]);
    }
}
