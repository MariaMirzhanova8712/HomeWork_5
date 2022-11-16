package Сollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMin_4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(82, -3, 77, 25, -100, -120, 20, 1, 0));
        System.out.println("максимальное значение в массиве numbers: " + Collections.max(numbers));
        System.out.println("минимальное значение в массиве numbers: " + Collections.min(numbers));
    }
}
