import java.util.InputMismatchException;
import java.util.Scanner;

public class xDivideByY {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try{
           x = sc.nextInt();
           y = sc.nextInt();
            System.out.println(x/y);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException e){
            System.out.println(e);
        }


    }
}
