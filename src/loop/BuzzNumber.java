package loop;

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        if (num%10==7||num%7==0)
            System.out.println("It is a buzz number="+num);
        else
            System.out.println("It is not  a buzz number="+num);
    }
}
