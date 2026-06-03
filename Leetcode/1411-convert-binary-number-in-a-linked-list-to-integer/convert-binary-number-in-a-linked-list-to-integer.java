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
    public int getDecimalValue(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int decimal = 0;
        while(head!=null){
            int a=count-1;
            int b =1;
            while(a>0){
               b = b*2;
               a--;
            }

            decimal=decimal+head.val*b;
            head=head.next;
            count--;
        }
        return decimal;
    }
}