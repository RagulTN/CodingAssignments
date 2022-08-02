public class DiceGame {
    public static void main(String[] args) {

        int playerA[] = new int[10];
        int playerB[] = new int[10];
        int playerAScore = 0;
        int playerBScore = 0;
        int round = 1;
        
        for (int i =0; i < playerA.length && i < playerB.length; i++) {
            System.out.println("round num : " + round++);
            playerA[i] = (int) ((Math.random() * 6) + 1);
            playerB[i] = (int) ((Math.random() * 6) + 1);
        
            System.out.println("player A has " + playerA[i]);
            System.out.println("player B has " + playerB[i]);
            System.out.println();
        
            if(playerA[i] == playerB[i]) {
                playerAScore = playerAScore + 3;
                playerBScore = playerBScore + 3;
            }
            else if (playerA[i] > playerB[i]) {
                playerAScore = playerAScore + 5;
            }
            else if (playerB[i] > playerA[i]) {
                playerBScore = playerBScore + 5;
            }
            if(round >= 4 || round >= 4) {
                break;
            }
        }
        
        System.out.println("The game is over.");
        
        if(playerAScore >= playerBScore)
            System.out.println("The winner is player A");
        else
            System.out.println("The winner is player B");
        
    }
}
