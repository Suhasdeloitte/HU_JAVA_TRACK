public class ErrorHandling1 {
    public static void main(String[] args){
       try {
           System.out.println("Try Block");
           int num=100/0;
           System.out.println(num);
       }
       catch (ArithmeticException e){
           System.out.println("Catch Block");
           System.out.println("Exception is Handled");
       } finally {
           System.out.println("Thank You");
       }



    }
}
