package Yahtzee;

import java.util.*;
/***************************************************************************************/
/* Scorecard.class                                                                     */
/* Matthew Blough-Wayles                                                               */
/* Created 12/13/16                                                                    */
/* Edited 12/16/16                                                                     */
/* A class to create, update, and display a Yahtzee scorecard.                         */
/**************************************************************************************/
public class Scorecard {
    private int ones;
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    private int sixes;
    private int bonus;
    private int upperTotal;
    private int threeKind;
    private int fourKind;
    private int fullHouse;
    private int smStraight;
    private int lgStraight;
    private int yahtzee;
    private int chance;
    private int lowerTotal;
    private int total;
    private ArrayList<String> avail;


    Scorecard()
    {
        setOnes(0);
        setTwos(0);
        setThrees(0);
        setFours(0);
        setFives(0);
        setSixes(0);
        setBonus(0);
        setUpperTotal(0);
        setThreeKind(0);
        setFourKind(0);
        setFullHouse(0);
        setSmStraight(0);
        setLgStraight(0);
        setYahtzee(0);
        setChance(0);
        setLowerTotal(0);
        setTotal(0);
        setAvail();
    }

    //Getters
    int getOnes()
    {
        return ones;
    }
    int getTwos()
    {
        return twos;
    }
    int getThrees()
    {
        return threes;
    }
    int getFours()
    {
        return fours;
    }
    int getFives()
    {
        return fives;
    }
    int getSixes()
    {
        return sixes;
    }
    int getBonus()
    {
        return bonus;
    }
    int getUpperTotal() { return upperTotal; }
    int getThreeKind()
    {
        return threeKind;
    }
    int getFourKind()
    {
        return fourKind;
    }
    int getFullHouse()
    {
        return fullHouse;
    }
    int getSmStraight()
    {
        return smStraight;
    }
    int getLgStraight()
    {
        return lgStraight;
    }
    int getYahtzee()
    {
        return yahtzee;
    }
    int getChance()
    {
        return chance;
    }
    int getLowerTotal() { return lowerTotal; }
    int getTotal() { return total; }
    ArrayList<String> getAvail() { return avail; }

    //Setters
    void setOnes(int newVal)
    {
        ones = newVal;
    }
    void setTwos(int newVal)
    {
        twos = newVal;
    }
    void setThrees(int newVal)
    {
        threes = newVal;
    }
    void setFours(int newVal)
    {
        fours = newVal;
    }
    void setFives(int newVal)
    {
        fives = newVal;
    }
    void setSixes(int newVal)
    {
        sixes = newVal;
    }
    void setBonus(int newVal)
    {
        bonus = newVal;
    }
    void setUpperTotal(int newVal)
    {
        upperTotal = newVal;
    }
    void setThreeKind(int newVal)
    {
        threeKind = newVal;
    }
    void setFourKind(int newVal)
    {
        fourKind = newVal;
    }
    void setFullHouse(int newVal)
    {
        fullHouse = newVal;
    }
    void setSmStraight(int newVal)
    {
        smStraight = newVal;
    }
    void setLgStraight(int newVal)
    {
        lgStraight = newVal;
    }
    void setYahtzee(int newVal)
    {
        yahtzee = newVal;
    }
    void setChance(int newVal)
    {
        chance = newVal;
    }
    void setLowerTotal(int newVal)
    {
        lowerTotal = newVal;
    }
    void setTotal(int newVal)
    {
        total = newVal;
    }
    void setAvail() {
        avail = new ArrayList<String>();
        this.getAvail().add("Ones");
        this.getAvail().add("Twos");
        this.getAvail().add("Threes");
        this.getAvail().add("Fours");
        this.getAvail().add("Fives");
        this.getAvail().add("Sixes");
        this.getAvail().add("Three of a Kind");
        this.getAvail().add("Four of a Kind");
        this.getAvail().add("Full House");
        this.getAvail().add("Small Straight");
        this.getAvail().add("Large Straight");
        this.getAvail().add("YAHTZEE!");
        this.getAvail().add("Chance");
    }


    //Methods
    void show()
    {
        System.out.println("SCORECARD");
        System.out.println("--------------");
        System.out.println("Upper Section");
        System.out.println("--------------");
        System.out.println("Ones              " + getOnes());
        System.out.println("Twos              " + getTwos());
        System.out.println("Threes            " + getThrees());
        System.out.println("Fours             " + getFours());
        System.out.println("Fives             " + getFives());
        System.out.println("Sixes             " + getSixes());
        System.out.println("Bonus?            " + getBonus());
        System.out.println("--------------");
        System.out.println("Upper Total       " + getUpperTotal());
        System.out.println("--------------------------------------");
        System.out.println("Lower Section");
        System.out.println("--------------");
        System.out.println("3 of A Kind       " + getThreeKind());
        System.out.println("4 of A Kind       " + getFourKind());
        System.out.println("Full House        " + getFullHouse());
        System.out.println("Small Straight    " + getSmStraight());
        System.out.println("Large Straight    " + getLgStraight());
        System.out.println("YAHTZEE           " + getYahtzee());
        System.out.println("Chance            " + getChance());
        System.out.println("--------------");
        System.out.println("Lower Total       " + getLowerTotal());
        System.out.println("+ Upper Total     " + getUpperTotal());
        System.out.println("--------------------------------------");
        System.out.println("GAME SCORE    =   " + getTotal());

    }

