https://leetcode.com/u/soumyojitbanerjee/

/* Alice and Bob play a game with piles of stones. There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].

The objective of the game is to end with the most stones. The total number of stones across all the piles is odd, so there are no ties.

Alice and Bob take turns, with Alice starting first. Each turn, a player takes the entire pile of stones either from the beginning or from the end of the row.
This continues until there are no more piles left, at which point the person with the most stones wins.

 Assuming Alice and Bob play optimally, return true if Alice wins the game, or false if Bob wins.*/

class Solution {
public:
    bool predictTheWinner(vector<int>& nums) {
        int n = nums.size();

        vector<vector<int>> dp(n, vector<int>(n, 0));

        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                int takeLeft = nums[i] - dp[i + 1][j];

                int takeRight = nums[j] - dp[i][j - 1];

                dp[i][j] = max(takeLeft, takeRight);
            }
        }

        return dp[0][n - 1] >= 0;
    }
};
