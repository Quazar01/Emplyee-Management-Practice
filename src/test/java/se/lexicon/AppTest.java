package se.lexicon;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AppTest {

    @Test
    public void test_main() {
        // Arrange
        // Act
        // Assert

        // Create a system developer.
        SystemDeveloper systemDeveloper = new SystemDeveloper("Sami", LocalDate.now(),
                new String[]{"Cert1", "Cert2"}, new String[] {"Java", "Python", "JavaScript"});
        // Check that the Id is an integer between 10 and 300.
        assert systemDeveloper.getId() >= 10 && systemDeveloper.getId() <= 300 : "Id should be between 10 and 300!";
        // Check that the name is "Sami", Display "Name is not Sami" if it's not.
        assert systemDeveloper.getName().equals("Sami") : "Name is wrong!";
        // Check the certificates.
        assert systemDeveloper.getCertificates().length == 2 : "Certificates length is wrong!";
        assert systemDeveloper.getCertificates()[0].equals("Cert1") : "Certificate 1 is wrong!";
        assert systemDeveloper.getCertificates()[1].equals("Cert2") : "Certificate 2 is wrong!";
        // Check the languages.
        assert systemDeveloper.getLanguages().length == 3 : "Languages length is wrong!";
        assert systemDeveloper.getLanguages()[0].equals("Java") : "Language 1 is wrong!";
        assert systemDeveloper.getLanguages()[1].equals("Python") : "Language 2 is wrong!";
        assert systemDeveloper.getLanguages()[2].equals("JavaScript") : "Language 3 is wrong!";
        // Add a certificate.
        systemDeveloper.addCertificate("Cert3");
        assert systemDeveloper.getCertificates().length == 3 : "Certificate Cert3 is not added!";
        assert systemDeveloper.getCertificates()[2].equals("Cert3") : "The added certificate Cert3 is wrong!";
        // Add a language.
        systemDeveloper.addLanguage("C#");
        assert systemDeveloper.getLanguages().length == 4 : "Language C# is not added!";
        assert systemDeveloper.getLanguages()[3].equals("C#") : "The added language is wrong!";
        // Check the salary.
        assert systemDeveloper.getSalary() == 25000 + (4 * 1500)
                + (3 * 1000) : "Salary is wrong!";

        // Create a new SalesPerson object
        SalesPerson salesPerson = new SalesPerson("Test sales", new String[]{"Client1", "Client2"});
        // Check that the Id is an integer between 10 and 300.
        assert salesPerson.getId() >= 10 && salesPerson.getId() <= 300 : "Id is wrong!";
        // Check that the name is "Test sales".
        assert salesPerson.getName().equals("Test sales") : "Name is wrong!";
        // Check the clients.
        assert salesPerson.getClients().length == 2 : "Clients length is wrong!";
        assert salesPerson.getClients()[0].equals("Client1") : "Client1 is wrong!";
        assert salesPerson.getClients()[1].equals("Client2") : "Client2 is wrong!";
        // Check the acquired clients.
        assert salesPerson.getAcquiredClients() == 0 : "Number of Acquired clients is wrong!";
        // Acquire client for salesPerson.
        salesPerson.acquireClient("Client3");
        // Check the acquired clients.
        assert salesPerson.getAcquiredClients() == 1 : "Number of Acquired clients is wrong!";
        // Check the salary.
        assert salesPerson.getSalary() == 25000 + (3 * 500) + 1000 : "Salary is wrong!";

    }
}
