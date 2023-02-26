
/**
 * 
 */
public abstract class BasePiece implements Piece {
    protected PieceType type;
    protected Color color;
    protected int row;
    protected int column;
    protected int stepsTaken;
    protected Board board;
    protected Piece replacement;

    /**
     * @param row
     * @param column
     * @param color
     * @param type
     * @param board
     */
    protected BasePiece(int row, int column, Color color, PieceType type, Board board) {
        this.row = row;
        this.column = column;
        this.color = color;
        this.type = type;
        this.board = board;
    }

    /**
     * 
     * @param move
     */
    public void move(Move move) {

    }

    /**
     * 
     * @return
     */
    public int getRow() {
        return row;
    }

    /**
     *  @return
     */
    public int getColumn() {
        return column;
    }

    /**
     * 
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     * 
     * @return
     */
    public PieceType getType() {
        return type;
    }

    /**
     * 
     * @return
     */
    public Board getBoard() {
        return board;
    }

    /**
     * 
     * @return
     */
    public int getStepsTaken() {
        return stepsTaken;
    }

    /**
     * 
     * @return
     */
    public Piece getReplacement() {
        return replacement;
    }
}
