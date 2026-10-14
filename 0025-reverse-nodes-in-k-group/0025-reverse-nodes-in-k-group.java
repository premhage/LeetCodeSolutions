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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode nextNode,prevNode=null;

        while(temp != null){
            ListNode kNode = findKNode(k,temp);

            if(kNode == null){
                if(prevNode != null) prevNode.next = temp;
                break;
            }
            nextNode = kNode.next;
            kNode.next = null;
            reverse(temp);
            if(temp == head){
                head = kNode;
            }
            else{
                prevNode.next = kNode;

            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next= curr.next;
            curr.next =prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }
    private ListNode findKNode(int k, ListNode head){
        ListNode temp = head;
        
        while(temp != null && k > 1){
            k--;
            temp = temp.next;

        }
        return temp;
    }
}