// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
        int weekday;
        Day birthday = new Day(1989, 7, 1);
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900

        // January 1, 1900 was a Monday
        // Compute the number of days from that day until the birthday
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday
        Day startDay = new Day(1989,6,24);
        weekday = (birthday.daysFrom(startDay)+1)%7;

        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
