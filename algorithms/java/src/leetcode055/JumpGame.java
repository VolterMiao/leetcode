package leetcode055;

public class JumpGame {
    public boolean canJump(int[] A) {
		int maxIndex = 0;
		for(int i=0; i<A.length-1; i++){
			if(A[i] == 0 && maxIndex <=i) return false;
			if(i+A[i] > maxIndex) maxIndex = i+A[i];
		}
		return true;
    }
}
