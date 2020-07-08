
package chess.pieces;

import chesssystem.boardgame.Board;
import chesssystem.boardgame.chess.ChessPiece;
import chesssystem.boardgame.chess.Color;

public class Rook extends ChessPiece{
    
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
    
    
    
}
