package array.basic;

public class TotalCount
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 8, 10, 13};
        System.out.println(totalCount(arr,arr.length,3));
    }
    static int totalCount(int[] arr, int n, int k)
    {
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum = sum + getSum(arr[i],k);
        }
        return  sum;
    }
    static int getSum(int num,int k)
    {
        int count = 0;
        while (num > 0)
        {
            if(num > k)
            {
                num = num - k;
            }
           else {
                num = 0;
            }
           count++;
        }
        return  count;
    }
}
