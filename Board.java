import java.util.ArrayList;

public class Board {
    ArrayList<Piece> alivePieces;
    Piece[][] grid;
    ArrayList<Piece> blackPieces;
    ArrayList<Piece> whitePieces;
    ArrayList<Piece> takenPieces;

    public Board() {
        this.grid = new Piece[8][8];
        alivePieces = new ArrayList<Piece>();
        blackPieces = new ArrayList<Piece>();
        whitePieces = new ArrayList<Piece>();
        takenPieces = new ArrayList<Piece>();
    }

    public void addPiece(Piece piece) {
        if (piece == null) {
            return;
        }
        int row = piece.getRow();
        int column = piece.getColumn();
        grid[row][column] = piece;
        alivePieces.add(piece);
        if (piece.getColor() == Color.WHITE) {
            whitePieces.add(piece);
        } else {
            blackPieces.add(piece);
        }
    }

    public void takePiece(Piece piece) {
        alivePieces.remove(piece);
        takenPieces.add(piece);
        if (piece.getColor() == Color.WHITE) {
            whitePieces.remove(piece);
        } else {
            blackPieces.remove(piece);
        }
    }

    public void untakePiece(Piece piece) {
        alivePieces.add(piece);
        takenPieces.remove(piece);
        if (piece.getColor() == Color.WHITE) {
            whitePieces.add(piece);
        } else {
            blackPieces.add(piece);
        }
    }
}
