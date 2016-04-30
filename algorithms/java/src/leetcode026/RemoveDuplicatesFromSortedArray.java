package leetcode026;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] A) {
		int newLength = A.length;
		for(int i=0; i<newLength-1; ){
			if(A[i] == A[i+1]){
				for(int j=i+1; j<newLength-1; j++)
					A[j] = A[j+1];
				newLength--;
			}else i++;
		}

		return newLength;        
    }
}
