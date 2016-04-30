package leetcode038;

import java.util.ArrayList;
import java.util.List;

public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String res = "";
        List<Integer> oldList = new ArrayList<Integer>();
        oldList.add(1);
        for(int i=1; i<n; i++){
        	List<Integer> newList = new ArrayList<Integer>();
        	for(int j=0, k=1; j<oldList.size(); j++){
        		while(j<oldList.size()-1 && oldList.get(j) == oldList.get(j+1)){
        			k++;j++;
        		}
        		newList.add(k);
        		newList.add(oldList.get(j));
        		k = 1;
        	}
        	oldList = newList;
        }
        for(int i=0; i<oldList.size(); i++)
        	res += oldList.get(i);
        return res;
    }
}
