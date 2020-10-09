package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> output = new ArrayList<String>();
//23
    public List<String> letterCombinations(String digits) {

        char first=digits.charAt(0);
        char end=digits.charAt(1);
        String str1=phone.get(first);
        String str2=phone.get(end);

//        String keep="";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                char check=str1.charAt(i);
                char check2=str2.charAt(j);
                String keep=""+check+check2;
                output.add(keep);
            }
            }
            return output;
}
    public List<String> letterCombinations1(String digits) {
        if (digits.length() != 0)
            backtrack("", digits);
        return output;
    }

    public void backtrack(String combination, String next_digits) {
        // if there is no more digits to check
        if (next_digits.length() == 0) {
            // the combination is done
            output.add(combination);
        }
        // if there are still digits to check
        else {
            // iterate over all letters which map
            // the next available digit
            String digit = next_digits.substring(0, 1); //23
            String letters = phone.get(digit); //abc def
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i + 1);
                // append the current letter to the combination
                // and proceed to the next digits
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }




}
