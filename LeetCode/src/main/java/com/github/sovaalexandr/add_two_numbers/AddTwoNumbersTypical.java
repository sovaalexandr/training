package com.github.sovaalexandr.add_two_numbers;

public class AddTwoNumbersTypical
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode top = new ListNode(-1);
        ListNode current = new ListNode(-1);

        top.next = current;

        int carry = 0;
        while (l1 != null || l2 != null) {

            current.next = new ListNode(0);
            current = current.next;

            int a = 0;
            int b = 0;

            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }

            int result = (carry + a + b)%10;
            carry = (carry + a + b)/10;

            current.val = result;

        }

        if (carry == 1){
            current.next = new ListNode(1);
        }

        return top.next.next;
    }
}
