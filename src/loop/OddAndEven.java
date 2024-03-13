package loop;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number" );
        int num= Sc.nextInt();
        int i=1;
        int ES=0,OS=0;
        while (i<=num)
        {
            if (i%2==0)
                ES+=i;
            else
                OS+=i;
            i++;
        }
        System.out.println("Sum of even number="+ES);
        System.out.println("Sum of odd number="+OS);
    }
}
