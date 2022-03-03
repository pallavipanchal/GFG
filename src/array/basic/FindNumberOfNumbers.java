package array.basic;

public class FindNumberOfNumbers
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{11,12,13,14,15};
        System.out.println(num(arr,arr.length,1));
    }
    public static int num(int a[], int n, int k)
    {
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            count = count + getSum(a[i],k);
        }
        return count;
    }

    private static int getSum(int num,int k)
    {
        int count = 0;
        int temp = num;
        while ( temp != 0)
        {
            int t = temp % 10;
            if(t == k)
                count++;
            temp = temp / 10;
        }
        return  count;
    }
}
