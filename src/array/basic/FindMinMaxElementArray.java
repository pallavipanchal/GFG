package array.basic;

public class FindMinMaxElementArray
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{3, 2, 1, 56, 10000, 167};
        pair ans  = getMinMax(arr,arr.length);
        System.out.println(ans.first+" "+ans.second);

    }
    static class pair
    {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }
    static pair getMinMax(long a[], long n)
    {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for(int i =0;i<n;i++)
        {
            max = Math.max(a[i],max);
            min = Math.min(a[i],min);
        }
        return new pair(min,max);
    }
}
