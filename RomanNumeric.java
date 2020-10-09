package com.company;

/*Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/

import java.util.HashMap;
import java.util.Map;

public class RomanNumeric {
    public static void main(String[] args) {

        System.out.println(romanToInt01("IVX"));

    }

    static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    public static int romanToInt(String s) {
        System.out.println("length is:"+ s.length());
        if(s == null){
            return 0;
        }
        int total=0;
        for (int i = 0; i < s.length(); i++) {
            // Getting value of symbol s[i]
            int s1 = value(s.charAt(i));

            // Getting value of symbol s[i+1]
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));

                if(s1>=s2){
                    total=total+s1;
                }
                else{
                    total = total + s2 - s1;
                    i++;
                }

            }
            else
            {
                total = total + s1;
                i++;
            }
        }
        return total;
    }
    //M CM XC IV
    //III
    public static int romanToInt01(String s) {
        Map<Character, Integer> practice = new HashMap<>();
        practice.put('I', 1);
        practice.put('V', 5);
        practice.put('X', 10);
        practice.put('L', 50);
        practice.put('C', 100);
        practice.put('D', 500);
        practice.put('M', 500);
        int value03 = practice.get('V');
        System.out.println("after the map ");

        char[] chars = s.toCharArray();
        int total = 0;

        for (int i = 0; i <= chars.length-2; i++) {

            System.out.println("checking before");
            int value = practice.get(chars[i]);
            System.out.println("value : "+ value);
            int value02 = practice.get(chars[i + 1]);
            System.out.println("value02: "+ value);

            if (value > value02) {
                total = +value;
            }
            if (value02 > value) {
                int price = value - practice.get(chars[i - 1]);
                total += price;
            }

        }
        return total;

    }





}
