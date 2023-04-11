136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

Approach
Table for XOR
0 ^ 0 --> 0
0 ^ 1 --> 1
1 ^ 0 --> 1
1 ^ 1 --> 0

We know every number is appears twice except a single number which appears only single time.

See, we already discuss a thing a that xor of a same number with itself is zero, i.e A ^ A = 0
Now, we will look some more property of xor-

xor of a same number with itself is zero, i.e A ^ A = 0
xor is commutative that means a ^ b = b ^ a.
xor of any number with zero is the number itself i.e A ^ 0 = A.
Remember this rule and I have solved an example below the code for better understanding.

Solution
class Solution {
    public int singleNumber(int[] nums) {
        
        int ans = 0;

        for(int i:nums ){
            ans ^= i;
        }
        return ans;
    }
}
//************************Example Explained*************************//
<!-- Suppose our array is arr[]: [4,1,2,1,2]
[4,1,2,1,2] ans = 0;
 ↑
 0 ^ 4 = 4
[4,1,2,1,2] ans = 4;
   ↑
   4 ^ 1 = 5 how 5? remember we are doing XOR on bits.
for above 4 = 0100 and 1 = 0001 now apply XOR table we get 0101 = 5.

[4,1,2,1,2] ans = 5;
     ↑
     5 ^ 2 = 7 how 7? remember we are doing XOR on bits.
for above 5 = 0101 and 2 = 0010 now apply XOR table we get 0111 = 7.

[4,1,2,1,2] ans = 7;
       ↑
       7 ^ 1 = 6 how 8? remember we are doing XOR on bits.
for above 7 = 0111 and 1 = 0001 now apply XOR table we get 0110 = 6.

[4,1,2,1,2] ans = 6;
         ↑
         6 ^ 2 = 4 how 4? remember we are doing XOR on bits.
for above 6 = 0110 and 2 = 0010 now apply XOR table we get 0100 = 4.
//************************************************************// -->