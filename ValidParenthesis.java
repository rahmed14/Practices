package com.company;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        boolean result=isValid02("{[(])}");
        System.out.println("result is:"+ result);
    }
    public void Mapping() {
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] gfg = s.toCharArray();
        if(gfg.length<=1){
            return false;
        }
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('|| c=='{'||c=='['){
                stack.push(c);
            }
            if(c==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }
                }
            if(c=='}'){
                if(stack.peek()=='{'){
                    stack.pop();
                }
            }
            if(c==']'){
                if(stack.peek()=='['){
                    stack.pop();
                }
            }
            }
        return stack.isEmpty();
    }


    public static boolean isValid02(String s) {
        Stack<Character> name= new Stack<>();
        char[] first  = s.toLowerCase().toCharArray();

        for( int x=0;x<first.length;x++){
            if( first[x]=='(' || first[x]=='{' || first[x]=='['){
                 name.push(first[x]);

            }

            else if(first[x]==')'){
                char last=name.lastElement();
                if (last == '(') {
                    name.pop();
                }
            }

            else if(first[x]=='}'){
                char last=name.lastElement();
                if (last == '{') {
                    name.pop();
                }
            }

            else if(first[x]==']'){
                char last=name.lastElement();
                if (last == '[') {
                    name.pop();
                }
            }

        }
        if(name.isEmpty()){
            return true;
        }
        return false;
    }

    }
