package APCscopeandstatement;

public class ques14 {
    public static boolean isFascinating(
            int num)
    {
        int[] freq = new int[10];
        String val = "" + num + num * 2 +
                num * 3;
        for (int i = 0; i < val.length(); i++)
        {
            int digit = val.charAt(i) - '0';

            if (freq[digit]>0 && digit != 0)
                return false;
            else
                freq[digit]++;
        }

        for (int i = 1; i < freq.length; i++)
        {
            if (freq[i] == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        int num = 192;

        if (num < 100)
            System.out.println("No");

        else
        {
            boolean ans = isFascinating(num);
            if (ans)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}