package com.teachercrm.neetcode;

public class NumberOfIslands {


    public static  int numIslands(char[][] grid) {
        int islandCounter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {

                    islandCounter++;
                    checkIsland(i, j, grid);

                }
            }
        }

        return islandCounter;
    }

    private static void checkIsland(int i, int j, char[][] grid) {

        grid[i][j]='0';
        if (i > 0 && grid[i - 1][j] == 1)
            checkIsland(i - 1, j, grid);

        if (i < grid.length - 1 && grid[i + 1][j] == 1)
            checkIsland(i + 1, j, grid);

        if (j > 0 && grid[i][j - 1] == 1)
            checkIsland(i, j - 1, grid);

        if (j < grid[0].length && grid[i][j + 1] == 1)
            checkIsland(i, j + 1, grid);


    }

    public static void main(String[] args)
    {
        char[][] myIntArray = new char[4][5];

        myIntArray[0] = new char[]{'1','1','1','1','0'};
        myIntArray[1] = new char[]{'1','1','0','1','0'};
        myIntArray[2] = new char[]{'1','1','0','0','0'};
        myIntArray[3] = new char[]{'0','0','0','0','0'};

        numIslands(myIntArray);

    }
}
