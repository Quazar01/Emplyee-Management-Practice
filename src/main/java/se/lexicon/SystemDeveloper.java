package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

public class SystemDeveloper extends Employee {

    private String[] certificates = new String[10];
    private String[] languages = new String[10];

    // Constructor
    public SystemDeveloper(String name, LocalDate dateHired, String[] certificates, String[] languages) {
        super(name, dateHired);
        setCertificates(certificates);
        setLanguages(languages);
        this.calculateSalary();
    }

    // Helper methods.
    private void setCertificates (String[] certs) {
        System.arraycopy(certs, 0, this.certificates, 0, certs.length);
    }
    private void setLanguages (String[] langs) {
        System.arraycopy(langs, 0, this.languages, 0, langs.length);
    }

    // Getters and Setters
    public String[] getCertificates() {
        int certsCount = getArrayCount(certificates);
        String[] certs = new String[certsCount];
        for (int i = 0; i < certsCount; i++) {
            if (certificates[i] != null) {
                certs[i] = certificates[i];
            }
        }
        return certs;
    }
    public String[] getLanguages() {
        int langsCount = getArrayCount(languages);
        String[] langs = new String[langsCount];
        for (int i = 0; i < langsCount; i++) {
            if (languages[i] != null) {
                langs[i] = languages[i];
            }
        }
        return langs;
    }

    // Methods.
    public void addCertificate (String cert) {
        if (getArrayCount(certificates) < certificates.length) {
            for (int i = 0; i < certificates.length; i++) {
                if (certificates[i] == null) {
                    certificates[i] = cert;
                    break;
                }
            }
            calculateSalary();
        } else {
            System.out.println("Certificates list is full, cannot add more certificates!");
        }
    }

    public void addLanguage (String lang) {
        if (getArrayCount(languages) < languages.length) {
            for (int i = 0; i < languages.length; i++) {
                if (languages[i] == null) {
                    languages[i] = lang;
                    break;
                }
            }
            calculateSalary();
        } else {
            System.out.println("Languages list is full, cannot add more languages");
        }
    }

    @Override
    public void calculateSalary() {
        double baseSalary = 25000;
        int certificateCount = getArrayCount(certificates);
        int languageCount = getArrayCount(languages);

        double newSalary = baseSalary + (certificateCount * 1000) + (languageCount * 1500);
        setSalary(newSalary);
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "\nName: " + getName() + "\nSalary: " + getSalary() +
                "\nDate Hired: " + getDateHired() + "\nCertificates: " + Arrays.toString(getCertificates()) +
                "\nLanguages: " + Arrays.toString(getLanguages());
    }
}
