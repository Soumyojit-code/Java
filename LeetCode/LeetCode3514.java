// https://leetcode.com/u/soumyojitbanerjee/

//  Number of Unique XOR Triplets II
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// You are given an integer array nums.

// A XOR triplet is defined as the XOR of three elements nums[i] XOR nums[j] XOR nums[k] where i <= j <= k.

// Return the number of unique XOR triplet values from all possible triplets (i, j, k).

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] has = new boolean[2048];
        for (int num : nums) {
            has[num] = true;
        }
        boolean[] hasTwo = new boolean[2048];
        for (int x = 0; x < 2048; x++) {
            if (has[x]) {
                for (int y = 0; y < 2048; y++) {
                    if (has[y]) {
                        hasTwo[x ^ y] = true;
                    }
                }
            }
        }
        boolean[] hasThree = new boolean[2048];
        for (int t = 0; t < 2048; t++) {
            if (hasTwo[t]) {
                for (int z = 0; z < 2048; z++) {
                    if (has[z]) {
                        hasThree[t ^ z] = true;
                    }
                }
            }
        }
        int count = 0;
        for (boolean b : hasThree) {
            if (b) count++;
        }
        return count;
    }
}
