package APCscopeandstatement;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("1. Arithmetic Mean");
        System.out.println("2. Geometric Mean");
        System.out.println("3. Harmonic Mean");
        System.out.print("Enter your choice: ");
        int c= Sc.nextInt();
        System.out.println("enter two number");
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        switch (c)
        {
            case 1:
                double ar=(double) (a+b/2);
                System.out.println("Arithmetric Mean ="+ar);
                break;

            case 2:
                double gm=(double) Math.sqrt(a*b);
                System.out.println("Geometric Mean ="+gm);
                break;

            case 3:
                double hm=(double) 2*a*b/(a+b);
                System.out.println("Harmonic Mean ="+hm);
                break;

            default:
                System.out.println("Wrong input");
        }
    }
}
