package JavaFactory;

public class FoodFactory {

    public Food getFood(String order){
        if(order.equals("pizza")){
            Pizza pizza = new Pizza();
            System.out.println("The factory returned class Pizza");
            return pizza;
        }else{
            Cake cake = new Cake();
            System.out.println("The factory returned class Cake");
            return cake;
        }

    }
}
