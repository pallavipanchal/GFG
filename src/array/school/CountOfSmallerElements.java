package array.school;

public class CountOfSmallerElements
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 2, 4, 5, 8, 10};
        System.out.println(countOfElements(arr,arr.length,9));
    }
    public static long countOfElements(long arr[], long n, long x)
    {
        long low = 0;
        long high = n-1;

        while (low <= high)
        {
            long mid = low + (high - low) /2;

            if(arr[(int) mid] == x && (mid == 0 || arr[(int) (mid - 1)] < x))
                return  mid;
            else if(arr[(int) mid] > x)
                high = mid - 1;
            else
                low = mid +1;
        }
        return  -1;
    }
}
