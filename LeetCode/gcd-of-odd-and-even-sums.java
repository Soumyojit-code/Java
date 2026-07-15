// 3658. GCD of Odd and Even Sums
// https://leetcode.com/u/soumyojitbanerjee/
class Solution {
    public int gcdOfOddEvenSums(int n) 
    {
     long sumOdd = (long) n * n;
     long sumEven = (long) n * (n + 1);
        long a = Math.abs(sumOdd); 
      long b = Math.abs(sumEven);
           while(b>0)
           {
            long tem = b;
            b = a%b;
            a=tem;
           }
        return (int)a;
        
    }
}
