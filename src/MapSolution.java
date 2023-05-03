import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapSolution {
private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
             sc.nextLine();
            phoneBook.put(sc.nextLine(), sc.nextInt());
        }
        sc.nextLine();
        do{
            String name = sc.nextLine();
            if(phoneBook.containsKey(name)){
                System.out.println(name + "=" + phoneBook.get(name));
            }else System.out.println("Not found");
        }while(sc.hasNext());
    }
}
