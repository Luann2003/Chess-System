package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece() {
		super();
	}

	public Piece(Board boar) {
		super();
		this.board = board;
		position = null;
	}

	protected Board getBoar() {
		return board;
	}
		
	
	
	
}
