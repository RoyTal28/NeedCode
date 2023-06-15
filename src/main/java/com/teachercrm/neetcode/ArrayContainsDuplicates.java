package com.teachercrm.neetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> numberSet = new HashSet<>();

        for(int i=0; i< nums.length ; i++)
        {
            if(numberSet.contains(nums[i]) )
                return false;

            numberSet.add(nums[i]);
        }

        return true;
    }
}
