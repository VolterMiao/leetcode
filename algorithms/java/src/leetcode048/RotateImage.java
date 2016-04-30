package leetcode048;

public class RotateImage {
    public void rotate(int[][] matrix) {
		int[][] newMatrix = new int[matrix.length][matrix.length];
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix.length; j++)
				newMatrix[i][j] = matrix[i][j];
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix.length; j++)
				matrix[j][matrix.length-1-i] = newMatrix[i][j];        
    }
}
