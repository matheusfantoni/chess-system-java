package chesssystem;

import chesssystem.boardgame.chess.ChessMatch;
import chesssystem.boardgame.chess.ChessPiece;
import chesssystem.boardgame.chess.ChessPosition;
import java.util.Scanner;

public class ChessSystem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
            
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

        }
    }

}
