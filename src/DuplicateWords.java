import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class DuplicateWords {
//my solution:
    /*
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int amount = sc.nextInt();
        String buffer = sc.nextLine();
        List<String> inputList = new ArrayList<>();
        for(int i = 0 ; i < amount; i++) {
                inputList.add(sc.nextLine());
        }
        removeDuplicates(inputList);
    }

    public static void removeDuplicates(List<String> inputList) {


        //separate each number
        for(String element : inputList) {
            String verifiedTextString = "";
            List <String> verifiedText = new ArrayList<String>();
            List <String> verifiedTextToLower = new ArrayList<String>();
            List<String> separatedIP = Arrays.asList(element.split("\\s+"));
            //System.out.println(separatedIP);

            //check every number
            for (int i = 0; i < separatedIP.size(); i++) {
                //System.out.println(separatedIP.get(i));
                if (verifiedTextToLower.contains(separatedIP.get(i).toLowerCase())) {

                } else {
                    verifiedText.add(separatedIP.get(i));
                    verifiedTextToLower.add(separatedIP.get(i).toLowerCase());
                }
            }
            verifiedTextString =  verifiedText.stream().collect(Collectors.joining(" "));
            System.out.println(verifiedTextString );
        }

    }

}*/

//Regex solution:
public static void main(String[] args) {
    //https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
    String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Scanner in = new Scanner(System.in);
    int numSentences = Integer.parseInt(in.nextLine());

    while (numSentences-- > 0) {
        String input = in.nextLine();

        Matcher m = p.matcher(input);

        // Check for subsequences of input that match the compiled pattern
        while (m.find()) {
            input = input.replaceAll(m.group(), m.group(1));
        }

        // Prints the modified sentence.
        System.out.println(input);
    }

    in.close();
}
}
