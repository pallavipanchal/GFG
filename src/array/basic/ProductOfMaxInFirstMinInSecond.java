package array.basic;

public class ProductOfMaxInFirstMinInSecond
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 7, 9, 3, 6, 2};
        int[] brr = new int[]{1, 2, 6, -1, 0, 9};
        System.out.println(find_multiplication(arr,brr,arr.length, brr.length));
    }
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++)
            max = Math.max(arr[i],max);
        for(int i = 0;i<m;i++)
            min = Math.min(brr[i],min);

        return  max * min;
    }

}
