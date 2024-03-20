package Pattern;
/*
E E E E E
E
E E E E E
E
E E E E E
 */
public class EEEEEEEPattern {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++)
        {
            for (int j = 1; j <=5 ; j++)
            {
                if (i%2==0) {
                    System.out.printf("E ");
                    break;
                }
                else
                    System.out.printf("E ");
            }
            System.out.println();
        }
    }
}
