package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position() {
	}

	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 79fe75459f7c2d1ed7a0ebd420c7affea578c264
