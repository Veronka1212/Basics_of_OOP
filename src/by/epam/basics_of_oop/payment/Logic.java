package by.epam.basics_of_oop.payment;

import java.util.ArrayList;

public class Logic {
    public static int priceArrayList(ArrayList<Payment.Shopping> array, Payment p) {
        int sum=0;
        for (Payment.Shopping s : array) {
            sum=sum+s.getCost();
        }
        return sum;
    }
}
