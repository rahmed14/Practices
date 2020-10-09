package com.company;

public class Tree {



    class Node {
        int key;
        Node left, right=null;

        public Node(int item) {
            key = item;
        }

        class BTS{
            Node root=null;
        }

        Node insertRec(Node root, int key) {
            if(root==null){
                root=new Node(key);
                return root;

            }
            if (key < root.key)
                root.left = insertRec(root.left, key);
            else if (key > root.key)
                root.right = insertRec(root.right, key);

            return root;


        }


        }



    public static void main(String[] args) {


    }
}
