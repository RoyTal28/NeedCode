package com.teachercrm.neetcode;

import java.util.List;

public class BestDayToSellStock {


    public static int maxProfit(int[] prices) {
        int lowest = prices[0];
        int highest =prices[0];
        int lowIndex =0;
        int highIndex=0;
        int maxProfit =0;

        for(int i=0 ; i< prices.length ; i++)
        {
            if(prices[i] < lowest) {
                lowest = prices[i];
                lowIndex = i;
            }

            if(lowIndex > highIndex)
            {
                highest = lowest;
                highIndex= lowIndex;
            }

            if(prices[i] > highest)
            {
                highest = prices[i];
                highIndex = i;
            }

            maxProfit = Math.max(highest - lowest,maxProfit);

        }

        return maxProfit;

    }


    public static void main(String[] args)
    {
        int[] myIntArray = {2,4,1};
        maxProfit(myIntArray);
    }

}
