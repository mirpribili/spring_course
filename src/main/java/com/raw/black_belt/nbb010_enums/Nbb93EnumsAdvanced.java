package com.raw.black_belt.nbb010_enums;

import java.util.Arrays;

public class Nbb93EnumsAdvanced {
    public static void main(String[] args) {

        System.out.println(WeekDaysAdvanced.SATURDAY.getMood());

        System.out.println(WeekDaysAdvanced.valueOf("THURSDAY"));
        WeekDaysAdvanced[] array = WeekDaysAdvanced.values();
        System.out.println(Arrays.toString(array));
    }

}
enum WeekDaysAdvanced{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");
    private String mood;
    private WeekDaysAdvanced(String mood){
        this.mood=mood;
    }
    public String getMood(){
        return mood;
    }
}
