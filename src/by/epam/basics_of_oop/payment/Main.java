package by.epam.basics_of_oop.payment;

//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
//нескольких товаров.

import java.util.ArrayList;

import static by.epam.basics_of_oop.payment.Logic.priceArrayList;

public class Main {
    public static void main(String[] args) {

        Payment newPay = new Payment();
        ArrayList<Payment.Shopping> array = new ArrayList<>();
        array.add(new Payment.Shopping("огурцы", 2, 4));
        array.add(new Payment.Shopping("помидоры", 4, 2));
        array.add(new Payment.Shopping("колбаса", 8, 1));

        newPay.setShop("Алми");
        Payment newPay2 = new Payment();
        ArrayList<Payment.Shopping> array2 = new ArrayList<>();
        array2.add(new Payment.Shopping("молоко", 2, 1));
        array2.add(new Payment.Shopping("конфеты", 4, 1));
        array2.add(new Payment.Shopping("картофель", 1, 3));

        newPay2.setShop("Виталюр");
        System.out.println("Совершенные покупки: ");
        System.out.println(newPay.toString()+array.toString()+", сумма покупки "+priceArrayList(array,newPay));
        System.out.println();
        System.out.println(newPay2.toString()+array2.toString()+", сумма покупки "+priceArrayList(array2,newPay2));

    }
}
