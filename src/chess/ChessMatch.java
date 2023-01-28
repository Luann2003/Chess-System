package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getColums()] [board.getRows()];
		for(int i =0; i<board.getRows(); i++) {
			for(int j =0; j<board.getColums(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WITHE));
        placeNewPiece('c', 2, new Rook(board, Color.WITHE));
        placeNewPiece('d', 2, new Rook(board, Color.WITHE));
        placeNewPiece('e', 2, new Rook(board, Color.WITHE));
        placeNewPiece('e', 1, new Rook(board, Color.WITHE));
        placeNewPiece('d', 1, new King(board, Color.WITHE));

        placeNewPiece('c', 7, new Rook(board, Color.BlACK));
        placeNewPiece('c', 8, new Rook(board, Color.BlACK));
        placeNewPiece('d', 7, new Rook(board, Color.BlACK));
        placeNewPiece('e', 7, new Rook(board, Color.BlACK));
        placeNewPiece('e', 8, new Rook(board, Color.BlACK));
        placeNewPiece('d', 8, new King(board, Color.BlACK));
	
	}

}
