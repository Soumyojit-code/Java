import java.util.*;

public class LeetCode3315 {
    public int[] minBitwiseArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x == 2) {
                ans[i] = -1;
                continue;
            }
            int p = 0;
            while (((x >> p) & 1) == 1) p++;
            ans[i] = x ^ (1 << (p - 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode3315 s = new LeetCode3315();
        int[] nums = {2, 3, 5, 7};
        int[] res = s.minBitwiseArray(nums);
        System.out.println(Arrays.toString(res));
    }
}
