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
        setValue(getOnes(), 0);
        setValue(getTwos(), 0);
        setValue(getThrees(), 0);
        setValue(getFours(), 0);
        setValue(getFives(), 0);
        setValue(getSixes(), 0);
        setValue(getBonus(), 0);
        setValue(getUpperTotal(), 0);
        setValue(getThreeKind(), 0);
        setValue(getFourKind(), 0);
        setValue(getFullHouse(), 0);
        setValue(getSmStraight(), 0);
        setValue(getLgStraight(), 0);
        setValue(getYahtzee(), 0);
        setValue(getChance(), 0);
        setValue(getLowerTotal(), 0);
        setValue(getTotal(), 0);
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
    void setValue(int name, int newVal)
    {
        name = newVal;
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

    /*
    //Setters
    void setOnes(int val)
    {
        ones = val;
    }
    void setTwos(int val)
    {
        twos = val;
    }
    void setThrees(int val)
    {
        threes = val;
    }
    void setFours(int val)
    {
        fours = val;
    }
    void setFives(int val)
    {
        fives = val;
    }
    void setSixes(int val)
    {
        sixes = val;
    }
    void setBonus(int val)
    {
        bonus = val;
    }
    void setThreeKind(int val)
    {
        threeKind = val;
    }
    void setFourKind(int val)
    {
        fourKind = val;
    }
    void setFullHouse(int val)
    {
        fullHouse = val;
    }
    void setSmStraight(int val)
    {
        smStraight = val;
    }
    void setLgStraight(int val)
    {
        lgStraight = val;
    }
    void setYahtzee(int val)
    {
        yahtzee = val;
    }
    void setChance(int val)
    {
        chance = val;
    } */
}
