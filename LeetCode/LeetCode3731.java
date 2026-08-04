https://leetcode.com/u/soumyojitbanerjee/

/*You are given an integer array nums consisting of unique integers.

Originally, nums contained every integer within a certain range. However, some integers might have gone missing from the array.

The smallest and largest integers of the original range are still present in nums.

Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.
*/

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

        for (int num : nums) {
            seen.add(num);
            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int x = mn; x <= mx; x++) {
            if (!seen.contains(x)) {
                ans.add(x);
            }
        }

        return ans;
    }
}
