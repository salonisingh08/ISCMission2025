package series;

import java.util.*;
public class sum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int sum = 0, term = 0;

        for (int i = 1; i <= n; i++) {
            term += i;
            sum += term;
        }

        for (int i = 1; i <= n; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                p *= j;
            }
            sum += p;
        }
        System.out.println("Sum=" + sum);
    }
}
