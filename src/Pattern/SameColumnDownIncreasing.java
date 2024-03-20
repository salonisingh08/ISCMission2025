package Pattern;
/*
A
A B
A B C
A B C D
A B C D E
 */
public class SameColumnDownIncreasing {
    public static void main(String[] args)
    {
        for (int i = 1; i <=5 ; i++)
        {
            int c=65;
            for (int j = 1; j <=i ; j++) {
                System.out.printf((char)c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
