package javastatement;

import java.util.Scanner;

public class Calcalator {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a type");
        char type=Sc.next().charAt(0);
        System.out.println("Enter D for Deaktop,L for Laptop");
        System.out.println("Enter a name");
        String name= Sc.nextLine();
        System.out.println("Enter a address");
        String add= Sc.nextLine();
        System.out.println("Enter the amount of purchase");
        int amt= Sc.nextInt();
        double disc=0.0,netamt=0.0;
        switch (type)
        {
            case 'D':
            {
                if (amt<=25000)
                    disc=0.0;
                else if (amt<=57000)
                    disc=amt*0.05;
                else if (amt<=100000)
                    disc=amt*0.075;
                else
                    disc=amt*0.1;
                break;
            }
            case 'L':
            {
                if (amt<=25000)
                    disc=amt*0.05;
                else if (amt<=57000)
                    disc=amt*0.075;
                else if (amt<=100000)
                    disc=amt*0.1;
                else
                    disc=amt*0.15;
                break;
            }
            default:
                System.out.println("Invalid purchase type");
        }
        netamt=amt-disc;
        System.out.println("Name="+name);
        System.out.println("Address="+add);
        System.out.println("Amount of purchase="+amt);
        System.out.println("Discount="+disc);
        System.out.println("Net amount="+netamt);
    }
}
