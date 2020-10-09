package com.company;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class Solution {
    static Node head;

    public static void main(String[] args) {
        LinkedList<Integer> object = new LinkedList<Integer>();

        // Adding elements to the linked list
        object.addFirst(0);
        object.add(1);
        object.add(2);
        object.add(3);
        object.add(4);

    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next=null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
    public class ListNode {
        int val;
        ListNode next;
      ListNode(int x)
      {
          val = x;
      }
  }
}
