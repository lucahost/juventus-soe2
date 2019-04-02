package ch.juventus.sockets.codeproject;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }
}
