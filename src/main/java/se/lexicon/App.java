package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create SystemDeveloper instance
        SystemDeveloper systemDeveloper = new SystemDeveloper("Sami", LocalDate.now(),
                new String[]{"CCNA"}, new String[]{"Java", "JavaScript"});

        // Display SystemDeveloper information.
        System.out.println(systemDeveloper.toString());

    }
}
