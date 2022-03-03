package array.basic;

public class PlayWithArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        int[] ans = formatArray(arr,arr.length);

        for(int i = 0;i< ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] formatArray(int[] a,int n)
    {
        for(int i = 1;i<n;i++)
        {
            if(i % 2 == 1) // odd index
            {
                if(a[i] < a[i-1])
                {
                    //swap
                    int t = a[i];
                    a[i] = a[i-1];
                    a[i-1] = t;
                }
            }
        }
        return a;
    }
}
