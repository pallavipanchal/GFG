package array.school;

public class PrintAlternateElementsArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 4, 5, 8, 10};
        print(arr,arr.length);
    }
    public static void print(int arr[], int n)
    {
        for(int i = 0;i<n;i = i+2)
            System.out.print(arr[i]+" ");
    }
}