// https://leetcode.com/u/soumyojitbanerjee/
// 160. Intersection of Two Linked Lists

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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode t1=headA;
        ListNode t2 = headB;
        int s1=0;
        int s2=0;
        while(t1!=null)
        {
            t1=t1.next;
            s1++;
        }
        t1=headA;
         while(t2!=null)
        {
            t2=t2.next;
            s2++;
        }
        t2=headB;
        if(s1>s2)
        {
            int c=s1-s2;
            for(int i=0;i<c;i++)
            {
                 t1=t1.next;
            }
        }
        else 
        {
            int c1=s2-s1;
            for(int i=0;i<c1;i++)
            {
                 t2=t2.next;
            }

        }
        while(t1!=null && t2!=null)
        {
            if(t1==t2)
            {
                return t1;
            }
            
            else
            {
                t1=t1.next;
                t2=t2.next;
            }

        }
        return null;
    }
}
