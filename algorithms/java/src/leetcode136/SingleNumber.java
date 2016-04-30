package leetcode136;

public class SingleNumber {
    public int singleNumber(int[] A) {
        int r = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<A.length; i++){
			if(A[i] > max)
				max = A[i];
			if(A[i] < min)
				min = A[i];
		}
		
		boolean[] appearance = new boolean[max - min + 1];

		for(int i=0; i<A.length; i++)
			appearance[A[i] - min] = !appearance[A[i] - min];
		
		for(int i=0; i<appearance.length; i++)
			if(appearance[i])
				r = i + min;
		return r;
    }
}
