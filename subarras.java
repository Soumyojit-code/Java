// write a java to print sum of sub arrays whoes size is k
public class subarray {
    
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 8, 4, 9};
        int n = arr.length;
        int k = 3;
        for (int i = 0; i <= n-k; i++)
        {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            System.out.println(sum);

        }
    }
}
