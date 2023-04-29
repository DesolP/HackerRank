package JavaFactory;

import java.util.Scanner;

public class JavaFactoryPattern {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood(sc.nextLine());
        System.out.println(food.getType());
    }

}
