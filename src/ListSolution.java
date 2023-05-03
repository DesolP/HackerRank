import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListSolution {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        addElements(myList,N);
        int q = sc.nextInt();
        performOperations(myList,q);
        for(Integer index : myList){
            System.out.print(index + " ");
        }

    }

    public static void addElements(List<Integer> myList, int N){
        for(int i = 0; i< N; i++){
            myList.add(sc.nextInt());
        }
    }
    public static void addElements( List<Integer> myList){
        myList.add(sc.nextInt(), sc.nextInt());
    }
    public static void performOperations(List<Integer> myList, int q){
        for(int i = 0; i < q; i++){
            String buffer = sc.nextLine();
            String operation = sc.nextLine();
            if(operation.equals("Insert")){
                addElements(myList);
            } else if (operation.equals("Delete")) {
                myList.remove(sc.nextInt());
                
            }

        }
    }
}
