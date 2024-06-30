package se.lexicon;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Employee {
    private final int id;
    private String name;
    private double salary = 25000;
    private LocalDate dateHired;

    // Constructor
    public Employee(String name, LocalDate dateHired) {
        this.id = setId();
        this.name = name;
        this.dateHired = dateHired;
    }
    private int setId() {
        // Generate a random number between 10 and 300.
        return (int) (Math.random() * (300 - 10 + 1) + 10);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }


    public abstract void calculateSalary();
}
