package fr.iutvalence.virgilbontempi.connectfour;

import java.util.Objects;
import java.util.Scanner;

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
    private final Grid grid;
    /** Attribute named "currentPlayer" type "Player". */
    private Player currentPlayer;

    /** Create a new game for the two given players. */
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

    /**
     * Starter function.
     */
    public void start() {
        System.out.println(this.grid);
        while ((this.win() == false) && (this.allColumnAreFull() == false)) {
            this.playARound(currentPlayer);
            this.switchPlayer();
        }
        if (this.win()) {
            this.switchPlayer();
            System.out.println(this.currentPlayer + ", you won !!! Congratulations");
        }
        else {
            System.out.println("Nobody has won");
        }
    }

    /**
     * Play a round.
     */
    private void playARound(Player currentPlayer) {
        try {
            int choosenColumn = inputColumn();
            this.placementPiece(choosenColumn);
            System.out.println(this.grid);
        }
        catch (OutOfRangeException e) {
            System.out.println("Input an other column, the selected column is out of range");
            playARound(currentPlayer);
        }
        catch (FullColumnException f) {
            System.out.println("Input an other column, the selectedcolumn is full");
            playARound(currentPlayer);
        }
    }

    /**
     * Function input column.
     */
    public int inputColumn() throws OutOfRangeException, FullColumnException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a column");
        int column = scanner.nextInt();
        if ((column < Grid.NBCOLUMN) || (column > Grid.NBCOLUMN)) {
            throw new OutOfRangeException();
        }
        if (columnIsFull(column)) {
            throw new FullColumnException();
        }
        return column;
    }

    /**
     * Function piece's placement.
     */
    public void placementPiece(int column) {
        int line = 0;
        while ((line < Grid.NBLINE) && (this.grid.getGrille()[line][column] != Piece.EMPTY)) {
            line++;
        }
        if (currentPlayer == this.player1) {
            this.grid.setGrille(line - 1, column, Piece.RED);
        }
        else {
            this.grid.setGrille(line - 1, column, Piece.YELLOW);
        }
    }

    /**
     * Function checking column.
     */
    public boolean columnIsFull(int column) {
        if (this.grid.getGrille()[0][column] != Piece.EMPTY) { return true; }
        return false;
    }

    /**
     * Function all columns are full.
     */
    public boolean allColumnAreFull() {
        for (int column = 0; column < Grid.NBCOLUMN; column++) {
            if (this.columnIsFull(column) == false) {
                return false;
            }
        }
        return true;
    }

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
                }
            }
        }
        return false;
    }

    /**
     * Function searching for 4 horizontal right aligned pieces.
     */
    private boolean horizontalRight(int line, int column) throws EmptyPieceException {
        if (this.grid.getGrille()[line][column] != Piece.EMPTY) {
            throw new EmptyPieceException();
        }
        return (this.grid.getGrille()[line][column] == this.grid.getGrille()[line][column + 1]) &&
                (this.grid.getGrille()[line][column + 2] == this.grid.getGrille()[line][column + 3]) &&
                (this.grid.getGrille()[line][column + 1] == this.grid.getGrille()[line][column + 2]);
    }

    /**
     * Function searching for 4 vertical down aligned pieces.
     */
    private boolean verticalDown(int line, int column) throws EmptyPieceException {
        if (this.grid.getGrille()[line][column] == Piece.EMPTY) {
            throw new EmptyPieceException();
        }
        return (this.grid.getGrille()[line][column] == this.grid.getGrille()[line - 1][column]) &&
                (this.grid.getGrille()[line - 2][column] == this.grid.getGrille()[line - 3][column]) &&
                (this.grid.getGrille()[line - 1][column] == this.grid.getGrille()[line - 2][column]);
    }

    /**
     * Function searching for 4 diagonal down right aligned pieces.
     */
    private boolean diagonalDownRight(int line, int column) throws EmptyPieceException {
        if (this.grid.getGrille()[line][column] != Piece.EMPTY) {
            throw new EmptyPieceException();
        }
        return (this.grid.getGrille()[line][column] == this.grid.getGrille()[line + 1][column + 1]) &&
                (this.grid.getGrille()[line + 2][column + 2] == this.grid.getGrille()[line + 3][column + 3]) &&
                (this.grid.getGrille()[line + 1][column + 1] == this.grid.getGrille()[line + 2][column + 2]);
    }

    /**
     * Function searching for 4 diagonal down left aligned pieces.
     */
    private boolean diagonalDownLeft(int line, int column) throws EmptyPieceException {
        if (this.grid.getGrille()[line][column] != Piece.EMPTY) {
            throw new EmptyPieceException();
        }
        return (this.grid.getGrille()[line][column] == this.grid.getGrille()[line + 1][column - 1]) &&
                (this.grid.getGrille()[line + 2][column - 2] == this.grid.getGrille()[line + 3][column - 3]) &&
                (this.grid.getGrille()[line + 1][column - 1] == this.grid.getGrille()[line + 2][column - 2]);
    }
}
