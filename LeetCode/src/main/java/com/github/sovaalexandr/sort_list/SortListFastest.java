package com.github.sovaalexandr.sort_list;

import com.github.sovaalexandr.ListNode;

public class SortListFastest
{
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode lt = null;
        ListNode gt = null;
        ListNode eq = null;
        int pivot = head.val;

        while (head != null) {
            ListNode node = head;
            head = head.next;
            node.next = null;

            if (node.val == pivot) {
                node.next = eq;
                eq = node;
            } else if (node.val < pivot) {
                node.next = lt;
                lt = node;
            } else {
                node.next = gt;
                gt = node;
            }
        }
        return combine(sortList(lt), combine(eq, sortList(gt)));
    }

    private ListNode combine(ListNode a, ListNode b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        ListNode head = a;
        while (a.next != null) {
            a = a.next;
        }
        a.next = b;
        return head;
    }
}
