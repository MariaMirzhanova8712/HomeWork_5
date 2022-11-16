package Сollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SolarSystem_6 {
    public static void main(String[] args) {

        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";
        String saturn = "Сатурн";
        String neptune = "Нептун";
        String uranus = "Уран";
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury,venus,earth,mars,jupiter,saturn,neptune,uranus));
        System.out.println(solarSystem);
        Collections.swap(solarSystem, solarSystem.indexOf(neptune), solarSystem.indexOf(uranus));
        System.out.println(solarSystem);



    }
}
