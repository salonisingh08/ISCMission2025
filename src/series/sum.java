package series;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        System.out.println("Enter x value");
        int x= Sc.nextInt();
        int sum=0,s;
        for (int i =1 ; i <=num ; i++) {
            s=(int)Math.pow(x,i);
            sum+=s;
            System.out.println(s);
        }
        System.out.println(num);
    }
}
