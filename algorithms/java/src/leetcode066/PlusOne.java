package leetcode066;

public class PlusOne {
    public int[] plusOne(int[] digits) {
		int carry = 0;
		digits[digits.length-1] += 1;
		for(int i=digits.length-1; i>=0; i--){
			digits[i] += carry;
			if(digits[i] == 10){
				digits[i] %= 10;
				carry = 1;
			}
			else carry = 0;
		}
		if(carry == 1){
			int[] newNum = new int[digits.length+1];
			for(int i=0; i<digits.length; i++)
				newNum[i+1] = digits[i];
			newNum[0] = 1;
			return newNum;
		}
		
		return digits;      
    }
}
