package Сollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_2 {
    public static void main(String[] args) {

        String monday = "monday";
        String tuesday = "tuesday";
        String wednesday = "wednesday";
        String thursday = "thursday";
        String friday = "friday";
        String saturday = "saturday";
        String sunday = "sunday";

        ArrayList<String> week = new ArrayList<>(Arrays.asList(monday, tuesday, wednesday, thursday, friday, saturday, sunday));
        System.out.println(week);

        Collections.sort(week);
        System.out.println(week);

        Collections.reverse(week);

        week.clear();
        System.out.println(week);
    }
}


