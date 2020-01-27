package com.kodilla.abstracts.homework2;

public abstract class Job {
    int salary;
    String resposibilites;

    public Job (int salary, String responsibilites) {
        this.salary = salary;
        this.resposibilites = responsibilites;
    }

    public String giveResp() {
        return this.resposibilites;
    }
}
