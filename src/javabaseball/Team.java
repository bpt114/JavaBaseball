package javabaseball;

/**
 *
 * @author R-MAN
 */
public class Team {
    
    String name;
    int runs = 0;
    int outs = 0;
    Player [] myTeam;
    
    public Team(String teamName) {
        
        name = teamName;
        myTeam = new Player [9];
        
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
    }
    
    public void printTeam() {
        
        System.out.println("Team: " + name);
        
        for (int i = 0; i < myTeam.length; i++) {
            System.out.println("Position: " + myTeam[i].myPosition + " Average: " + myTeam[i].battingAvg);
        }
    }
}
