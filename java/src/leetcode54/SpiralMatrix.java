package leetcode54;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0) return res;
        int i=0, j=0;
        int direct = 0;
        int left = -1, top = -1, right = matrix[0].length, bottom = matrix.length;
        
        while(j > left && j < right && i > top && i < bottom){
        	switch(direct){
        	case 0:
        		while(j < right){
        			res.add(matrix[i][j]);
        			j++;
        		}
        		top++;
        		j--;i++;
        		break;
        	case 1:
        		while(i < bottom){
        			res.add(matrix[i][j]);
        			i++;
        		}
        		right--;
        		i--;j--;
        		break;
        	case 2:
        		while(j > left){
        			res.add(matrix[i][j]);
        			j--;
        		}
        		bottom--;
        		j++;i--;
        		break;
        	case 3:
        		while(i > top){
        			res.add(matrix[i][j]);
        			i--;
        		}
        		left++;
        		i++;j++;
        		break;
        	default:
        			break;
        	}
    		direct++;
    		direct %= 4;
        }
        
        return res;
    }
}
