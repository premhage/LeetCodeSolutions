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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode middle = findMiddle(head);

        ListNode left = head;
        ListNode right = middle.next;

        middle.next = null;

        left = sortList(left);
        right = sortList(right);

        head = mergeTwoLists(left,right);

        return head;

    }
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dmy=new ListNode(0);
        ListNode current=dmy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                current.next=list1;
                list1=list1.next;
            }else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }
        if(list1!=null){
            current.next=list1;
        }
        if(list2!=null){
            current.next=list2;
        }
        return dmy.next;
    }

    private ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}