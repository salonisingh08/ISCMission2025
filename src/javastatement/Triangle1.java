package javastatement;

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter three number");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            if (a * a < b * b + c * c && b * b < a * a + c * c && c * c < a * a + b * b)
                System.out.println("Acute angle triangle");
            else if (a * a < b * b + c * c || b * b < a * a + c * c || c * c < a * a + b * b)
                System.out.println("Obtuse angle triangle");
            else
                System.out.println("Right angle tiangle");
        }
        else
            System.out.println("Does not form a triangle");
    }
}
