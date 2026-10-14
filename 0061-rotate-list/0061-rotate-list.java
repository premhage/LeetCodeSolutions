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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
    return head;
}
        ListNode tail = head;
        int len = 1;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }
        if(k % len == 0){
            return head;
        }
        k = k % len;

        tail.next = head;

        ListNode tail2 = findNode(head, len - k);

        head = tail2.next;
        tail2.next = null;
        return head;
    }
    private ListNode findNode(ListNode head , int k){
        k-= 1;
        ListNode temp = head;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
}