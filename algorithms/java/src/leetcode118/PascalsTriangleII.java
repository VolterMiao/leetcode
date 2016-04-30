package leetcode118;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
	public List<Integer> getRow(int rowIndex){
		List<Integer> res = new ArrayList<Integer>();
		res.add(1);
		if(rowIndex == 0) return res;
		int[] rowOld = new int[rowIndex+1];
		rowOld[0] = 1;
		for(int i=0; i<rowIndex; i++){
			int[] rowNew = new int[rowIndex+1];
			rowNew[0] = 1;
			for(int j=1; j<=rowIndex; j++)
				rowNew[j] = rowOld[j-1] + rowOld[j];
			rowOld = rowNew;
		}
		for(int i=1; i<rowOld.length; i++)
			res.add(rowOld[i]);
		return res;
	}
}
