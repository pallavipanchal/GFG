package array.school;

public class SwapKthElements
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 3, 6, 1, 2};
        swapKth(arr,arr.length,2);

        for(int i = 0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void swapKth(int arr[], int n, int k)
    {
        int t = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = t;
    }
}
