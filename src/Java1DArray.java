import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Java1DArray {


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());
            int[] myArray = new int[n];
            try {
                for (int i = 0; i < n; i++) {
                    myArray[i] = Integer.parseInt(bufferedReader.readLine().trim());
                }for (int i = 0; i < n; i++) {
                    System.out.println(myArray[i]);
                }

                /*List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());*/

                bufferedReader.close();
            }catch(NullPointerException e){
                System.out.println(e);
            }
        }
    }


