package com.company;

class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }


//// A Java program to introduce Binary Tree
//class BinaryTree {
//
//    // Root of Binary Tree
//    Node root;
//
//    // Constructors
//    BinaryTree(int key) {
//        root = new Node(key);
//    }
//
//    BinaryTree() {
//        root = null;
//    }



    public static void main(String[] args)
    {
        Node tree = new Node(1);

        /*create root*/
//        tree.root = new Node(1);

        /* following is the tree after above statement

              1
            /   \
          null  null     */

        tree.left = new Node(2);
        tree.right = new Node(3);

        /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */


        tree.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */

        System.out.println("the result is:" + tree.toString());

    }
}