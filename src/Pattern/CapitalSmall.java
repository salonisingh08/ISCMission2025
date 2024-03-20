package Pattern;
/*
a
b C
d E f
g H i J
k L m N o
 */
public class CapitalSmall {
    public static void main(String[] args)
    {
        int c= 97;
        for (int i = 1; i <=5 ; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                if (j%2==0) {
                    System.out.printf((char) (c - 32) + " ");
                    c++;
                }
                else {
                    System.out.printf((char) c + " ");
                    c++;
                }
            }
            System.out.println();
        }
    }
}
