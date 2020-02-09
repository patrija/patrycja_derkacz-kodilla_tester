package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> szkola = new HashMap<>();

        Principal kazimierz = new Principal("Kazimierz", "W");
        Principal jolanta = new Principal("Jolanta", "G");
        Principal natalia = new Principal("Natalia", "M");
        Principal grazyna = new Principal("Grazyna", "G");

        School kazimierzSchool = new School("HighSchoolNo1",10, 15, 16);
        School jolantaSchool = new School("HighSchoolNo5",30, 35, 28, 27);
        School nataliaSchool = new School("HighSchoolNo2",12,20,15,28,19);
        School grazynaSchool = new School("HighSchoolNo8", 14,18,15,13,250);

        szkola.put(kazimierz, kazimierzSchool);
        szkola.put(jolanta, jolantaSchool);
        szkola.put(natalia, nataliaSchool);
        szkola.put(grazyna, grazynaSchool);

        for(Map.Entry<Principal, School> principalEntry : szkola.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + " " + principalEntry.getKey().getLastname()+ " is Principal of " + principalEntry.getValue().getSchoolName() + ". Total numbers of students is  " + principalEntry.getValue().getSum());
    }
}
