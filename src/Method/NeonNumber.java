package Method;

import java.util.Scanner;

public class NeonNumber {
    static int sum = 0;

    int neon(int n)
    {

        int square = n * n;

        while(square != 0)
        {

            int digit = square % 10;

            sum = sum + digit;

            square = square / 10;
        }
        return(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NeonNumber obj=new NeonNumber();
        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();
        obj.neon(n);
        if(n == sum) {
            System.out.println(n + " is a Neon Number.");
        } else
            System.out.println(n + " is not a Neon Number.");
    }
}
