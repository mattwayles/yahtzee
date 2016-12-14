package Yahtzee;
import java.util.Scanner;
/**
 * Hand.class
 * Matthew Blough-Wayles
 * Created 12/13/16
 * Edited 12/13/16
 * Manage a hand of 5 dice
 */
public class Hand {
    Die[] myDice;
    int myRolls = 0;


    Hand() //Initialize a new hand of 5 dice
    {
        this.setHand(new Die[5]);
    }

    //Getters
    protected Die[] getHand()
    {
        return myDice;
    }
    protected int getRolls() { return myRolls; }

    //Setters
    protected void setHand(Die[] dice)
    {
        myDice = dice;
    }
    protected void incRolls() { myRolls++;}


    //Methods
    void deal() {
        for (int i = 0; i < 5; i++) {
            getHand()[i] = new Die();
        }
    }

    void roll() {
        this.incRolls();
        for (Die die : getHand()) {
            if (!die.getKept()) {
                die.roll();
            }
            System.out.print(die.getValue() + " ");
        }
        System.out.println();
        if (getRolls() == 3) {
            System.out.println("That was your final roll. Score calculated here");
        } else {
            this.getInput();
        }
    }

    void getInput()
    {
        Scanner reader;

        reader = new Scanner(System.in);

        System.out.print("Keep: " );
        keep(reader.nextLine());
    }

    void keep(String keepers)
    {
        String[] strArr;
        int i;

        strArr = keepers.split("\\s+");
        for(i=0;i<strArr.length; i++)
        {
            getHand()[Integer.parseInt(strArr[i]) - 1].setKept(true);
        }
    }
}
