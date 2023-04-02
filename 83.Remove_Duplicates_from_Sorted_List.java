83. Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
Return the linked list sorted as well.

Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
***************************************************************
Approach
Check if the we have any items or one item in the list and return if it is the case.
Now triverse through the whole list and compare.
Check if the current val is equal to the next val. If it is the case then ignore the next val and point the list to the next to next val.
And if the current and the next val are not the same then it will just point to the next val and return the list when whole list is triverse.
Code
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) 
            return head;
        
        ListNode list = head;
        
        while(list.next != null){
            if(list.val == list.next.val)
                list.next = list.next.next;
            else
                list = list.next;
        }
    return head;
    }
}
***************************************************************
