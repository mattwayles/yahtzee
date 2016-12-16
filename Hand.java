package Yahtzee;
import java.util.*;
/**
 * Hand.class
 * Matthew Blough-Wayles
 * Created 12/13/16
 * Edited 12/14/16
 * Manage a hand of 5 dice
 */
public class Hand {
    private Die[] myDice;
    private int myRolls;
    private int sum;
    private ArrayList<Result> myChoices;
    private Scorecard sc;


    Hand() //Initialize a new hand of 5 dice
    {
        this.setHand(new Die[5]);
        this.setChoices(new ArrayList<Result>());
        this.setRolls(0);
        this.setSum(0);
        this.setScorecard(new Scorecard());
    }

    //Getters
    protected ArrayList<Result> getChoices() { return myChoices; }
    protected Die[] getHand()
    {
        return myDice;
    }
    protected int getRolls() { return myRolls; }
    protected int getSum() { return sum; }
    protected Scorecard getScorecard() { return sc; }

    //Setters
    protected void setChoices(ArrayList<Result> init) { myChoices = init; }
    protected void setHand(Die[] dice)
    {
        myDice = dice;
    }
    protected void setRolls(int init) { myRolls = init; }
    protected void setSum(int num) { sum = num; }
    protected void setScorecard(Scorecard score) { sc = score; }


    //Methods
    protected void incRolls() { myRolls++;}

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
        if (!(getRolls() == 3)) {
            System.out.print("Keep: " );
            this.getInput();
        }
        else {
        this.calcResults();
        this.listResults();
            System.out.print("Select a Result: " );
        this.getInput();
        }
    }

    void getInput()
    {
        Scanner reader;
        reader = new Scanner(System.in);
        keep(reader.nextLine());
    }

    void keep(String keepers)
    {
        String[] strArr;
        int i;

        strArr = keepers.split("\\s+");
        for(i=0;i<strArr.length; i++)
        {
            if (!getChoices().isEmpty())
            {
                getScorecard().fill(getChoices().get(Integer.parseInt(strArr[i]) - 1));
                getScorecard().show();
            }
            getHand()[Integer.parseInt(strArr[i]) - 1].setKept(true);
        }
    }

    String intConvert(int num)
    {
        String str;

        str = "Error!";
        switch (num) {
            case 1:
                str = "Ones";
                break;
            case 2:
                str = "Twos";
                break;
            case 3:
                str = "Threes";
                break;
            case 4:
                str = "Fours";
                break;
            case 5:
                str = "Fives";
                break;
            case 6:
                str = "Sixes";
        }

        return str;
    }

    void calcResults()
    {
        //Lower Section
        //Find same number patterns; 3 or 4 of a Kind, Full House, Yahtzee
        this.findPatterns();
        //Upper Level
        this.upperSection();
        //Straights
        this.findStraight();
        //Chance
        this.getChoices().add(new Result("Chance", this.getSum()));
    }

    void upperSection()
    {
        int i;
        int incNum;

        //Upper Level
        incNum = 0;
        for(i=1;i<7;i++) {
            for (Die die : getHand()) {
                if (die.getValue() == i) {
                    incNum = incNum + i;
                }
            }
            if (incNum > 0) {
                getChoices().add(new Result(this.intConvert(i), incNum));
            }
            incNum = 0;
        }
    }

    void findPatterns()
    {
        int i;
        int d1;
        int d2;
        List<Die> pattern;

        i = 0;
        d1 = 0;
        d2 = 0;
        pattern = new ArrayList<Die>();

        for (Die die : getHand()) //for each die in current hand
        {
            d2 = 0;
            for (Die die2 : getHand()) //compare to all other dice in hand
            {
                if (die.getValue() == die2.getValue()) //same rank between two cards
                {
                    if (!(d1 == d2)) {
                        pattern.add(die); //add to Array
                        i++;
                        break;
                    }
                }
                d2++;
            }
            setSum(getSum() + die.getValue());
            d1++;
        }


        this.sortPattern(pattern);
        try {
            if(pattern.size() > 2) {
                if (pattern.get(0).getValue() == pattern.get(2).getValue()) {
                    this.getChoices().add(new Result("Three of a Kind", getSum()));
                } else if (pattern.get(2).getValue() == pattern.get(4).getValue()) {
                    this.getChoices().add(new Result("Three of a Kind", getSum()));
                }
            }
            if (pattern.size() > 3) //Four of a Kind
            {
                if (pattern.get(0).getValue() == pattern.get(3).getValue()) {
                    this.getChoices().add(new Result("Four of a Kind", getSum()));
                }
            }
            if (pattern.size() > 4) //FullHouse, Yahtzee
            {
                if (pattern.get(0).getValue() == pattern.get(4).getValue()) { //Yahtzee
                    this.getChoices().add(new Result("YAHTZEE!", 50));
                }
                else { //Full House
                    this.getChoices().add(new Result("Full House", 25));
                }
            }
        } catch(IndexOutOfBoundsException ex) {}



    }

    void findStraight()
    {
        int i;
        int count;
        int[] values;

        count = 0;
        values = new int[5];

        for(i=0; i < getHand().length; i++)
        {
            values[i] = getHand()[i].getValue();
        }
        Arrays.sort(values);
        for(i=0;i<values.length - 1;i++)
        {
            if(values[i] + 1 == values[i+1])
            {
                count++;
            }
            else
            {
                if (!(values[i] == values[i+1]))
                {break;}
            }
        }
        if (count > 3) //Large Straight
        {
            this.getChoices().add(new Result("Large Straight", 40));
        }
        if (count > 2) //Small Straight
        {
            this.getChoices().add(new Result("Small Straight", 30));
        }

    }

    void sortPattern(List<Die> pattern)
    {
        Collections.sort(pattern, new Comparator<Die>(){
            public int compare(Die o1, Die o2){
                if(o1.getValue() == o2.getValue())
                    return 0;
                return o1.getValue() < o2.getValue() ? -1 : 1;
            }
        });
    }

    void sortResults(List<Result> pattern)
    {
        Collections.sort(pattern, (o1, o2) -> {
            if(o1.getWorth() == o2.getWorth())
                return 0;
            return o2.getWorth() < o1.getWorth() ? -1 : 1;
        });
    }

    void listResults()
    {
        this.sortResults(getChoices());
        for(int i=0; i< getChoices().size(); i++)
        {
            getChoices().get(i).display(i + 1);
        }
    }

}
