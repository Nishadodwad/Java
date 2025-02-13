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
    public ListNode midnode(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null)
        {
            ListNode backup=cur.next;
            cur.next=prev;
            prev=cur;
            cur=backup;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        
        ListNode mid=midnode(head);
        ListNode temp=mid.next;
        mid.next=null;
        //reverse after mid
        temp=reverse(temp);
        
        ListNode cur1=head;
        ListNode cur2=temp;
        while(cur1!=null&&cur2!=null)
        {
            if(cur1.val!=cur2.val)
            {
                return false;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return true;
        
    }
}
