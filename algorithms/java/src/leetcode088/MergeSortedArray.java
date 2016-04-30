package leetcode088;

public class MergeSortedArray {
	
    public void merge(int A[], int m, int B[], int n) {
		int[] tmp = new int[A.length];
		int pA = 0, pB = 0, pT = 0;
		while(pA < m && pB < n){
			if(A[pA] < B[pB]){
				tmp[pT] = A[pA];
				pA++;
			}
			else{
				tmp[pT] = B[pB];
				pB++;
			}
			pT++;
		}
		if(pA == m){
			while(pB < n){
				tmp[pT] = B[pB];
				pB++;
				pT++;
			}
		}
		if(pB == n){
			while(pA < m){
				tmp[pT] = A[pA];
				pA++;
				pT++;
			}
		}
		for(int i=0; i<tmp.length; i++)
			A[i] = tmp[i];       
    }
}
