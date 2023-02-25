package Pieces;
public interface IPiece {
    public Move[] getValidMoves();
    public Move[] getAttackMoves();
    public void move();
    
}
