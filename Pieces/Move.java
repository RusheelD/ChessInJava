package Pieces;

public class Move {
    private int row;
    private int column;
    private boolean undo;
    private PieceType choice;

    public Move (int row, int column, boolean undo, PieceType choice) {
        this.row = row;
        this.column = column;
        this.undo = undo;
        this.choice = choice;
    }

    public Move (int row, int column, boolean undo) {
        this(row, column, undo, null);
    }

    public Move (int row, int column) {
        this(row, column, false, null);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean isUndo() {
        return undo;
    }

    public PieceType getChoice() {
        return choice;
    }

    
}
