public interface Piece {
    public Move[] getValidMoves();
    public Move[] getAttackMoves();
    public void move();
    public Color getColor();
    public int getRow();
    public int getColumn();
    public PieceType getType();
}
