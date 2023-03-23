14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
***************************************************************
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int i = 0;
        while(i < s1.length() && i < s2.length()){
            if(s1.charAt(i) == s2.charAt(i))
                i++;
            else
                break;
        }
        return s1.substring(0,i);
    }
}
***************************************************************