class Productsubarray {
    public static void main(String[] args)
    {
        int [] arr={ 5,7,2,3,1};
        int count=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                int mul=1;
                mul=arr[i]*arr[j];
                if (mul%2!=0) count++;
                max=Math.max(mul,max);
            }
        }
        int[] arr1 = new int[2];
        arr1[0] = count;
        arr1[1] = max;
        for(int i=0;i<arr1.length;i++)
            System.out.print(arr1[i]+" ");
    }
}
