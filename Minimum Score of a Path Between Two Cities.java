class Solution {
    public int minScore(int n, int[][] roads) {
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] road : roads) {
            int a = road[0], b = road[1], dist = road[2];
            graph[a].add(new int[]{b, dist});
            graph[b].add(new int[]{a, dist});
        }
        
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        int minScore = Integer.MAX_VALUE;
        
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int[] neighbor : graph[curr]) {
                int next = neighbor[0];
                int dist = neighbor[1];
                minScore = Math.min(minScore, dist);
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
        
        return minScore;
    }
}
