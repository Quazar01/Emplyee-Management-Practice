package se.lexicon;

import java.time.LocalDate;

public abstract class Employee {
    private final int id;
    private String name;
    private double salary = 25000;
    private LocalDate dateHired;

    // Constructor
    public Employee(String name, LocalDate dateHired) {
        this.id = setId();
        setName(name);
        setDateHired(dateHired);
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
    public double getBaseSalary() {
        return 25000;
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

    protected int getArrayCount (String[] input) {
        int count = 0;
        for (String element : input) {
            if (element != null) {
                count ++;
            }
        }
        return count;
    }

    protected abstract void calculateSalary();
}
