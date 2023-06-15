package com.teachercrm.neetcode;

import java.util.PriorityQueue;

public class KthLargestNumber {
    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0; i< nums.length; i++)
        {
            minHeap.add(nums[i]);
            if(minHeap.size() > k)
                minHeap.poll();
        }

        return minHeap.poll();
    }


    public static void main(String[] args)
    {
        int[] myIntArray = {3,2,1,5,6,4};
        System.out.println("The result is: " + findKthLargest(myIntArray,2));
    }
}
