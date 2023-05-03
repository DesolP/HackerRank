import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetSolution {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set mySet = new HashSet();
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< t; i++) {
            mySet.add(sc.nextLine());
            System.out.println(mySet.size());
        }

    }
}
