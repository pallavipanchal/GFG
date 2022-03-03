package array.basic;

public class BinaryArraySorting
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,0,1,1,1,1,1,0,0,0};
        int[] ans = SortBinaryArray(arr,arr.length);

        for(int i = 0;i< ans.length;i++)
            System.out.print(ans[i]+" ");
    }
    static int[] SortBinaryArray(int arr[], int n)
    {
        int i = 0;
        int j = n-1;

        while (i < j)
        {
            while (i < j && arr[i] == 0)
                i++;
            while (i < j && arr[j] == 1)
                j--;
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        return  arr;
    }
}
