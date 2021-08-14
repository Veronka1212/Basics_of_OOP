package by.epam.basics_of_oop.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.time.LocalDate.of;

public class Calendar {

    private static final int DAYS_OF_LEAP_YEAR = 30;
    private List<LocalDate> monthList;

    public Calendar() {
    }

    public Calendar(List<LocalDate> monthList) {
        this.monthList = monthList;
    }

    public List<LocalDate> getMonthList() {
        return monthList;
    }

    public void setMonthList(List<LocalDate> monthList) {
        this.monthList = monthList;
    }

    public List<LocalDate> initLocalDatesList(int year, int month) {
        List<LocalDate> localDates = new ArrayList<>();
        int dayMAX = getDayMax(month);
        initLocalDates(year, month, localDates, dayMAX);
        return localDates;
    }

    private void initLocalDates(int year, int month, List<LocalDate> localDates, int dayMax) {
        int day = 1;
        while (day <= dayMax) {
            localDates.add(of(year, month, day));
            if (LocalDate.of(year, month, day).isLeapYear() & day == DAYS_OF_LEAP_YEAR) continue;
            day++;
        }
    }

    private int getDayMax(int month) {
        int dayMax;
        switch (month) {
            case 2: {
                dayMax = 28;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                dayMax = 30;
                break;
            }
            default:
                dayMax = 31;
        }
        return dayMax;
    }

    public static class Holiday {

        public Holiday() {
        }

        private List<LocalDate> daysOffArray;
        private List<LocalDate> holidaysArray;

        public Holiday(List<LocalDate> daysOffArray, List<LocalDate> holidaysArray) {
            this.daysOffArray = daysOffArray;
            this.holidaysArray = holidaysArray;
        }

        public List<LocalDate> getDaysOffArray() {
            return daysOffArray;
        }

        public void setDaysOffArray(List<LocalDate> daysOffArray) {
            this.daysOffArray = daysOffArray;
        }

        public List<LocalDate> getHolidaysArray() {
            return holidaysArray;
        }

        public void setHolidaysArray(List<LocalDate> holidaysArray) {
            this.holidaysArray = holidaysArray;
        }

        public void fillDaysOff(List<LocalDate> listMonth) {

            for (LocalDate date : listMonth) {
                if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) | date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                    daysOffArray.add(date);
                }
            }
        }

        public List<LocalDate> holidays(int year) {

            holidaysArray.add(of(year, 3, 8));
            holidaysArray.add(of(year, 12, 31));
            holidaysArray.add(of(year, 1, 1));
            holidaysArray.add(of(year, 5, 9));
            holidaysArray.add(of(year, 5, 1));

            return holidaysArray;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Holiday holiday = (Holiday) o;
            return Objects.equals(daysOffArray, holiday.daysOffArray) && Objects.equals(holidaysArray, holiday.holidaysArray);
        }

        @Override
        public int hashCode() {
            return Objects.hash(daysOffArray, holidaysArray);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar2 = (Calendar) o;
        return Objects.equals(monthList, calendar2.monthList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monthList);
    }
}
