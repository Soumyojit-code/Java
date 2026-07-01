public class subarray {
    public static int findLongestSubarray(int[] arr, int x) {
        int left=0;
        int currentSum=0;
        int maxLength=0;
        int maxLeft=0;
        for (int right=0; right<arr.length; right++) {
            currentSum += arr[right];
            while (currentSum > x && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                maxLeft = left;
            }
        }
        for(int i = maxLeft; i < maxLeft + maxLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 1, 1, 5};
        int x = 5;

        int result = findLongestSubarray(arr, x);
        System.out.println(result);
    }
}
