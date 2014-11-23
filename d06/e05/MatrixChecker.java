class MatrixChecker {
	public static boolean isSymmetrical(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if list[i] != list[length-(i+1)] {
				return false;
			}
		}
	}
}



Make a class MatrixChecker with three methods:
• isSymmetrical(int[]) takes an array of int and returns true if the array is symmetrical and false otherwise. An array is symetrical if the element at [0] is the same as the element at [length-1], the element at [1] is the same as the element at [length-2], etc.
• isSymmetrical(int[][]) takes an bidimensional array of int and returns true if the matrix is symmetrical and false otherwise. An matrix is symmetrical if m[i][j] == m[j][i] for any value of i and j.
• isTriangular(int[][]) takes an bidimensional array of int and returns true if the matrix is triangular1 and false otherwise. An matrix is triangular if m[i][j] == 0 for any value of i that is greater than j.
Add some methods to your Matrix class from the other exercise to perform tests on the matrices you create using the methods from MatrixChecker. (Hint: these methods will need to create objects of type MatrixChecker).