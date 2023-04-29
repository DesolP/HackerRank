package SingletonSolution;

import java.util.Scanner;

public class Solution {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        try{
            input = sc.nextLine();
            if(input.isEmpty()){

            }else{
                Singleton singleton = Singleton.getSingleInstance();
                singleton.str = "Hello I am a singleton! Let me say " + input + " to you";
                System.out.println(singleton.str);
            }
        }catch(NullPointerException e){

        }


    }
}
