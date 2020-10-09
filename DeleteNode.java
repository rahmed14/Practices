package com.company;

public class DeleteNode {
    public void deleteNode(Node01 node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }

}
class Node01 {
      int val;
      Node01 next;
    Node01(){

    }
    Node01(int x) {
        val = x; }
  }
