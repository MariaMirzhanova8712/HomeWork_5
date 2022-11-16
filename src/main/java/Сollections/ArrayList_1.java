package Сollections;

import java.awt.List;
import java.util.*;
import java.util.Iterator;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(5);
        list.add(20);
        list.add(2);
        list.add(61);
        list.add(57);
        list.add(6);
        list.add(82);
        Iterator<Integer> Itr = list.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }
        Collections.sort(list); //сортировка по возрастанию
        System.out.println(list);

        Collections.reverse(list); //сортировка по убыванию
        System.out.println(list);

        list.clear(); //очисть список
        System.out.println(list);
    }
}



