import java.io.*;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        String buffer = sc.nextLine();
        String str = "";
        for(int i = 0 ; i< T; i++){
            str = sc.nextLine();
            List<String> separatedString = separateStringToList(str, " ");
            int condition = Integer.valueOf(separatedString.get(0));
            int value = Integer.valueOf(separatedString.get(1));
            if(condition == 1){
                System.out.println(isEven(value));
            } else if (condition == 2) {
                System.out.println(isPrime(value));
            } else if (condition == 3) {
                System.out.println(isPalindrome(value));
            }else {
                System.out.println("Incorrect condition");
            }
        }
    }

    public static List separateStringToList(String str, String separator){
        List<String> separatedString = Arrays.asList(str.split(separator));
        return separatedString;
    }
    public static String isEven(int value){

        if(value % 2 == 0){
           return "EVEN";
        }else{
            return "ODD";
        }
    }
    public static String isPrime(int value){
        if(value <= 1){
            return "NOT PRIME";
        }
        for(int i = 2; i<value/2; i++){
            if(value % i == 0){
                return "COMPOSITE";
            }
        }
        return "PRIME";
    }
    public static String isPalindrome(int value){
        String text = Integer.toString(value);
        text = text.toLowerCase();
        int forward = 0;
        int backward = text.length()-1;
        System.out.println("forward: " + forward);
        System.out.println("backward: " + backward);
        for(int i = 0; i< text.length(); i++)
        {
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                return "NOT PALINDROME";
            }
        }
        return "PALINDROME";
    }
}