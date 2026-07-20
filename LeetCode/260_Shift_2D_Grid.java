https://leetcode.com/u/soumyojitbanerjee/
// Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k = k % total;
        
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            res.add(row);
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int pos = i * n + j;
                int origPos = (pos - k + total) % total;
                int origI = origPos / n;
                int origJ = origPos % n;
                res.get(i).set(j, grid[origI][origJ]);
            }
        }
        
        return res;
    }
}
