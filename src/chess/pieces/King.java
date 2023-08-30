package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
<<<<<<< HEAD
=======

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoar().getRows()][getBoar().getColumns()];
		return mat;
	}
>>>>>>> e1a0712 (Move pieces)
	
	

}
