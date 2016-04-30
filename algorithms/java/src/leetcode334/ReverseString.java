package leetcode334;

public class ReverseString {
    public String reverseString(String s) {
    	
    	if(null == s) return null;
    	
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--) {
        	sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}
