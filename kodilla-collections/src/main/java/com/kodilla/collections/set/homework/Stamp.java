package com.kodilla.collections.set.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private  double height;
    private  double width;
    private boolean stempel;

    public Stamp(String name, double height, double width, boolean stempel) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.stempel = stempel;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean isStempel() {
        return stempel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.height, height) == 0 &&
                Double.compare(stamp.width, width) == 0 &&
                stempel == stamp.stempel &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, width, stempel);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", stempel=" + stempel +
                '}';
    }
}
