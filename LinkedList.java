package com.company;

import java.util.Stack;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class LinkedList {
    public void reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        while(head !=null){
            stack.push(head);
            head=head.next;
        }

        while(!stack.isEmpty()){
            ListNode currNode = stack.pop();


        }







    }


}

