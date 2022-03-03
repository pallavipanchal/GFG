package array.basic;

public class LargestElementInArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 8, 7, 56, 90};
        System.out.println(largest(arr,arr.length));
    }
    public static int largest(int arr[], int n)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            max = Math.max(arr[i],max);
        }
        return max;
    }
}
