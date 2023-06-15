package com.teachercrm.neetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {


    public boolean hasCycle(ListNode head) {


        Set<ListNode> passed  = new HashSet<>();
        while(head !=null)
        {
            if(passed.contains(head))
                return true;

            passed.add(head);
            head = head.next;
        }

        return false;

    }
}
