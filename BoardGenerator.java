import java.util.Scanner;

public class BoardGenerator {

    private String fen;

    public BoardGenerator(String fen) {
        this.fen = fen;
    }

    public Board generateBoard() {
        Scanner scanner = new Scanner(fen);
        scanner.useDelimiter("/");
        Board board = new Board();
        String line;
        while (scanner.hasNext()) {
            line = scanner.next();
            Piece piece = null;
            for (int i = 0; i < line.length(); i++) {
                char pieceChar = line.charAt(i);
                int ascii = (int)pieceChar;
                if (ascii < 64) {
                    /* TODO: Do some work */;
                } else {
                    switch (pieceChar) {
                        case 'p' :
                            piece = new Pawn();
                            break;
                        case 'n' :
                            piece = new Knight();
                            break;
                        case 'b' :
                            piece = new Bishop();
                            break;
                        case 'r' :
                            piece = new Rook();
                            break;
                        case 'q' :
                            piece = new Queen();
                            break;
                        case 'k' :
                            piece = new King();
                            break;
                        default :
                            piece = null;
                            break;
                    }


                }
                board.addPiece(piece);
            }
        }

        scanner.close();

        return board;
    }
}
