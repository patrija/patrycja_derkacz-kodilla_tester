package com.kodilla.collections.adv.maps.complex;

import java.util.Objects;

public class Student {
    private String fisrtname;
    private String lastname;

    public Student(String fisrtname, String lastname) {
        this.fisrtname = fisrtname;
        this.lastname = lastname;
    }

    public String getFisrtname() {
        return fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(fisrtname, student.fisrtname) &&
                Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fisrtname, lastname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fisrtname='" + fisrtname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
