package series;

import java.util.Scanner;

public class ExSeries {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a value of n");
        int n= Sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i*(i+1);
        }
        System.out.println("Sum of series="+sum);
    }
}
