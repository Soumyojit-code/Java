import java.util.*;

class Solution {

    static class State {
        int r, c, broken, dist;
        State(int r, int c, int broken, int dist) {
            this.r = r;
            this.c = c;
            this.broken = broken;
            this.dist = dist;
        }
    }

    public int shortestPath(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][][] visited = new boolean[n][m][2];
        Queue<State> q = new ArrayDeque<>();

        q.offer(new State(0, 0, 0, 1));
        visited[0][0][0] = true;

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        while (!q.isEmpty()) {
            State cur = q.poll();

            if (cur.r == n - 1 && cur.c == m - 1) {
                return cur.dist;
            }

            for (int i = 0; i < 4; i++) {
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];

                if (nr < 0 || nc < 0 || nr >= n || nc >= m) continue;

                if (grid[nr][nc] == 0 && !visited[nr][nc][cur.broken]) {
                    visited[nr][nc][cur.broken] = true;
                    q.offer(new State(nr, nc, cur.broken, cur.dist + 1));
                }

                if (grid[nr][nc] == 1 && cur.broken == 0 && !visited[nr][nc][1]) {
                    visited[nr][nc][1] = true;
                    q.offer(new State(nr, nc, 1, cur.dist + 1));
                }
            }
        }

        return -1;
    }
}