    public void fill(Result result) {
        switch (result.getType()) {
            case "Ones":
                this.setOnes(result.getWorth());
                this.setUpperTotal(getUpperTotal() + result.getWorth());
                getAvail().remove("Ones");
                break;
            case "Twos":
                this.setTwos(result.getWorth());
                this.setUpperTotal(getUpperTotal() + result.getWorth());
                getAvail().remove("Twos");
                break;
            case "Threes":
                this.setThrees(result.getWorth());
                this.setUpperTotal(getUpperTotal() + result.getWorth());
                getAvail().remove("Threes");
                break;
            case "Fours":
                this.setFours(result.getWorth());
                this.setUpperTotal(getUpperTotal() + result.getWorth());
                getAvail().remove("Fours");
                break;
            case "Fives":
                this.setFives(result.getWorth());
                this.setUpperTotal(getUpperTotal() + result.getWorth());
                getAvail().remove("Fives");
                break;
            case "Sixes":
                this.setSixes(result.getWorth());
                this.setUpperTotal(getUpperTotal() + result.getWorth());
                getAvail().remove("Sixes");
                break;
            case "Three of a Kind":
                this.setThreeKind(result.getWorth());
                this.setLowerTotal(getLowerTotal() + result.getWorth());
                getAvail().remove("Three of a Kind");
                break;
            case "Four of a Kind":
                this.setFourKind(result.getWorth());
                this.setLowerTotal(getLowerTotal() + result.getWorth());
                getAvail().remove("Four of a Kind");
                break;
            case "Full House":
                this.setFullHouse(result.getWorth());
                this.setLowerTotal(getLowerTotal() + result.getWorth());
                getAvail().remove("Full House");
                break;
            case "Small Straight":
                this.setSmStraight(result.getWorth());
                this.setLowerTotal(getLowerTotal() + result.getWorth());
                getAvail().remove("Small Straight");
                break;
            case "Large Straight":
                this.setLgStraight(result.getWorth());
                this.setLowerTotal(getLowerTotal() + result.getWorth());
                getAvail().remove("Large Straight");
                break;
            case "YAHTZEE!":
                this.setYahtzee(result.getWorth());
                this.setLowerTotal(getLowerTotal() + result.getWorth());
                getAvail().remove("YAHTZEE!");
                break;
            case "Chance":
                this.setChance(result.getWorth());
                this.setLowerTotal(getLowerTotal() + result.getWorth());
                getAvail().remove("Chance");
                break;
        }
        if(getUpperTotal() > 62)
        {
            setBonus(35);
            setUpperTotal(getUpperTotal() + getBonus());
        }
        this.setTotal(getUpperTotal() + getLowerTotal());

    }

    public boolean check(Result result)
    {
        boolean used;

        used = true;
        for(String str : getAvail())
        {
            if (str.equals(result.getType()))
            {
                used = false;
                break;
            }
        }
        if(result.getType().equals("Take Zero"))
        {
            used = false;
        }
        return used;


        /*boolean used;

        used = false;
        switch (result.getType()) {
            case "Ones":
                if (!(this.getOnes() == 0))
                {
                    used = true;
                }
                break;
            case "Twos":
                if (!(this.getTwos() == 0))
                {
                    used = true;
                }
                break;
            case "Threes":
                if (!(this.getThrees() == 0))
                {
                    used = true;
                }
                break;
            case "Fours":
                if (!(this.getFours() == 0))
                {
                    used = true;
                }
                break;
            case "Fives":
                if (!(this.getFives() == 0))
                {
                    used = true;
                }
                break;
            case "Sixes":
                if (!(this.getSixes() == 0))
                {
                    used = true;
                }
                break;
            case "Three of a Kind":
                if (!(this.getThreeKind() == 0))
                {
                    used = true;
                }
                break;
            case "Four of a Kind":
                if (!(this.getFourKind() == 0))
                {
                    used = true;
                }
                break;
            case "Full House":
                if (!(this.getFullHouse() == 0))
                {
                    used = true;
                };
                break;
            case "Small Straight":
                if (!(this.getSmStraight() == 0))
                {
                    used = true;
                }
                break;
            case "Large Straight":
                if (!(this.getLgStraight() == 0))
                {
                    used = true;
                }
                break;
            case "YAHTZEE!":
                if (!(this.getYahtzee() == 0))
                {
                    used = true;
                }
                break;
            case "Chance":
                if (!(this.getChance() == 0))
                {
                    used = true;
                }
                break;
        }
        return used; */
    }
}
