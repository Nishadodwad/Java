/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int FindLength(ListNode head)
    {
        if(head==null)
        {
            return 0;
        }
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
        {
            return null;
        }
        int la=FindLength(headA);
        int lb=FindLength(headB);
        int diff=Math.abs(la-lb);
        ListNode ta=headA;
        ListNode tb=headB;
        if(la>lb)
        {
            for(int i=0;i<diff;i++)
            {
                ta=ta.next;
            }
        }
        else
        {
            for(int i=0;i<diff;i++)
            {
                tb=tb.next;
            }
        }

        while(ta!=null)
        {
            if(ta==tb)
            {
                return ta;
            }
            ta=ta.next;
            tb=tb.next;
        }
        return null;
    }
}
