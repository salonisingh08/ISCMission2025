package loop;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int i=1,sum=0;
      while (i<=num/2)
      {
          if (num%i==0)
              sum+=i;
          i++;
      }
      if (sum==num)
          System.out.println("It is a perfect number");
      else
          System.out.println("It is not a perfect number");
    }
}
