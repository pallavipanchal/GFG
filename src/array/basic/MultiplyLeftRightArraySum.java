package array.basic;

public class MultiplyLeftRightArraySum
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(multiply(arr,arr.length));
    }
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        int mid = n /2;
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0;i<mid;i++)
            leftSum = leftSum + arr[i];
        for(int i = mid;i < n;i++)
            rightSum = rightSum + arr[i];
        return leftSum * rightSum;
    }
}
