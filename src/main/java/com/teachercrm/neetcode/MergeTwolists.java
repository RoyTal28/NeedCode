package com.teachercrm.neetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwolists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode();
        ListNode prev= result;

        while(list1 !=null && list2 !=null)
        {
            if(list1.val< list2.val)
            {
                prev.next = list1;
                list1=list1.next;
            }
            else {
                prev.next = list2;
                list2 = list2.next;
            }

            prev=prev.next;
        }


        if(list1==null) {
            prev.next = list2;
        }
        else {
            prev.next=list1;
        }

        return result.next;
    }

}
