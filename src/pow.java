import java.util.Scanner;

public class pow {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            int n = sc.nextInt();
            int p = sc.nextInt();
            try{
                System.out.println(handleException(n,p));

            }catch(Exception e){
                System.out.println(e);
            }
        }while(sc.hasNext());

    }
    private static int handleException(int n, int p) throws Exception {
        if (n == 0 && p == 0 ){
            throw new Exception ("n and p should not be zero.");
        } else if (n <0 || p < 0 ){
            throw new Exception ("n or p should not be negative.");
        } else return (int)Math.pow(n,p);
    }
}
