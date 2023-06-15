package com.teachercrm.neetcode;

public class RemoveNthNodeFromEndofList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode left = new ListNode(0, head);
        ListNode right = head;

        //Position right node
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        while (right != null) {
            left = left.next;
            right = right.next;
        }


        ListNode tmp = left.next.next;
        left.next = tmp;

        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        removeNthFromEnd(node, 2);


    }

}
