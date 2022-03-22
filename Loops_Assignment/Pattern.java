import java.util.Scanner;
public class Pattern {
        public static void main(String[] args) {
            int i, j, k, rows;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the no of rows you want to print: ");
            rows = scan.nextInt();
            for (i = 1; i <= rows; i++) {
                for (j = i; j < rows; j++) {
                    System.out.print(" ");
                }
                for (k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (i = rows; i >= 1; i--) {
                for (j = i; j <= rows; j++) {
                    System.out.print(" ");
                }
                for (k = 1; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

