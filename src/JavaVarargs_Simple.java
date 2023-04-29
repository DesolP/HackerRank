import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JavaVarargs_Simple {

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

             reader.lines().forEach(o -> inputList.add(Integer.valueOf(o)));

        }catch (Exception e){
            System.out.println(e);
        }
        sumUpValues(inputList);
    }

    public static void sumUpValues(List<Integer> inputList){

        for (int i = 0; i< inputList.size(); i++){
            int sum = 0;

            if (i != 0 && i != 3){

            for(int j = 0; j<=i;j++){
                    sum += inputList.get(j);
                    if(j != 0){
                        System.out.print("+");
                    }
                    System.out.print(inputList.get(j));
                }
                System.out.println("=" + sum);
            }

        }
    }

}
