package array.basic;

public class PrintElementsOfArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 5, 3, 2};
        printArray(arr,arr.length);
    }
    static void printArray(int arr[], int n)
    {
        for(int i = 0;i<n;i++)
        {
            System.out.print((arr[i]+" "));
        }
    }
}
