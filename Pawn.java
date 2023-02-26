public class Pawn extends BasePiece {
    
    public Pawn(int row, int column, Color color, Board board) {
        super(row, column, color, PieceType.PAWN, board);
    }

    public Move[] getValidAttackMoves() {
        return null;
    }
}
