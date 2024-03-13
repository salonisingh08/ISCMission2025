package Pattern;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // outer loop to handle lower part
        for (int i = n-1; i >= 1; i--) {
            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1 ; i <= n; i++ )
        {
            for (int j = i ; j < n; j++ )
            {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i-- )
        {
            for (int j = i ; j <= n; j++ )
            {
                System.out.print("  ");
            }
            for(int j = 1; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
