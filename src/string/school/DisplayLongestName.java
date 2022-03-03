package string.school;

public class DisplayLongestName
{
    public static void main(String[] args)
    {
        String[] arr = {"Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks"};
        System.out.println(longest(arr,arr.length));
    }
    static String longest(String names[], int n)
    {
        int max = Integer.MIN_VALUE;
        String str = "";
        for(int i = 0;i<n;i++)
        {
            if(names[i].length() > max)
            {
                max = names[i].length();
                str = names[i];
            }
        }
        return  str;
    }
}
