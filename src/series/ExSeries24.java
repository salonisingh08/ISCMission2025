package series;

import java.util.Scanner;

/*
    1-a2/2+a2/3-a2/4+.........a2/10
 */
public class ExSeries24 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a value of a");
        int a= Sc.nextInt();
         double sum = 0.0;
        for (int i = 1; i <=10 ; i++) {
            if (i%2!=0)
                sum+=(double) Math.pow(a,2)/i;
            else
                sum-=(double) Math.pow(a,2)/i;
        }
        System.out.println("Sum of series="+sum);
    }
}
