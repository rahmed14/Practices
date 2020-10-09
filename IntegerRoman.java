package com.company;

import java.util.HashMap;

public class IntegerRoman {
    public static void main(String[] args) {

        intToRoman(121);
    }

    public void Mapping() {
        HashMap<Integer, Character> mappings = new HashMap<Integer, Character>();
        mappings.put(1, 'I');
        mappings.put(5,'V');
        mappings.put(10,'X');
        mappings.put(50,'L');
        mappings.put(100,'C');
        mappings.put(500,'D');
        mappings.put(1000,'M');
    }
    //3
    public static String intToRoman(int num) {
        int[] number = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,3,2,1};
        String[] roman = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","III","II","I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<number.length;i++){
            while(num>=number[i]){
                sb.append(roman[i]);
                num=num-number[i];
            }
        }
        return sb.toString();
    }


}
