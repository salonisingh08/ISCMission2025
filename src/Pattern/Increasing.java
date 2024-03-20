package Pattern;
/*
A
B C
D E F
G H I J
K L M N O
 */
public class Increasing {
    public static void main(String[] args)
    {
        int c=65;
        for (int i = 1; i <=5 ; i++)
        {
            for (int j = 1; j <=i ; j++) {
                System.out.printf((char)c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
