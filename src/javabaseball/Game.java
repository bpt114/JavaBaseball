package javabaseball;

/**
 *
 * @author R-MAN
 */
public class Game {
    
    int inning = 0;
    int myScore = 0;
    int oppScore = 0;
    int myBatter = 0;
    int oppBatter = 0;
    int balls = 0;
    int strikes = 0;
    int outs = 0;
    
    public void play() {
        
        Team myTeam = new Team("Bobcats");
        Team myOpponent = new Team("Vipers");
        myTeam.printTeam();        
    }
}