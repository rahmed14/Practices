package com.company;

import java.util.Stack;

public class ValidParenthesis02 {
    public static void main(String[] args) {
        boolean result=isValid("()[[{}");
        System.out.println("result is:"+ result);
    }

    //()[]{}
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int size=s.length()-1;
        for (int i = 0; i <= size; i++) {
            char count =s.charAt(i);
            if(count=='(' || count=='{' || count=='['){
                stack.push(count);
            }
            if(count==')' ){
                if(stack.peek()=='('){
                    stack.pop();
                }
            }
            if(count=='}' ){
                if(stack.peek()=='{'){
                    stack.pop();
                }
            }
            if(count==']' ){
                if(stack.peek()=='['){
                    stack.pop();
                }
            }

        }
        return stack.isEmpty();
    }
}
