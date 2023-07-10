package com.teachercrm;


/*
Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. If there is such a triplet present in array, then print the triplet and return true.
 Else return false.

Examples:

Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
Output: 12, 3, 9
Explanation: There is a triplet (12, 3 and 9) present
in the array whose sum is 24.
Input: array = {1, 2, 3, 4, 5}, sum = 9
Output: 5, 3, 1
Explanation: There is a triplet (5, 3 and 1) present
in the array whose sum is 9.
 */

import java.util.Arrays;

public class PaloAltoInterview {


    public boolean question (int[] arr, int sum)
    {
        //Sort
        Arrays.sort(arr);

        for(int i=0; i< arr.length -2; i++)
        {
            int target = sum -arr[i];

            int left = i+1;
            int right = arr.length - 1;

            while (left < right)
            {
                if(arr[left] + arr[right] == target) {
                    System.out.println("The result is: " + arr[i] +" " + arr[left] +" " + arr[right]);
                    return true;
                }

                if(arr[left] + arr[right] < target)
                {
                    left++;
                }
                else {
                    right++;
                }

            }
        }
        return false;
    }


    /*
    class MyClass {
    int sum = 0;

    void foo() {
        for (int i=0; i < 100; i++) {
            sum+=1;
        }
    }
}

If we create an instance of MyClass and run foo() on two threads in parallel,
what will be the value in sum after both threads have finished running? If the answer is non-deterministic, what will be the range of values in sum?
     */


}
