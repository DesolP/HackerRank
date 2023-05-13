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
