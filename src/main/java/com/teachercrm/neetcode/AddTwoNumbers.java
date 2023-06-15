package com.teachercrm.neetcode;

import javax.swing.*;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {



        long firstNumber=0;
        long secondNumber=0;
        long i=0;

        //2 4 3
        while(l1!=null) {
            firstNumber = firstNumber + (long) (l1.val * Math.pow(10,i));
            i++;
            l1= l1.next;
        }

        i=0;

        while(l2!=null) {
            secondNumber =secondNumber + (long) (l2.val * Math.pow(10,i));
            i++;
            l2= l2.next;
        }

        long result = firstNumber + secondNumber;

        ListNode resultNode = new ListNode();
        ListNode current = resultNode;

        if(result==0)
        {
            return new ListNode(0);
        }

        while (result >0)
        {
            current.next = new ListNode((int)(result %10));
            result=result/10;
            current = current.next;
        }

        return resultNode.next;


    }

    public static void main(String args[])
    {
        ListNode num1 = new ListNode(9);
//        1,9,9,9,9,9,9,9,9,9
        ListNode num2 = new ListNode(1,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))))));

        addTwoNumbers(num1,num2);
    }
}
