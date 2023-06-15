package com.teachercrm.neetcode;

import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class ReorderList {
    public static void reorderList(ListNode head) {

        //find the half of the list

        //Find middle of list using a slow and fast pointer approach
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the second half of the list using a tmp variable
        ListNode second = slow.next;
        ListNode prev = slow.next = null;

        while (second != null) {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        //Re-assign the pointers to match the pattern
        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }


    }

    public static void main(String[] args)
    {
        ListNode start = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4,new ListNode(5)))));
        reorderList(start);
    }
}
