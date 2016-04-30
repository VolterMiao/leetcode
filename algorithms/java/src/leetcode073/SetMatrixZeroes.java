package leetcode073;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        List<Integer> x = new ArrayList<Integer>();
              
        for(int i=0; i<matrix.length; i++){
        	boolean hasZero = false;
        	for(int j=0; j<matrix[0].length; j++){
        		if(matrix[i][j] == 0){ 
        			hasZero = true;
        			if(!x.contains(Integer.valueOf(j))) x.add(Integer.valueOf(j));
        		}
        	}
        	if(hasZero)
        		for(int k=0; k<matrix[0].length; k++)
        			matrix[i][k] = 0;
        }
        
        for(int i=0; i<x.size(); i++)
        	for(int k=0; k<matrix.length; k++)
        		matrix[k][x.get(i)] = 0;
    }
}
