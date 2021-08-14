package by.epam.basics_of_oop.calendar;

import java.util.ArrayList;

public class Main {

    private static final int YEAR = 2021;
    private static final int ALL_MONTH = 12;

    public static void main(String[] args) {


        Calendar.Holiday holiday = new Calendar.Holiday(new ArrayList<>(), new ArrayList<>());
        for (int i = 1; i <= ALL_MONTH; i++) {
            holiday.fillDaysOff(getMonth(i).getMonthList());
        }

        System.out.println("Выходные: ");
        System.out.println(holiday.getDaysOffArray().toString());

        System.out.println("Праздники в 2021: ");
        holiday.setHolidaysArray(new ArrayList<>());
        System.out.println(holiday.holidays(YEAR).toString());
    }

    private static Calendar getMonth(int month) {
        Calendar calendar = new Calendar();
        calendar.setMonthList(calendar.initLocalDatesList(YEAR, month));
        return calendar;
    }
}