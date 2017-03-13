package sample;

import java.util.Random;

/**
 * Created by forestnewark on 3/10/17.
 */
public class SlotMachine {
    //SlotMachine properties. Holds values for each wheel
    private int wheelOne;
    private int wheelTwo;
    private int wheelThree;

    //Getters for the wheel variables. Returns int values to be displayed
    public int getWheelOne() {
        return wheelOne;
    }

    public int getWheelTwo() {
        return wheelTwo;
    }

    public int getWheelThree() {
        return wheelThree;
    }


    //setWheel() method generates a random number 1-9 to be displayed on the slot machine wheels
    private void setWheels(){
        Random random = new Random();
        wheelOne = random.nextInt(10) +1;
        wheelTwo = random.nextInt(10) +1;
        wheelThree = random.nextInt(10) +1;
    }

    //play() method calls the private setWheels() method to begin the game
    public void play() {
        setWheels();
    }

    //didPlayerWin() method returns a boolean. Checks to see if any of the three wheels match.
    public boolean didPlayerWin(){
        if (wheelOne == wheelTwo || wheelTwo == wheelThree || wheelOne == wheelThree) {

            return true;
        }else {
            return false;
        }
     }

     //didBonusHit() method returns a boolean. Checks to see if all three wheels are a "7"/
      public boolean didBonusHit(){
         if (wheelOne == 7 && wheelTwo == 7 && wheelThree == 7) {
             return true;
         }else {
             return false;
         }
     }


}





