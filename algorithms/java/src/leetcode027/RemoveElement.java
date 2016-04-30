package leetcode027;

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int l = A.length;
		for(int i=0; i<l; i++)
			if(A[i] == elem){
				for(int j=i; j<l-1; j++)
					A[j] = A[j+1];
				l--;
				i--;
			}
		return l;
    }
}
