package javabaseball;

/**
 *
 * @author R-MAN
 */

import java.util.Random;

public class Player {
        
    double battingAvg;
    double accuracy;
    double throwing;
    int speed;
    int power;
    int armStrength;
    String myPosition;
    
    public Player (int position, int field) {       
       
        Random myRandom = new Random();
        
        if (position == 1) {
            int ran = myRandom.nextInt(200) + 200;
            battingAvg = ran * 0.001;
            
            ran = myRandom.nextInt(500) + 500;
            accuracy = ran * 0.001;
            
            ran = myRandom.nextInt(500) + 500;
            throwing = ran * 0.001;
            
            power = myRandom.nextInt(5) + 5;
            armStrength = myRandom.nextInt(5) + 5;
            
            if (field == 0) {
                myPosition = "SS";
            }
            
            else if (field == 1) {
                myPosition = "LF";
            }
            
            else if (field == 2) {
                myPosition = "RF";
            }
        }
        
        else if (position == 3) {
            int ran = myRandom.nextInt(500) + 100;
            battingAvg = ran * 0.001;
            
            ran = myRandom.nextInt(400) + 500;
            accuracy = ran * 0.001;
            
            ran = myRandom.nextInt(400) + 500;
            throwing = ran * 0.001;
            
            power = myRandom.nextInt(5) + 5;
            armStrength = myRandom.nextInt(5) + 5;
            
            myPosition = "CF";
        }
        
        else if (position == 4) {
            int ran = myRandom.nextInt(150) + 150;
            battingAvg = ran * 0.001;
            
            ran = myRandom.nextInt(300) + 500;
            accuracy = ran * 0.001;
            
            ran = myRandom.nextInt(300) + 500;
            throwing = ran * 0.001;
            
            power = myRandom.nextInt(3) + 5;
            armStrength = myRandom.nextInt(5) + 5;
            
            if (field == 4) {
                myPosition = "2B";
            }
            
            else if (field == 5) {
                myPosition = "1B";
            }
            
            else if (field == 6) {
                myPosition = "CA";
            }
            
            else if (field == 7) {
                myPosition = "3B";
            }
        }
        
        else if (position == 8) {
            int ran = myRandom.nextInt(50) + 100;
            battingAvg = ran * 0.001;
            
            ran = myRandom.nextInt(400) + 500;
            accuracy = ran * 0.001;
            
            ran = myRandom.nextInt(400) + 500;
            throwing = ran * 0.001;
            
            power = myRandom.nextInt(2) + 1;
            armStrength = myRandom.nextInt(3) + 7;
            
            myPosition = "P";
        }
    }
    
    public String getPosition() {
        return myPosition;
    }
    
    public double getBattingAverage() {
        return battingAvg;
    }
}
