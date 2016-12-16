package Yahtzee;
import java.util.Random;
/***************************************************************************************/
/* Die.class                                                                           */
/* Matthew Blough-Wayles                                                               */
/* Created 12/13/16                                                                    */
/* Edited 12/13/16                                                                     */
/* A class to create a Die object and randomly assign a numberical value between 1-6.  */
/**************************************************************************************/
public class Die {
    private int myValue;    //each die will have a value between 1-6
    private boolean myKept; //each die will be kept or discarded by the user
    private static final int MIN = 1; //every die will have a minimum value of 1
    private static final int MAX = 6; //every die will have a maximum value of 6


    void Die(int val, boolean kept)
    {
        this.setValue(val);
        this.setKept(kept);
    }

    void Die() //create a new die
    {
        this.setValue(1); //default value prior to roll
        this.setKept(false); //not kept until explicitly decided by user

    }

    //Getters
    protected int getValue()
    {
        return myValue;
    }
    protected boolean getKept()
    {
        return myKept;
    }

    //Setters
    protected void setValue(int val)
    {
        myValue = val;
    }
    protected void setKept(boolean tf)
    {
        myKept = tf;
    }

    //Methods
    void roll() //roll the die and assign a new value
    {
        int val;
        Random rand;

        rand = new Random();
        val = rand.nextInt(MAX) + MIN;  //assign a random value between 1-6
        setValue(val);
    }

    public int compareTo(Die o)
    {
        return(this.getValue() - o.getValue());
    }




}
