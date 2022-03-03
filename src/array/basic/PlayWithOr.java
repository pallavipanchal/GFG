package array.basic;

public class PlayWithOr
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{10, 11, 1, 2, 3};
        int[] ans = game_with_number(arr,arr.length);

        for(int i = 0;i<ans.length;i++)
            System.out.print(ans[i]+" ");

    }
    public static int[] game_with_number (int arr[], int n)
    {
        for(int i = 0;i<n-1;i++)
        {
            arr[i] = arr[i] | arr[i+1];
        }
        return arr;
    }
}
