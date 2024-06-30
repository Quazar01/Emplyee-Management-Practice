package se.lexicon;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Employee {
    private int id;
    private String name;
    private double salary;
    private LocalDate dateHired;
    private int sequencer = 0;

    // Constructor
    public Employee(int id, String name, LocalDate dateHired) {
        this.id = getId();
        this.name = name;
        this.dateHired = dateHired;
    }

    // Getters and Setters
    public int getId() {
        return ++sequencer;
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
