package com.kodilla.abstracts.homework2;

public class Person  {
    String firstName;
    int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void showDetails(Job job) {
        System.out.println(this.firstName + " responsibility is "+ job.giveResp());
    }
}
