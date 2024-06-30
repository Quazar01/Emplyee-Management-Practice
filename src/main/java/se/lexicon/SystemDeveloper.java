package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

public class SystemDeveloper extends Employee {

    private String[] certificates = new String[10];
    private String[] languages = new String[10];

    // Constructor
    public SystemDeveloper(String name, LocalDate dateHired, String[] certificates, String[] languages) {
        super(name, dateHired);
        this.certificates = certificates;
        this.languages = languages;
        this.calculateSalary();
    }

    // Getters and Setters
    public String[] getCertificates() {
        return certificates;
    }
    public String[] getLanguages() {
        return languages;
    }

    @Override
    public void calculateSalary() {
        double newSalary = getSalary() + (certificates.length * 1000) + (languages.length * 1500);
        setSalary(newSalary);
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "\nName: " + getName() + "\nSalary: " + getSalary() +
                "\nDate Hired: " + getDateHired() + "\nCertificates: " + Arrays.toString(certificates) +
                "\nLanguages: " + Arrays.toString(languages);
    }
}
