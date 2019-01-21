package com.github.sovaalexandr.remove_nth_node_from_end_of_list;

public class RemoveNthNodeFromEndOfList
{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (null == head || 0 == n) throw new RuntimeException("invalid argument");

        ListNode prev = head, current = head.next, end = head;
        for (int i = 0; i < n; i++) {
            if (null == end) throw new RuntimeException("List is not long enough");
            end = end.next;
        }
        if (null == end) return head.next;
        else
            while(null != end.next) {
                prev = current;
                current = current.next;
                end = end.next;
            }
        prev.next = current.next;

        return head;
    }

    static public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ListNode listNode = (ListNode) o;

            if (val != listNode.val) {
                return false;
            }
            return next != null ? next.equals(listNode.next) : listNode.next == null;
        }
    }
}
