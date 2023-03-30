35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*****************************************************************************************
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start = 0; 
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target) 
                return mid;

            if(nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
    return start;    
    }
}
//******************Explained with example*********************//
<!-- eg: [1,3,5,6,7]  target = 2

start = 0; end = 4; 
1st Iteration:
    mid = 0 + (4-0)/2 = 2;
    if(2 == 7) false
    if(5 < 2) false
    else
        end = mid-1 = 2-1 = 1

2nd Iteration:
start = 0, end = 1, mid = 2
while(0<=1)true
    mid = 0 + (1-0)/2 = 0.5 = 0;
    if(1 == 2) false
    if(1 < 2) true
        start = mid+1 = 0+1 = 1

3rd Iteration:
start = 1, end = 1, mid = 0
while(1 <= 1) true
    mid = 1 + (1-1)/2 = 1
    if(3==2) false
    if(3 < 2) false
    else:
        end = 1-1 = 0

4th Iteration:
start = 1, end = 0, mid = 1
while(1 <= 0) false
    return start i.e 1 -->

//************************************************************//
*****************************************************************************************