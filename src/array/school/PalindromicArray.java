package array.school;

public class PalindromicArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{111, 222, 333,444, 555};
        System.out.println(palinArray(arr,arr.length));
    }
    public static int palinArray(int[] a, int n)
    {
        for(int i = 0;i<a.length;i++)
        {
           if(!isPalindrome(a[i]))
              return 0;
        }
        return 1;
    }

    private static boolean isPalindrome(int num)
    {
        String originalnum = String.valueOf(num);
        char[] temp = originalnum.toCharArray();
        int i = 0;
        int j = originalnum.length() - 1;

        while (i <j)
        {
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }
        String reverseNumer = String.valueOf(temp);
        return  originalnum.equals(reverseNumer);
    }
}
