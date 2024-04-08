package APCscopeandstatement;

import java.util.Scanner;

public class CircularPrimeNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Entern a number");
        int num= Sc.nextInt();
        int p=num,c=0, f=0,r1,r2;
        while (p>0){
            p/=10;
            c++;
        }
        p=num;
        for (int i = 1; i <=c ; i++) {
            f=1;
            for (int j = 2; j <p ; j++) {
                if (p%j==0)
                    f=0;
                break;
            }
            if (f==1) {
                System.out.println(p);
                r1 = (int) (p / Math.pow(10, c-1));
                r2 = (int) (p % Math.pow(10, c-1));
                p = r2 * 10 + r1;
            }
        }
        if (f==0)
            System.out.println("Not a circular prime");
        else
            System.out.println("Hence,"+num+" is a circular prime");
    }
}
