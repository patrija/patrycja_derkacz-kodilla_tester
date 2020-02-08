package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Double> school = new ArrayList<>();

    private String schoolName;

    public School(String schoolName, double... school) {
        this.schoolName = schoolName;
        for(double number : school)
            this.school.add(number);
    }

    public double getSum() {
         double licznik = 0;
         for(double num : school)
             licznik = licznik + num;
        return licznik;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                '}';
    }

    public List<Double> getSchool() {
        return school;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
