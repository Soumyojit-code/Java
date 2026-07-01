//write a java program to find the count of pair gater then k;

class PairSumCount {
    public static void main(String[] args) 
    {
       int [] arr={ 5,7,2,3,1};
       int count=0;
       int k=6;
       for(int i=0;i<arr.length;i++)
       {
            for(int j=i+1;j<arr.length-1;j++)
            {
                int sum=0;
                sum=arr[i]+arr[j];
               if (sum > k)
                count++;
            }
       }
       System.out.println(count);
}
}
