package Pattern;

public class RighPascalTriangle {
    public static void main(String[] args) {
        int n=6;
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
    }
}
