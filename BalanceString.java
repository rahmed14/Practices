package com.company;

public class BalanceString {
    public static void main(String[] args) {
        char[] result={'A','B'};
        balancedStringSplit("LRLRLLRRLLR");
    }
    //RLLLLRRRLR
    public static int balancedStringSplit(String s) {
        int left=0,right=0,res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                left++; //1,2,3
            }
            if(s.charAt(i)=='R'){
                right++; //1,3
            }
            if(left!=0 && right!=0 && left==right){
                res++; //1,2,3
                left=0;
                right=0;
            }
        }
        return res;
    }
}
