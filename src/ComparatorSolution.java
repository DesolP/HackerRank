import java.util.*;

public class ComparatorSolution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Player [] players = new Player[n];
        Checker checker = new Checker();
        for(int i = 0; i< n; i++){
            players[i] = new Player(sc.next(), sc.nextInt());
        }

        Arrays.sort(players, checker);
        for(int i = 0; i < players.length; i++){
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }
    }

}

 class Player{
String name;
int score;
   Player(String name, int score){
    this.name = name;
    this.score = score;
    }


}

class Checker implements Comparator<Player>{

    public int compare(Player a, Player b){
        int comparedValue = Integer.compare(b.score,a.score);
        if(comparedValue==0){
            return a.name.compareTo(b.name);
        }
        System.out.println(comparedValue);
        return comparedValue;
    }
}












