package Method;

import java.util.Scanner;

public class BouncyNumber {public static void main(String[] args) {
    Scanner sc= new Scanner((System.in));
    System.out.println("Enter the number:-");
    int num= sc.nextInt();
    if(isBouncy(num)==true){
        System.out.println(num+" is a bouncy number");
    }else{
        System.out.println(num+" is not a bouncy number");
    }
}
    static boolean isBouncy(int num)
    {
        boolean isIncreasing= true,isDecreasing=true;
        int temp= num;

        int prev= temp%10;
        while(temp!=0)
        {
            int rem = temp%10;
            if(rem > prev){
                isIncreasing=false;
                break;
            }
            prev= rem;
            temp/=10;
        }
        temp=num;
        prev= temp%10;
        while(temp!=0)
        {
            int rem = temp%10;
            if(rem < prev){
                isDecreasing=false;
                break;
            }
            prev= rem;
            temp/=10;
        }
        if(!isIncreasing && !isDecreasing){
            return  true;
        }else{
            return  false;
        }

    }

}
