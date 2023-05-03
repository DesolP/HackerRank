import java.util.Scanner;
import java.util.Stack;

public class StackSolution {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while(sc.hasNext()){
            System.out.println(checkIfBalanced(sc.nextLine()));
        }
    }

    public static boolean checkIfBalanced(String lane){
        Stack<Character> myStack = new Stack<>();
        for(int i = 0; i< lane.length(); i++){
            if(lane.charAt(i)=='[' || lane.charAt(i)=='{' ||lane.charAt(i)=='('){
                myStack.push(lane.charAt(i));
            } else if (lane.charAt(i)==']' || lane.charAt(i)=='}' ||lane.charAt(i)==')') {
                if(!myStack.isEmpty()) {
                    myStack.pop();
                }else return false;
            }
        }
        if(myStack.isEmpty()) return true;
        else return false;
    }
}
