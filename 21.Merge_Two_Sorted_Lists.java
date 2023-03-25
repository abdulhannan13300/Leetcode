21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
*******************************************************************
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Take a dummy node in the list first and then assign tail variable to it.
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        //Run the loop till both the list are not null.
        //It will exit the loops as soon as one list is empty.
        while(list1 != null && list2 != null){

        //Check if the element in L1 is smaller or equal to L2. 
        //If true add it to the tail of the new list created and 
        //increment the L1 list pointer to the next element.    
                if(list1.val <= list2.val){
                    tail.next = list1;
                    list1 = list1.next;
                }
        //If false it will do the same above process for the L2 list.
                else{
                    tail.next = list2;
                    list2 = list2.next;
                }
        //After the else it will increament the pointer of the Output list 
        //to store the next value after every iteration.
            tail = tail.next;
        }
// Now if the no. of elements in one of the list is unequal 
// it will check for which of the list is having remaining elements 
// and then it will append the remaining list to the end. 
        tail.next=list1 == null ? list2 : list1;

        return dummy.next;
    }
}
*******************************************************************