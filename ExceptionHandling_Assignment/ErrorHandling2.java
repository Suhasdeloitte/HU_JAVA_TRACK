import java.util.ArrayList;
import java.util.Scanner;


public class ErrorHandling2 {
    public static void main(String[] args) {
            System.out.println("Enter The Password");
            Scanner scan = new Scanner(System.in);
            String str=scan.nextLine();
            char array[]=str.toCharArray();

            for (char i=0;i< array.length;i++) {
                System.out.println(array[i]);
            }



    }
}
