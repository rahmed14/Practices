package com.company;

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class SameTree {


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p.left != q.left || p.right != q.right || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }


    public boolean isSameTree02(TreeNode p, TreeNode q) {
        if (p == null && q == null) {


            if (p.val != q.val || p.left != q.left || p.right != q.right) {
                return false;
            }

            isSameTree02(p.left, q.left);
            isSameTree02(p.right, q.right);


        }
        return true;
    }
}
