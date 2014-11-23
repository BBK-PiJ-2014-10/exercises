public class Matrix {
	
	private int[][] matrix;
	
	public Matrix(int x, int y) {
		this.matrix = new int[x][y];
	}

	public setElement(int whichArray, int whichElement, int newValue) {
		try {
			this.matrix[whichArray][whichElement] = newValue;
		} catch(IndexOutOfBoundsException) {}
	}
	
	public setRow(int whichRow, String listOfNumbers) {
		if ((listOfNumbers.length== this.matrix[whichRow].length) {
			
		}
		for (int i = 0; i < listOfNumbers.length - 1; i++) {
			if listOfNumbers[i] != "," {
				Integer whichColumn = Integer.parseInt(listOfNumbers[i]);
				try {
					this.matrix[whichRow][whichColumn] = whichColumn;
				} catch(IndexOutOfBoundsException) {}
			}
		}
	}

	
}