package com.kodilla.abstracts.homework2;

public class Apli {
    public static void main(String[] args) {
        Seller seller = new Seller(20, "selling");

        Person person = new Person("Grzegorz", 28, seller);
        person.showDetails();
    }
}
