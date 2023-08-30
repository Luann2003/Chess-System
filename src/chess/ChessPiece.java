package chess;

import boardgame.Board;
import boardgame.Piece;

<<<<<<< HEAD
public class ChessPiece extends Piece {
=======
public abstract class ChessPiece extends Piece {
>>>>>>> e1a0712 (Move pieces)
	
	private Color color;

	public ChessPiece(Board board,Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}


}
