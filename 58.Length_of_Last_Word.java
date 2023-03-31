58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
********************************************************************************
Approach
1. Use variable length as a counter for the solution.
2. Start the loop from the end of the String.
3. Count till the space ' ' is not found which separates the words in the String.
4. At last return the length when we encounter space ' ' in the loop.
Happing Coding!!!

Code
class Solution {
    public int lengthOfLastWord(String s) {
        
        int length=0;

        for(int i=s.length()-1; i>=0; i--){

            if(s.charAt(i) != ' ')
                length++;
            else{
                if(length > 0) 
                    return length;
            }
        }    
        return length;
    }
}
******************************************************************************
