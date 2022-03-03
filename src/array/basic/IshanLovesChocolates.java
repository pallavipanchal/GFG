package array.basic;

public class IshanLovesChocolates
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 9, 2, 6};
        System.out.println(chocolates(arr,arr.length));
    }
    // Function for finding maximum and value pair
    public static int chocolates (int arr[], int n)
    {
        int i = 0;
        int j = n-1;

        while (i < j)
        {
            if(arr[i] > arr[j])
                i++;
            else if(arr[j] > arr[i])
                j--;
            else i++;
        }
        return  arr[i];
    }
}
