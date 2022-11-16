package Сollections;

import java.util.*;

public class House_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> residentsOfHouse = new HashMap<>();
        residentsOfHouse.put("Глухов Иван Тимурович", 28);
        residentsOfHouse.put("Кузнецова Марина Борисовна", 14);
        residentsOfHouse.put("Мельников Михаил Георгиевич", 32);
        residentsOfHouse.put("Грачева Ева Павловна", 49);
        residentsOfHouse.put("Безруков Игорь Давидович", 17);

        ArrayList<String> adults = new ArrayList<>(); //создаем  ArrayList
        for (Map.Entry<String, Integer> age : residentsOfHouse.entrySet()) { //в цикле перебираем мапу и  в переменную age будем записывать ключи, значения которых удовл. условию
            if (age.getValue() > 17) {   // получаем значение из мапы, проверяем условие если выполняется
                adults.add(age.getKey()); //то добавляем в наш ArrayList значение заданной переменной  age по ключу (добавляется ключ ФИО)
            }
        }
        Collections.sort(adults);
        System.out.println("Жильцы старше 18 лет: " + adults);
    }
}
