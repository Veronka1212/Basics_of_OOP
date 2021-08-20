package by.epam.oop5.main;

import by.epam.oop5.input.InputData;

import java.util.ArrayList;
import java.util.List;

import by.epam.oop5.bean.*;
import by.epam.oop5.logic.Logic;
import by.epam.oop5.output.OutputData;


public class Main {

    ///*Создать консольное приложение, удовлетворяющее следующим требованиям:
    //• Приложение должно быть объектно-, а не процедурно-ориентированным.
    //• Каждый класс должен иметь отражающее смысл название и информативный состав.
    //• Наследование должно применяться только тогда, когда это имеет смысл.
    //• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
    //• Классы должны быть грамотно разложены по пакетам.
    //• Консольное меню должно быть минимальным.
    //• Для хранения данных можно использовать файлы.
    //Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
    //дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
    //выбора сокровищ на заданную сумму.

    final static int GIVEN_AMOUNT = 100;

    public static void main(String[] args) {

        List<String> readFromFile = InputData.setListOfTreasures();

        List<Treasures> caveWithTreasures = new ArrayList<>();
        int i = 0;
        String name;
        int cost;
        for (; i < readFromFile.size(); i++) {
            name = InputData.setNameOfTreasureFromFile(readFromFile.get(i));
            cost = InputData.setCostOfTreasureFromFile(readFromFile.get(i));
            caveWithTreasures.add(new Treasures(name, cost));
        }

        System.out.println("Самое дорогое сокровище в переще: ");
        Logic.chooseTheMostExpensiveTreasure(caveWithTreasures);
        System.out.println();

        System.out.println("Список сокровищ на сумму " + GIVEN_AMOUNT + ": ");
        System.out.println(Logic.treasuresForAGivenAmount(caveWithTreasures, GIVEN_AMOUNT).toString());
        System.out.println();

        OutputData.seeAllTreasures(caveWithTreasures);
    }
}
