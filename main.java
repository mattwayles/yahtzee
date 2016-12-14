package Yahtzee;

/**
 * Created by root on 12/13/16.
 */
public class main {

    public static void main(String[] args)
    {
        Hand hand1 = new Hand();
        //lScorecard sc = new Scorecard();

        hand1.deal();
        hand1.roll();
        hand1.roll();
        hand1.roll();
        //sc.show();

    }
}
