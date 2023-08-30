package boardgame;

<<<<<<< HEAD
public class Piece {
=======
public abstract class Piece {
>>>>>>> e1a0712 (Move pieces)
	
	protected Position position;
	private Board board;
	
	public Piece() {
		super();
	}

<<<<<<< HEAD
	public Piece(Board boar) {
=======
	public Piece(Board board) {
>>>>>>> e1a0712 (Move pieces)
		super();
		this.board = board;
		position = null;
	}

	protected Board getBoar() {
		return board;
	}
		
<<<<<<< HEAD
	
	
=======
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i  < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
>>>>>>> e1a0712 (Move pieces)
	
}
