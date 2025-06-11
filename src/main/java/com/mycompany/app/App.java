package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    /****
 * Constructs a new instance of the App class.
 */
public App() {}

    /****
     * Entry point of the application. Prints a greeting message to the standard output.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    /**
     * Returns the application's greeting message.
     *
     * @return the greeting message string
     */
    public String getMessage() {
        return MESSAGE;
    }
}
