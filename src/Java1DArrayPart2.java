import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java1DArrayPart2 {
    public static boolean canWin(int leap, int[] game, int i, String text) {
        System.out.println(text);
        System.out.println(i);
        if (i < 0 || game[i] == 1)
            return false;
        if (i + 1 >= game.length || i + leap >= game.length)
            return true;
        game[i] = 1; //flag
        return canWin(leap, game, i + leap, "jump")
                || canWin(leap, game, i + 1, "forward")
                || canWin(leap, game, i - 1, "backward");
        // several return works as it returns first value if true, if not -> next, if not -> next.
        // Basically it goes through all combinations if they remains true
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
                System.out.print(game[i]);
            }
            System.out.println((canWin(leap, game, 0, "test")) ? "YES" : "NO");
        }
        scan.close();
    }
}

/**private static Scanner sc = new Scanner(System.in);
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
            //System.out.println("iteration: "+ (i +1));
            int position = 0;
            int moves = 0;
            boolean succeed = false;
            boolean haveToJump = false;
           for(int j = 0; j<(singleGame.size() * 1.5); j++){
               //check if can win
               if((position == singleGame.size() - 1 || (position + leap > (n - 1))) ){
                   succeed = true;
                   System.out.println("YES");
                   break;
               } else if ( singleGame.get(position+leap).equals("0")) {
                   System.out.println("jumped");
                   haveToJump = false;
                   position+=leap;
                   //continue;
               } else if (!haveToJump && singleGame.get(position+1).equals("0")) {
                   System.out.println("stepped");
                   position++;
                   //continue;
               } else if (position != 0 && singleGame.get(position-1).equals("0")) {
                   System.out.println("moved backward");
                   haveToJump = true;
                   position--;
                   //continue;
               }


           }
           if(!succeed){
               System.out.println("NO");
           }
        }

    }

}
**/
/**
 *  do {
 *
 *                 //check if it's possible to finish the game
 *                 if (position + leap >= singleGame.size()) {
 *                     System.out.println("YES");
 *                     succeed = true;
 *                     break;
 *                 }
 *                 //step forward
 *                 if (!haveToJump && singleGame.get(position +1 ).equals("0")) {
 *                     //System.out.println("moved");
 *                     moves++;
 *                     position += 1;
 *                     continue;
 *                 }else{
 *                     haveToJump = true;
 *                 }
 *                 //jump
 *                 if (position + leap < singleGame.size()) {
 *                     if(singleGame.get(position + leap).equals("0")) {
 *                        // System.out.println("jumped");
 *                         haveToJump = false;
 *                         moves++;
 *                         position += leap;
 *                         continue;
 *                     }
 *                 }
 *                 //step backward
 *                 if (haveToJump && position != 0 && singleGame.get(position - 1).equals("0")) {
 *                     //System.out.println("backward");
 *                     moves++;
 *                     position -= 1;
 *                     continue;
 *                 }
 *                 moves++;
 *                 //System.out.println("position:" + position);
 *             }while(moves < singleGame.size() * 1.5);
 *             if(!succeed){
 *                 System.out.println("NO");
 *             }
 *             succeed = false;
 *            // System.out.println("Game finished in " + (moves +1) + " moves");
 */
