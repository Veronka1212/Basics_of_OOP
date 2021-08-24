package by.epam.oop5.task5.logic;

import by.epam.oop5.task5.bean.Bouquet;
import by.epam.oop5.task5.bean.flower.Flower;

import java.util.List;

public class Logic {

    public Logic(){
    }

    public static double calculateTheTotalCostOfTheBouquet(Bouquet bouquet) {
        List<Flower> arrayOfFlowers = bouquet.getFlowers();
        double totalCost = 0;
        for (Flower arrayOfFlower : arrayOfFlowers) {
            totalCost += arrayOfFlower.getPrice();
        }
        return totalCost;
    }
}
