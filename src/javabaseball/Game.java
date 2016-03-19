package javabaseball;

/**
 *
 * @author R-MAN
 */
public class Game {
    
    public Game() {        
    }
    
    public void play() {
        
        Player [] myTeam = new Player [9]; //Player array
        Player [] myOpponent = new Player [9]; //opposing Player array
        
        for (int i = 0; i < 9; i++) { //create a team of nine Players
            
            if (i <= 2) {
                Player myPlayer = new Player(1, i);
                myTeam[i] = myPlayer;
            }
            
            else if (i == 3) {
                Player myPlayer = new Player(3, 3);
                myTeam[i] = myPlayer;
            }
            
             else if (i > 3 && i < 8 ) {
                Player myPlayer = new Player(4, i);
                myTeam[i] = myPlayer;
            }
            
             else if (i == 8) {
                Player myPlayer = new Player(8, 8);
                myTeam[i] = myPlayer;
            }
        }
        
        for (int i = 0; i < 9; i++) { //create a team of nine opposing Players
            
            if (i >= 2) {
                Player myPlayer = new Player(1, i);
                myOpponent[i] = myPlayer;
            }
            
            else if (i == 3) {
                Player myPlayer = new Player(3, 3);
                myOpponent[i] = myPlayer;
            }
            
             else if (i > 3 && i < 8 ) {
                Player myPlayer = new Player(4, i);
                myOpponent[i] = myPlayer;
            }
            
             else if (i == 8) {
                Player myPlayer = new Player(8, 8);
                myOpponent[i] = myPlayer;
            }
        }
        
        System.out.println("Southwest Montana State Lineup:");
        for (int i = 0; i < myTeam.length; i++) {
            Player tempPlayer = myTeam[i];
            System.out.println("Position: " + tempPlayer.getPosition() + "  Avg: " + tempPlayer.getBattingAverage());
        }
    }
}
