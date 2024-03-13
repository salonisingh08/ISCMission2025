package Pattern;

public class SandGlassPattern {
    public static void main(String[] args) {
        int Rows=7;
        for (int i= 0; i<= Rows-1 ; i++)
        {
            //Prints the spaces before the first star of each row
            for (int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            //Prints stars and the whitespaces in between them
            for (int k=i; k<=Rows-1; k++)
            {
                System.out.print("*" + " ");
            }
            //Next line for new row
            System.out.println();
        }
        //Outer loop 2: Prints the second half of the pattern
        for (int i= Rows-1; i>= 0; i--)
        {
            //Prints the spaces before the first star of each row
            //of the second half of the pattern
            for (int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            //Prints stars and the whitespaces in between them
            for (int k=i; k<=Rows-1; k++)
            {
                System.out.print("*" + " ");
            }
            //Move the cursor to new line for next row
            System.out.println();
        }
    }
}

