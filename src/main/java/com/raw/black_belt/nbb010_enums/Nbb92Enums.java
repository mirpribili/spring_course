package com.raw.black_belt.nbb010_enums;

public class Nbb92Enums {
    WeekDays weekDays;

    public Nbb92Enums(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void method(WeekDays dayOfWeek){
        System.out.println("Today is " + dayOfWeek);
        switch (weekDays){
            case MONDAY:
                System.out.println();
        }
    }
    public static void main(String[] args) {
        Nbb92Enums enums = new Nbb92Enums(WeekDays.MONDAY);
        enums.method(WeekDays.MONDAY);
    }
}
enum WeekDays{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}