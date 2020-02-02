package com.kodilla.collections.set.homework;

import com.kodilla.collections.set.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("krajowy",3.0,2.0,true));
        stamps.add(new Stamp("okolicznosciowy",5.0,3.5, false));
        stamps.add(new Stamp("krajowy",4.5,3.2,true));
        stamps.add(new Stamp("okolicznosciowy",5.0,3.5, false));
        stamps.add(new Stamp("okolicznosciowy",5.0,3.5, false));

        for(Stamp stamp : stamps) {
            System.out.println(stamp);
        }

        System.out.println(stamps.size());
    }
}
