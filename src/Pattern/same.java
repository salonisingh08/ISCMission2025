package Pattern;
/*
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
 */
public class same {
    public static void main(String[] args)
    {
        int c=65;
        for (int i = 1; i <=5 ; i++)
        {
            for (int j = 1; j <=5 ; j++)
            {
                System.out.printf((char)c+" ");
            }
            c++;
            System.out.println();
        }
    }
}
