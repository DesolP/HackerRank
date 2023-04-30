import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java1DArrayPart2 {
private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //number of queries
        int q = sc.nextInt();
        String buffor = sc.nextLine();
        List<String> sizeAndLeapInput = new ArrayList<String>();
        List<String> games = new ArrayList<String>();
        for(int i = 0; i<q; i++) {
            //add game size and leap into the list
            sizeAndLeapInput.add(sc.nextLine());
            games.add(sc.nextLine());
        }

        playGame(sizeAndLeapInput, games);
    }


    public static  void playGame(List<String> sizeAndLeapInput, List<String> games){

        for(int i = 0 ; i<sizeAndLeapInput.size(); i++){
            int n = 0;
            int leap = 0;
            //split size nad leap string into int values
            List<String> nAndLeap = Arrays.asList(sizeAndLeapInput.get(i).split(" "));
            n = Integer.parseInt(nAndLeap.get(0));
            leap = Integer.parseInt(nAndLeap.get(1));
            List<String> singleGame = Arrays.asList(games.get(i).split(" "));
            int position = 0;
            int moves = 0;
            boolean succeed = false;
            do {

                //check if it's possible to finish the game
                if (position + leap > singleGame.size()) {
                    System.out.println("YES");
                    succeed = true;
                    break;
                }
                //jump
                else if (singleGame.get(position + leap).equals("0")) {
                    position += leap;
                }//step forward
                else if (singleGame.get(position + 1).equals("0")) {
                    position += 1;
                }//step backward
                else if ( position != 0 && singleGame.get(position - 1).equals("0")) {
                    position -= 1;
                }
                moves++;
            }while(moves < singleGame.size() * 1.5);
            if(succeed == false){
                System.out.println("NO");
            }
            succeed = false;
           // System.out.println("Game finished in " + (moves +1) + " moves");
        }

    }

}
