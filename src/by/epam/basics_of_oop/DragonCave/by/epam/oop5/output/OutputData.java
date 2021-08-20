package by.epam.oop5.output;

import by.epam.oop5.bean.Treasures;
import java.util.List;

public class OutputData {

    public static void seeAllTreasures(List<Treasures> treasuresList) {
        System.out.println("Все сокровища пещеры: ");
        for (Treasures t : treasuresList)
            System.out.println(t.toString());
    }
}
