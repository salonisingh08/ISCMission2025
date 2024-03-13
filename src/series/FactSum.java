package series;

import java.util.Scanner;

public class FactSum {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter no of term");
        int n= Sc.nextInt();
        int f=1,sum=0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                f=f*j;
            }
            sum+=f;
        }
        System.out.println(sum+"= sum");
    }
}
