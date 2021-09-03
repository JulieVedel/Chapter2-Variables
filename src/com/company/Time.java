package com.company;

public class Time {

    public static void main(String[] args) {
        System.out.println("Exercise 3:");

        int hour = 18;
        int minute = 15;
        int second = 27;
        float sinceMidnight = hour * 60 * 60 + minute * 60 + second;
        int dayInSeconds = 24 * 60 * 60;

        System.out.print("The number of seconds since midnight: ");
        System.out.println(sinceMidnight);

        System.out.print("The amount of seconds until midnight: ");
        System.out.println(dayInSeconds - sinceMidnight);

        float passedPercentage = sinceMidnight / dayInSeconds * 100;
        System.out.print("How much of the day has passed in percentage: ");
        System.out.print(passedPercentage + "%");
    }
}
