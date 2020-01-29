/**
 * 
 */

/**
 * @author Stanley Chen	
 *
 */
public class Position{
	private static int positionRow;
	private static int positionColumn;
	
	public Position(int row,int col) {
		positionRow = row;
		positionColumn = col;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getRow());
		
	}
	
	
	
	public static int getRow(){
		return positionRow;
	}
	
	public static int getCol() {
		return positionColumn;
	}

	public void setRow(int newRow) {
		positionRow = newRow;
	}
	
	public void setCol(int newCol) {
		positionColumn = newCol;
	}
	
	public static boolean equals(Position otherPosition) {
		if (Position.equals(otherPosition))
			System.out.println("Same position");
		
		return true;
	}
	
	
}
