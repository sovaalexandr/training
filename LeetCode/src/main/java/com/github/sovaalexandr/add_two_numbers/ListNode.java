package com.github.sovaalexandr.add_two_numbers;

public class ListNode {
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
        if (null == next) {
            return null == listNode.next;
        }
        return next.equals(listNode.next);
    }

    @Override
    public int hashCode()
    {
        int result = val;
        result = 31 * result + (null == next ? 0 : next.hashCode());
        return result;
    }
}
