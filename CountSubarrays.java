public class subarray{
    public static int countSubarrays(int[] nums, int x) {
        int left = 0;
        int currentSum = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum > x && left <= right) {
                currentSum -= nums[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 1, 1, 5};
        int x = 5;

        int totalCount = countSubarrays(nums, x);
        System.out.println(totalCount);
    }
}
