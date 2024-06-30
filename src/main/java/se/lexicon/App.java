package se.lexicon;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create a system developer.
        SystemDeveloper systemDeveloper = new SystemDeveloper("Sami", LocalDate.now(),
                new String[]{"Cert1", "Cert2"}, new String[] {"Java", "Python", "JavaScript"});

        // Add a certificate.
        systemDeveloper.addCertificate("Cert3");
        // Add a language.
        systemDeveloper.addLanguage("C#");

        // Display system developer's info.
        System.out.println("System Developer: " + systemDeveloper);

        // Create a new SalesPerson object
        SalesPerson salesPerson = new SalesPerson("John Doe", new String[]{"Client1", "Client2"});
        // Acquire client for salesPerson.
        salesPerson.acquireClient("Client3");

        // Display sales person's info.
        System.out.println("\nSales Person: " + salesPerson);


    }
}
