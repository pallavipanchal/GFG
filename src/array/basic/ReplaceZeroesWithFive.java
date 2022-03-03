package array.basic;

public class ReplaceZeroesWithFive
{
    public static void main(String[] args)
    {
        System.out.println(convertfive(1004));
    }
    static int convertfive(int num)
    {
        String number = String.valueOf(num);
        char[] temp = number.toCharArray();
        for(int i = 0;i<temp.length;i++)
        {
            if(temp[i] == '0')
                temp[i] = '5';
        }
        return Integer.parseInt(String.valueOf(temp));
    }
}
