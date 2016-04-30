package leetcode075;

public class SortColors {
    public void sortColors(int[] A) {
        int[] counter = new int[3];
		for(int i=0; i<A.length; i++)
			counter[A[i]]++;
		for(int i=0; i<counter[0]; i++)
			A[i] = 0;
		for(int i=0; i<counter[1]; i++)
			A[i+counter[0]] = 1;
		for(int i=0; i<counter[2]; i++)
			A[i+counter[0]+counter[1]] = 2;
    }
}
