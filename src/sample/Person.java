package sample;

/**
 * Created by JamesHartanto on 3/10/17.
 */
import java.util.Random;

public class Person {

    //Person Class properties
    private int money;
    private int bet;

    //Public constructor for the person class. Takes one argument (int money).
    public Person(int money) {

        this.money = money;
    }

    //Getter for the money property
    public int getMoney() {
        return money;
    }

    //Setter for the money property
    public void setMoney(int money) {
        this.money = money;
    }

    //Getter for the bet property
    public int getBet() {
        return this.bet;
    }

    //Setter for the bet property
    public void setBet(int betAmount) {
         this.bet = betAmount;
    }
}