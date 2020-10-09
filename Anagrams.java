package com.company;

import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        String[] result={"eat", "tea", "tan", "ate", "nat", "bat"};
       System.out.println( hasmap01(result));
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            //convert the char array to string
            String key = String.valueOf(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    //eat", "tea", "tan", "ate", "nat", "bat"
    public static List<List<String>> hasmap01(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, Integer> hmap = new HashMap<>();
        int index = 0;
        for (String str : strs) {
            //convert string to char array
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            //convert char array to string
            String tempStr = new String(temp);
            if (hmap.containsKey(tempStr))
                ans.get(hmap.get(tempStr)).add(str);
            else {
                ans.add(new ArrayList<String>());
                ans.get(index).add(str);
                hmap.put(tempStr, index);
                index++;
            }
        }
        return ans;


    }
}
