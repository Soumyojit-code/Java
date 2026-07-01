public class Subarray {
    
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 8, 4, 9}; 
        int n = arr.length;
        int k = 3;
        
        System.out.println(findMaxOddInSubarray(arr, n, k));
    }

    public static int findMaxOddInSubarray(int[] arr, int n, int k) {
        if (n < k) return 0;

        int currentOddCount = 0;

        for (int i = 0; i < k; i++) {
            if (arr[i] % 2 != 0) {
                currentOddCount++;
            }
        }

        int maxOddCount = currentOddCount;

        for (int i = k; i < n; i++) {
            if (arr[i] % 2 != 0) {
                currentOddCount++;
            }
            if (arr[i - k] % 2 != 0) {
                currentOddCount--;
            }

            maxOddCount = Math.max(maxOddCount, currentOddCount);
        }

        return maxOddCount;
    }
}
