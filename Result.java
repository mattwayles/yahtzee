package Yahtzee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/***************************************************************************************/
/* Result.class                                                                        */
/* Matthew Blough-Wayles                                                               */
/* Created 12/13/16                                                                    */
/* Edited 12/16/16                                                                     */
/* A class to create a Result option that contains a result type and value.            */
/**************************************************************************************/
public class Result {
    String type;
    int worth;

    Result(String str, int num) {
        setType(str);
        setWorth(num);

    }

    String getType() {
        return type;
    }

    int getWorth() {
        return worth;
    }

    void setType(String str) {
        type = str;
    }

    void setWorth(int num) {
        worth = num;
    }

    void sort(List<Die> pattern) {
        Collections.sort(pattern, new Comparator<Die>() {
            public int compare(Die o1, Die o2) {
                if (o1.getValue() == o2.getValue())
                    return 0;
                return o1.getValue() < o2.getValue() ? -1 : 1;
            }
        });
    }

    void display(int i)
    {
        System.out.println(i + ": " + getType() + " (" + getWorth() + ")");
    }
}
