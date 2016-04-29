package leetcode338;

public class CountingBits {

    public int[] countBits(int num) {
        int[] counters = new int[num+1];
        
        for(int i=0; i<=num; i++) {
        	int c = 0, j = i;
        	
        	for(int k=0; k<32; k++) {
        		c += (j & 1);
        		j >>= 1;
        	}
        	
        	counters[i] = c;
        }
        
        return counters;
    }
}
