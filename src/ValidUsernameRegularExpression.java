import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernameRegularExpression {
private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int amount = sc.nextInt();
        String buffer = sc.nextLine();
        List<String> names = new ArrayList<String>();
        for(int i = 0 ; i< amount ; i++){
            names.add(sc.nextLine());
        }
        checkNames(names);
    }

    public static void checkNames(List<String> names){
        for(String name : names){
            //check length
            if(name.length() < 8 || name.length() > 30){
                System.out.println("Invalid");
                continue;
            } else if( Character.isDigit(name.charAt(0)) || name.charAt(0) == '_' ){
                System.out.println("Invalid");
                continue;
            }
            //check if between a-z
            boolean checker = false;
            for(Character ch : name.toLowerCase().toCharArray()) {

                if (! (Character.isLetter(ch) || Character.isDigit(ch) || ch.equals('_'))) {
                    System.out.println("Invalid");
                    checker = true;
                    break;
                }

            }
            if(checker == true){
                checker = false;
                continue;
            }
            System.out.println("Valid");

        }

    }

}

