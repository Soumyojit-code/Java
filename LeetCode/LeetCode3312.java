// https://leetcode.com/u/soumyojitbanerjee/
// Sorted GCD Pair Queries


class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        int n = nums.length;
        int[] freq = new int[maxVal + 1];

        for (int num : nums) {
            freq[num]++;
        }

        int[] countDivisible = new int[maxVal + 1];
        for (int d = maxVal; d >= 1; d--) {
            int count = 0;
            for (int multiple = d; multiple <= maxVal; multiple += d) {
                count += freq[multiple];
            }
            countDivisible[d] = count;
        }

        long[] gcdCount = new long[maxVal + 1];
        for (int d = maxVal; d >= 1; d--) {
            long totalPairs = (long) countDivisible[d] * (countDivisible[d] - 1) / 2;
            for (int multiple = 2 * d; multiple <= maxVal; multiple += d) {
                totalPairs -= gcdCount[multiple];
            }
            gcdCount[d] = totalPairs;
        }

        long[] prefix = new long[maxVal + 2];
        for (int d = 1; d <= maxVal; d++) {
            long countPairs = gcdCount[d];
            prefix[d] = countPairs;
        }
        for (int i = 1; i <= maxVal; i++) {
            prefix[i] += prefix[i - 1];
        }

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long q = queries[i];
            int gcdVal = binarySearch(prefix, q + 1);
            answer[i] = gcdVal;
        }
        return answer;
    }

    private int binarySearch(long[] prefix, long target) {
        int left = 1, right = prefix.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (prefix[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
