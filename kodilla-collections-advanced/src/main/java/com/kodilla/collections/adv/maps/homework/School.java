package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> school = new ArrayList<>();

    private String schoolName;

    public School(String schoolName, int... school) {
        this.schoolName = schoolName;
        for(int number : school)
            this.school.add(number);
    }

    public int getSum() {
        int licznik = 0;
        for(int num : school)
            licznik = licznik + num;
        return licznik;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                '}';
    }

    public List<Integer> getSchool() {
        return school;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
