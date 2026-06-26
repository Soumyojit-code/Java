class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode A1=head;
        ListNode A2=head;
        while(A1!=null && A1.next!=null){
            A1=A1.next.next;
            A2=A2.next;

        }
        return A2;
    }
}
