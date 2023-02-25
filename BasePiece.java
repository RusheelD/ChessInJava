public abstract class BasePiece implements Piece {
    protected PieceType type;
    protected Color color;
    protected int row;
    protected int column;
    protected Board board;

    protected BasePiece(int row, int column, Color color, PieceType type, Board board) {
        this.row = row;
        this.column = column;
        this.color = color;
        this.type = type;
        this.board = board;
    }

    public void move(Move move) {

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getType() {
        return type;
    }

    public Board getBoard() {
        return board;
    }
}
