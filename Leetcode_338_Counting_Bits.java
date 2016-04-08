package com.mvolter;

public class Leetcode_338_Counting_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leetcode_338_Counting_Bits test = new Leetcode_338_Counting_Bits();
		int[] result = test.countBits(6);
		for(int i : result) {
			System.out.print(i + ",");
		}
	}
	
    public int[] countBits(int num) {
        int[] counters = new int[num+1];
        
        for(int i=0, c=0; i<=num; i++, c=0) {
        	for(int j=i, k=0; k<32; k++, j >>= 1) c += (j & 1);
        	counters[i] = c;
        }
        
        return counters;
    }

}
