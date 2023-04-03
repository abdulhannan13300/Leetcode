88. Merge Sorted Array

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, 
where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

Example 3:
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
************************************************************************
Approach
Start from the end of both the arrays.
i points the last element of nums1 array. j points to the last element of the nums2 array. k points to the last position of nums1 array.
There is difference between the k and i pointer. K points to the last position of the array but the i points to last element that is present in array whiic is non zero.
Compare the current elements of an array and the biggest one will be put in the Kth place. Both the pointers will be decremented after the operation and it will be done till one of the ith or jth pointer becomes zero.
Now Suppose if the ith pointer becomes zero and there are elements remaining in the jth array then they will be stored accordingly using the next while loops and this goes vice versa if the jth becomes zero and there are elements in the ith.
Example explained in the code below pls do see and understand
Code
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        //Start from the end of both the array.
        while(i>=0 && j>=0){
            //Compare the current elements of an array
            //and the biggest one will be put in the Kth place.
            if(nums1[i] < nums2[j])
                nums1[k--] = nums2[j--];
            else
                nums1[k--] = nums1[i--];
        }

        //If one array is completed and the pointer points below zero 
        // and there are elements in the other array then it will put the remaining
        // elements in the Kth position. 
        while(i>=0)
            nums1[k--] = nums1[i--];
        while(j>=0)
            nums1[k--] = nums2[j--];
        
    }
}
//***********************Example Explained**********************//
<!-- nums1 = [2,3,0,0,0], m = 2, nums2 = [1,2,5,6], n = 4
1st Iteration:
i=1 j=3 k=5
while(1>=0 && 3>=0) true
    if(3 < 6) true
        nums1[5] = 6;
        k--; j--;

nums1 = [2,3,0,0,0,6]
2nd Iteration
i=1 j=2 k=4
while(1>=0 && 2>=0) true
    if(3 < 5) true
        nums1[4] = 5;
        k--; j--;

nums1 = [2,3,0,0,5,6]
3rd Iteration
i=1 j=1 k=3
while(1>=0 && 1>=0) true
    if(3 < 4) false
    else
        nums1[3] = 3;
        i--; k--;

nums1 = [2,3,0,3,5,6]
4th Iteration
i=0 j=1 k=2
while(0>=0 && 1>=0)true
    if(2 < 2)false
    else
        nums1[2] = 2;
        i--;k--;

nums1 = [2,3,2,3,5,6]
5th Iteration
i=-1 j=1 k=1
while(-1>=0 && 1>=0) false

while(-1>=0) false
while(1>=0) true
    nums1[1] = 2; 
    k--; j--;

nums1 = [2,2,2,3,5,6]

while(0>=0) true
    nums1[0] = 1; 
    k--; j--;

Result: nums1 = [1,2,2,3,5,6] -->


************************************************************************
