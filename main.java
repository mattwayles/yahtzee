package Yahtzee;

/***************************************************************************************/
/* main.class                                                                           */
/* Matthew Blough-Wayles                                                               */
/* Created 12/13/16                                                                    */
/* Edited 12/16/16                                                                     */
/* Play a game of Yahtzee!                                                             */
/**************************************************************************************/
public class main {

    public static void main(String[] args) {

        /*
        Hand hand1 = new Hand();
        hand1.getHand()[0] = new Die();
        hand1.getHand()[1] = new Die();
        hand1.getHand()[2] = new Die();
        hand1.getHand()[3] = new Die();
        hand1.getHand()[4] = new Die();
        hand1.getHand()[0].setValue(3);
        hand1.getHand()[1].setValue(4);
        hand1.getHand()[2].setValue(2);
        hand1.getHand()[3].setValue(3);
        hand1.getHand()[4].setValue(1);
        hand1.getHand()[0].setKept(true);
        hand1.getHand()[0].setKept(true);
        hand1.getHand()[0].setKept(true);
        hand1.getHand()[0].setKept(true);
        hand1.getHand()[0].setKept(true);
        hand1.calcResults(); */

        Scorecard sc = new Scorecard();
        Hand hand1 = new Hand(sc);

        hand1.deal();
        hand1.roll();
            //sc.show();
        }
   }
