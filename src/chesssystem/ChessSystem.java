package chesssystem;

import chesssystem.boardgame.Board;
import chesssystem.boardgame.chess.ChessMatch;

public class ChessSystem {

    public static void main(String[] args) {

        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }

}
