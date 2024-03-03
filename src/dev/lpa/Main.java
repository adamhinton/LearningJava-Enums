package dev.lpa;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
//        System.out.println(weekDay);


        for(int i=0; i<10; i++){
            weekDay = getRandomDay();

//            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());
//
//            if (weekDay == DayOfTheWeek.FRI){
//                System.out.println("Found a Friday!!!!!");
//            }

            switchDayOfWeek(weekDay);

        }

    }

    public static DayOfTheWeek getRandomDay(){

        int randomInt = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInt];
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() + 1;

        switch(weekDay){
//            case SUN -> System.out.println("Sun" +weekDayInteger);
//            case MON-> System.out.println("Mon" +weekDayInteger);
//            case TUES -> System.out.println("Tues" +weekDayInteger);
            case WED -> System.out.println("Wed" +weekDayInteger);
//            case THURS -> System.out.println("Thurs" +weekDayInteger);
//            case FRI -> System.out.println("Fri" +weekDayInteger);
            case SAT -> System.out.println("Sat" +weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day" +
                    " is Day" + weekDayInteger);

        }
    }

}