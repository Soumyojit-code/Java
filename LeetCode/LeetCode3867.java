// https://leetcode.com/u/soumyojitbanerjee/
// 3867. Sum of GCD of Formed Pairs
import java.util.*;

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        
        int[] prefixMax = new int[n];
        prefixMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }
        
        int[] prefixGcd = new int[n];
        for (int i = 0; i < n; i++) {
            prefixGcd[i] = gcd(nums[i], prefixMax[i]);
        }
        
        Arrays.sort(prefixGcd);
        
        long total = 0;
        int left = 0, right = n - 1;
        while (left < right) {
            total += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }
        return total;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
