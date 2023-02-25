public abstract class BasePiece implements IPiece {
    protected PieceType type;
    protected Color color;
    protected int row;
    protected int column;
    protected Board board;
    
    protected BasePiece(int row, int column, Color color, PieceType type, Board board) {

    }
    public void move(Move move) {

    }
}
