package com.kodilla.abstracts.homework2;

public class Person  {
    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showDetails() {
        System.out.println(this.firstName + " responsibility is "+ this.job.giveResp());
    }
}
