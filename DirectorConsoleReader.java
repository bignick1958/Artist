package reader;

import model.Director;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Nick_Shapkin on 29.11.2016.
 */
public class DirectorConsoleReader {
    private final PrintStream suggestionOut;
    private final Scanner scanner;

    public DirectorConsoleReader() {
        suggestionOut = System.out;
        scanner = new Scanner(System.in);
    }

    public Director read() {
        suggestionOut.println("Enter Name: ");
        Director director = new Director();
        director.setName(scanner.nextLine());


        suggestionOut.println("Enter Phone: ");
        director.setPhone(scanner.nextLine());

        suggestionOut.println("Enter Email: ");
        director.setEmail(scanner.nextLine());

        return director;
    }
}
