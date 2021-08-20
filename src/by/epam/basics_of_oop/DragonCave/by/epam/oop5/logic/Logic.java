package by.epam.oop5.logic;

import by.epam.oop5.bean.Treasures;

import java.util.ArrayList;
import java.util.List;

public class Logic {

    public static void chooseTheMostExpensiveTreasure(List<Treasures> treasuresList) {
        int maximumPrice = 0;
        Treasures expensiveTreasure = null;
        int temp;
        for (Treasures t : treasuresList) {
            temp = t.getCost();
            if (temp > maximumPrice) {
                maximumPrice = temp;
                expensiveTreasure = t;
            }
        }
        assert expensiveTreasure != null;
        System.out.println(expensiveTreasure.toString());
    }

    public static List<Treasures> treasuresForAGivenAmount(List<Treasures> treasuresList, int amount) {
        List<Treasures> listForAGivenAmount = new ArrayList<>();
        int sumOfTheSelectedTreasures = 0;
        for (Treasures t : treasuresList) {
            int cost;
            cost = t.getCost();
            if (cost <= amount && sumOfTheSelectedTreasures + cost <= amount) {
                listForAGivenAmount.add(t);
                sumOfTheSelectedTreasures += cost;
            }
        }
        return listForAGivenAmount;
    }
}