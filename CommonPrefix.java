package com.company;

public class CommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String result;

        for (int i = 0; i <= strs.length-1; i++) {
            char[] first  = strs[i].toLowerCase().toCharArray();

            for (int j = i + 1; j <= strs.length - 1; j++) {
                char[] second = strs[j].toLowerCase().toCharArray();

                int index=0;
                String save;
                if (first[index] == second[index])
                {
                    save=""+first[index];
                    index++;
                }

            }
        }
        return "hello";
    }

}
