package leetcode086;

import common.ListNode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
    	if(head == null) return null;
    	
    	ListNode ins = head;
        ListNode cur = head;
        
        while(cur.next != null){
        	if(cur.next.val < x){
        		if(ins.val >= x){
        			ListNode p = cur.next;
        			cur.next = p.next;
        			p.next = ins;
        			head = p;	
        			ins = head;
        		}
        		else{
        			while(ins.next.val < x && ins != cur)
        				ins = ins.next;
        			if(ins != cur){
        				ListNode p = cur.next;
        				cur.next = p.next;
        				p.next = ins.next;
        				ins.next = p;
        				ins = ins.next;
        			}
        			else{
        				cur = cur.next;
        			}
        		}
        	}
        	else{
        		cur = cur.next;
        	}
        }     
        
        return head;              
    }
}
