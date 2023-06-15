package com.teachercrm.neetcode;

import java.util.*;

public class KClosestPointsToOrigin {

    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> (a[0] * a[0]) + (a[1] * a[1])));

        for(int i=0; i< points.length; i++)
        {
            minHeap.add(points[i]);
        }

        int[][] results = new int[k][2];
        for(int i=0; i<k;i++)
        {
            int[] point = minHeap.poll();
            results[i][0] = point[0];
            results[i][1] = point[1];
        }

        return results;
    }

    public static void main(String[] args) {
//        [[3,3],[5,-1],[-2,4]]
//        int[][] points = new int[3][2];
//        points[0] = new int[]{3,3};
//        points[1] = new int[]{5,-1};
//        points[2] = new int[]{-2,4};


        int[][] points = new int[2][2];
        points[0] = new int[]{0, 1};
        points[1] = new int[]{1, 0};

        System.out.println("The result is: " + kClosest(points, 2));
    }
}
