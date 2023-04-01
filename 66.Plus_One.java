66. Plus One

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading "0's".
Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

**************************************************************
class Solution {
    public int[] plusOne(int[] digits) {
        
        //Start from the last element in the array
        for(int i=digits.length-1; i>=0; i--){
            
            //If the digit is less then nine the we just increment the value by 1
            //i.e. [1,2,8] then just add one to the 8 
            //i.e. [1,2,9]
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            //Now when we have 9 as our last element then we will make our last element as 0
            //and increament the previous
            //i.e [1,2,9] then make last element as 0 -> [1,2,0]
            //then go through the loop again then it will increament the 
            // second last element as [1,3,0].
            digits[i] = 0;
        }
        
        //Now when all the elements in the array are 9 i.e.[9,9,9]
        //Now than according to above loop it will become [ 0,0,0,0 ]
        // but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]


        // to make like above we need to make new array of length--> length+1
        // by default new array values are set to -->0 only
        // thus just changed first value of array to 1 and return the array
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
**************************************************************