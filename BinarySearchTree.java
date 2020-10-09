package com.company;

public class BinarySearchTree {

    public static void main(String[] args) {
        int [] save={3, 2, -1, 5, -4, 0, -9};
        int mid=3;
       System.out.println("the result is: " + sortedArrayToBST(save));
    }

    public static TreeNode01 sortedArrayToBST(int[] nums) {
        TreeNode01 head= new TreeNode01(0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                head.left= new TreeNode01(nums[i]);
            }
            else {
                head.right= new TreeNode01(nums[i]);

            }
        }
        return head;
    }

}

class TreeNode01 {
    int val;
    TreeNode01 left;
    TreeNode01 right;
    TreeNode01() {}
    TreeNode01(int val) { this.val = val; }
    TreeNode01(int val, TreeNode01 left, TreeNode01 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
