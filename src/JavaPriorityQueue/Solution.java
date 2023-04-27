package JavaPriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Priorities priorities = new Priorities();
        int n = sc.nextInt();
        String buffer = sc.nextLine();
        List<String> inputList = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            inputList.add(input);
        }
        System.out.println(priorities.getStudents(inputList));
    }
}
