package array.basic;

import java.util.Arrays;
import java.util.Collections;

public class MinimizeSumOfProduct
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{3, 1, 1};
        long[] brr = new long[]{6, 5, 4};
        System.out.println(minValue(arr,brr,arr.length));
    }
    public static long minValue(long a[], long b[], long n)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        long end = b.length-1;
        long start = 0;
        long sum = 0;
        while(start != n){
            sum = sum + a[(int) start] * b[(int) end];
            start++;
            end--;
        }
        return sum;
    }
}
