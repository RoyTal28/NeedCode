package com.teachercrm.neetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap
                = new PriorityQueue<>(Collections.reverseOrder());

        //Build the heap
        for(int i=0; i< stones.length; i++) {
            maxHeap.offer(stones[i]);
        }

        while(maxHeap.size() > 1) {

            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if(x==y)
                continue;

            maxHeap.add(x-y);
        }

        if(maxHeap.size() >0) {
            return maxHeap.poll();
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int[] myIntArray = {2,7,4,1,8,1};
        lastStoneWeight(myIntArray);
    }
}
