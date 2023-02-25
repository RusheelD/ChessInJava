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
            for (int i = 0; i < line.length(); i++) {
                char piece = line.charAt(i);
                int ascii = (int)piece;
                if(ascii < 64) {
                    /* TODO: Do some work */;
                }
            }
        }

        scanner.close();

        return board;
    }
}
