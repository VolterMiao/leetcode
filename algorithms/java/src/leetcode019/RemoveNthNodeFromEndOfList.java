package leetcode019;

import common.ListNode;

public class RemoveNthNodeFromEndOfList {

     public ListNode removeNthFromEnd(ListNode head, int n) {
     	int length = 0;
     	ListNode p = head;
     	if(n == 0) return head;
         while(p != null){
         	p = p.next;
         	length++;
         }
         p = head;
         if(n == length) return p.next;
         else{
         	for(int i=0; i<length-n-1; i++)
         		p = p.next;
         	p.next = p.next.next;
         }
         return head;
     }

}
