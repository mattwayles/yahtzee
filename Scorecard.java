package Yahtzee;

/**
 * Created by root on 12/13/16.
 */
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


    void Scorecard()
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

    void fill()
    {

    }


    public void fill(Result result) {
        switch (result.getType()) {
            case "Ones":
                this.setOnes(result.getWorth());
                break;
            case "Twos":
                this.setTwos(result.getWorth());
                break;
            case "Threes":
                this.setThrees(result.getWorth());
                break;
            case "Fours":
                this.setFours(result.getWorth());
                break;
            case "Fives":
                this.setFives(result.getWorth());
                break;
            case "Sixes":
                this.setSixes(result.getWorth());
                break;
            case "Three of a Kind":
                this.setThreeKind(result.getWorth());
                break;
            case "Four of a Kind":
                this.setFourKind(result.getWorth());
                break;
            case "Full House":
                this.setFullHouse(result.getWorth());
                break;
            case "Small Straight":
                this.setSmStraight(result.getWorth());
                break;
            case "Large Straight":
                this.setLgStraight(result.getWorth());
                break;
            case "YAHTZEE!":
                this.setYahtzee(result.getWorth());
                break;
            case "Chance":
                this.setChance(result.getWorth());
                break;
        }
    }
}
