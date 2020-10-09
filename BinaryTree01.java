package com.company;

public class BinaryTree01 {

    static class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
    static class Btree{
        // Root of Binary Tree
        Node root;

        // Constructors
        Btree(int key)
        {
             root = new Node(key);
        }

    }

    public static void main(String[] args)
    {
        Node newTree= new Node(1);
        newTree.left=new Node(2);
        newTree.right=new Node(5);

        newTree.left.left=new Node(2);
        newTree.right.right=new Node(3);

        System.out.println("the result is:" + newTree.toString());

//        newTree.key.left= new Node(2);
    }

    }
