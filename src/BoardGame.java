/**
 * 
 */

/**
 * @author Stanley Chen
 *
 */
public class BoardGame {
	private int board_length;
	private int board_width;
	public Snake theSnake{
		
	}
	
	public String[][] matrix;
	
	/**
	 * @param args
	 */
	public BoardGame(String boardFile) {
		

	}
	
	
	String getObject(int row, int col) {
		return matrix[row][col];
	}
	void setObject(int row,int col,String newObject) {
		newObject = matrix[row][col];
	}
	
	Snake getSnake() {
		return theSnake;
	}
	

}
