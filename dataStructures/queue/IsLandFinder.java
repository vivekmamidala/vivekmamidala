package dataStructures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class IsLandFinder{
    public static void main(String[] args) {
        
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i< grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == 0) continue;
                count += findIsLand(grid, i, j);
            }
        }   
        return count;     
    }

    private int findIsLand(char[][] grid, int i, int j) {
        Queue<Integer> q = new LinkedList<Integer>();
        int rowlen = grid.length;
        int collen = grid[j].length;
        if(i==0) q.add(Character.getNumericValue(grid[rowlen-1][j]));
        else q.add(Character.getNumericValue(grid[i-1][j]));

        if(i==rowlen-1) q.add(Character.getNumericValue(grid[0][j]));
        else q.add(Character.getNumericValue(grid[i+1][j]));

        if(j==0) q.add(Character.getNumericValue(grid[i][collen-1]));
        else q.add(Character.getNumericValue(grid[i][j-1]));

        if(j==collen-1) q.add(Character.getNumericValue(grid[i][0]));
        else q.add(Character.getNumericValue(grid[i][j+1]));

        while(q.remove(o))
        if(grid[i-1][j] == 0 && grid[i+1][j] == 0 && grid[i][j-1] == 0 && grid[i][j+1] == 0) return 1;
        return 0;
    }

}