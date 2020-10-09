package com.company;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] result={"flower","flow","flight"};
        System.out.println("result is:"+longestCommonPrefix(result));

    }
    //"flower","flow","flight"
    public static String longestCommonPrefix(String[] strs) {
        String total=" ";
        int size=strs.length;
        for(int i=0;i<size;i++){
            char prefix=strs[i].charAt(0); //flower
            String s=Character.toString(prefix);
            for(int j=i+1;j<size;j++){ //flow,
                if(strs[i].charAt(0)==strs[j].charAt(0)){
                    total=s; //3
                    i++;
                }
            }
            }
        if( total.contains("")){
            return " ";
        }
        return total;

    }

}
