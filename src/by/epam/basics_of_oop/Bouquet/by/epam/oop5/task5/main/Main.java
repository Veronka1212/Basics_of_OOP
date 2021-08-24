package by.epam.oop5.task5.main;

import by.epam.oop5.task5.bean.Bouquet;
import by.epam.oop5.task5.bean._package.Package;
import by.epam.oop5.task5.bean._package.TypeOfPackage;
import by.epam.oop5.task5.bean.flower.Color;
import by.epam.oop5.task5.bean.flower.Flower;
import by.epam.oop5.task5.bean.flower.Name;
import by.epam.oop5.task5.logic.Logic;

import java.util.ArrayList;
import java.util.List;

//Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Корректно спроектируйте и реализуйте предметную область задачи.
//• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
//проектирования.
//• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
//• для проверки корректности переданных данных можно применить регулярные выражения.
//• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
//• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
//Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
//(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
//и упаковка.

public class Main {

    public static final double PLUG_FOR_PRICE = 3.5;
    public static final double PLUG_FOR_PRICE_2 = 5.5;
    public static final double PLUG_FOR_PRICE_3 = 2;
    public static final int NUMBER_OF_THE_FLOWER = 0;

    public static void main(String[] args) {

        Flower one = new Flower(Name.LILY_OF_THE_VALLEY, Color.POWDERY, PLUG_FOR_PRICE);
        Flower two = new Flower(Name.PION, Color.RED, PLUG_FOR_PRICE_2);
        Flower three = new Flower(Name.MIMOSA, Color.YELLOW, PLUG_FOR_PRICE_3);

        Package packageForBouquet = new Package(TypeOfPackage.BASKET, PLUG_FOR_PRICE_3);

        List<Flower> flowers = new ArrayList<>();
        flowers.add(one);
        flowers.add(two);
        flowers.add(three);
        Bouquet bouquet = new Bouquet(flowers, packageForBouquet);
        System.out.println(bouquet.toString());

        System.out.println("Удалим цветок из композиции ");
        bouquet.delFlower(bouquet.getFlowers(), NUMBER_OF_THE_FLOWER);
        System.out.println("Добавим новый цветок в композицию");
        bouquet.addFlower(bouquet.getFlowers(), three);

        System.out.println(bouquet.toString());
        System.out.println("Стоимость букета " + Logic.calculateTheTotalCostOfTheBouquet(bouquet));
    }
}
