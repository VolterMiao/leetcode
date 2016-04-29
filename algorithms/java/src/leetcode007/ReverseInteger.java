package leetcode007;

public class ReverseInteger {

    public int reverse(int x) {
        int r = 0;
		boolean isNagetive = false;
		if(x < 0){
			isNagetive = true;
			x = -x;
		}
		while(x > 0){
			int unit = x % 10;
			r = r * 10 + unit;
			x /= 10;
		}
		
		if(isNagetive) return -r;
		else return r;
    }
}
