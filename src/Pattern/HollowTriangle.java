package Pattern;

public class HollowTriangle {
    public static void main(String[] args) {
        int i, j, k;
        int n=5;

        // outer loop to handle rows
        for (i = 1; i <= n; i++) {

            // inner loop to print spaces.
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (k=1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}

