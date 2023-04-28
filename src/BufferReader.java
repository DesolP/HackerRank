import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.in;


public class BufferReader  {
    public static List<String> collectedPrime = new ArrayList<>();
    public static void main(String[] args) {
            try{
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                br.lines().forEach(o -> collectedPrime.add(o));
            } catch (Exception e) {
                System.out.println(e);
            }
            checkPrime(collectedPrime);
    }
    private static void checkPrime(List<String> collectedPrime){
        List<String> filteredPrime = new ArrayList<>();
        boolean flag = false;
        for(int i = 0; i< collectedPrime.size(); i++)
        {

            if (isPrime(Integer.valueOf(collectedPrime.get(i)))) {
                filteredPrime.add(collectedPrime.get(i));
            }
            if(i != 3){
                System.out.println(filteredPrime.stream().collect(Collectors.joining(" ")));
            }
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}
