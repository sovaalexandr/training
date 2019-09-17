package com.github.sovaalexandr;

public class ListNode
{
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

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

}
