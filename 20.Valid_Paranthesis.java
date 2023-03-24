20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
**********************************************************************
class Solution {
    public boolean isValid(String s) {

        //Using stack to store the paranthesis 
        Stack<Character> stack = new Stack<Character>();
        
        //Convering it into the char array.
        for (char c : s.toCharArray()) {
            
            //Push the opposite paranthesis in the stack 
            //if an opening paranthesis is encounter
            if( c == '(')
                stack.push(')');
            else if( c == '{')
                stack.push('}');
            else if( c == '[')
                stack.push(']');

            //Check for the uncertain paranthesis
            //If there is closing paranthesis then it will pop the top and compare it
            //To check if there are no uncertainties.
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
    return stack.isEmpty();    
    }
}
**********************************************************************