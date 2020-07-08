
package chess.pieces;

import chesssystem.boardgame.Board;
import chesssystem.boardgame.chess.ChessPiece;
import chesssystem.boardgame.chess.Color;

public class King extends ChessPiece{
    
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
    
    
    
    
}
