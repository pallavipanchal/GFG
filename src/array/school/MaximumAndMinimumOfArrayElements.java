package array.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumAndMinimumOfArrayElements
{
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0)
        {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int n = Integer.parseInt(br.readLine());
            String[] temp = br.readLine().split(" ");
            int[] input = new int[n];
            for(int i = 0;i<n;i++)
            {
                input[i] = Integer.parseInt(temp[i]);
            }
            for(int i = 0;i<n;i++)
            {
                max = Math.max(input[i],max);
                min = Math.min(input[i],min);
            }
            System.out.println(max+" "+min);
        }

    }
}
