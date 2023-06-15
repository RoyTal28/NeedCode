package com.teachercrm.neetcode;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();

        for(int i=0; i< charArray.length ; i++)
        {
            if( charArray[i] =='(' || charArray[i] =='[' || charArray[i] =='{') {
                stack.push(charArray[i]);
            }
            else {
                if(charArray[i] == ')' && stack.peek() != '(' ||
                        charArray[i] ==']' && stack.peek()!='[' ||
                        charArray[i]=='}' && stack.peek() != '{')
                {
                    return false;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty() )
            return false;


        return true;
    }
}
