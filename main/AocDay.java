package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Scanner;

public abstract class AocDay {
    
    protected String fileName;
    protected Duration runDuration;

    public static final String PART_ONE_KEY = "partOne";
    public static final String PART_TWO_KEY = "partTwo";

    public AocDay(String fileName) {
        this.fileName = fileName;
    }

    // Initialize Day state.
    protected abstract void initializeInput();

    // Per Scanner line, parse input.
    protected abstract void perInput(String input);

    // Business logic of the particular Day's problem.
    protected abstract void runLogic();

    // Return results in a Map with keys PART_ONE_KEY and PART_TWO_KEY respectively.
    public abstract Map<String, Object> getResults();

    public void run() throws Exception {

        Instant before = Instant.now();

        initializeInput();
        readInput();
        runLogic();

        runDuration = Duration.between(before, Instant.now());

        System.out.println("TOTAL DURATION: %s".formatted(runDuration));
    }

    public void readInput() throws FileNotFoundException {
        File file = new File(fileName);

        try (Scanner inputScanner = new Scanner(file)) {
            while (inputScanner.hasNextLine()) {
                perInput(inputScanner.nextLine());
            }
            inputScanner.close();
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Duration getRunDuration() {
        return runDuration;
    }
}
