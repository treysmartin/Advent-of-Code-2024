package main;

import java.util.Map;
import java.util.Scanner;

import main.day1.DayOne;

public class DayRunner {

    public static void main(String[] args) throws Exception {
        String input = "";
        try (Scanner inputScanner = new Scanner(System.in)) {
            boolean keepGoing = true;
            while (keepGoing) {
                System.out.println("Enter a day to run (1-25). (q to quit)");
                input = inputScanner.nextLine();
                keepGoing = resolveDay(input);
            }
            inputScanner.close();
        } catch (Exception e) {
            throw e;
        }
    }

    protected static boolean resolveDay(String input) throws Exception {

        switch (input) {
            case "1":
                runDay(new DayOne());
                break;
            case "2":
                System.out.println("Day 2 has not yet been solved.");
                break;
            case "3":
                System.out.println("Day 3 has not yet been solved.");
                break;
            case "4":
                System.out.println("Day 4 has not yet been solved.");
                break;
            case "5":
                System.out.println("Day 5 has not yet been solved.");
                break;
            case "6":
                System.out.println("Day 6 has not yet been solved.");
                break;
            case "7":
                System.out.println("Day 7 has not yet been solved.");
                break;
            case "8":
                System.out.println("Day 8 has not yet been solved.");
                break;
            case "9":
                System.out.println("Day 9 has not yet been solved.");
                break;
            case "10":
                System.out.println("Day 10 has not yet been solved.");
                break;
            case "11":
                System.out.println("Day 11 has not yet been solved.");
                break;
            case "12":
                System.out.println("Day 12 has not yet been solved.");
                break;
            case "13":
                System.out.println("Day 13 has not yet been solved.");
                break;
            case "14":
                System.out.println("Day 14 has not yet been solved.");
                break;
            case "15":
                System.out.println("Day 15 has not yet been solved.");
                break;
            case "16":
                System.out.println("Day 16 has not yet been solved.");
                break;
            case "17":
                System.out.println("Day 17 has not yet been solved.");
                break;
            case "18":
                System.out.println("Day 18 has not yet been solved.");
                break;
            case "19":
                System.out.println("Day 19 has not yet been solved.");
                break;
            case "20":
                System.out.println("Day 20 has not yet been solved.");
                break;
            case "21":
                System.out.println("Day 21 has not yet been solved.");
                break;
            case "22":
                System.out.println("Day 22 has not yet been solved.");
                break;
            case "23":
                System.out.println("Day 23 has not yet been solved.");
                break;
            case "24":
                System.out.println("Day 24 has not yet been solved.");
                break;
            case "25":
                System.out.println("Day 25 has not yet been solved.");
                break;
            case "q":
                return false;
            default:
                System.out.println("Invalid input.");
                break;
        }
        
        return true;
    }
    
    protected static void runDay(AocDay dayToRun) throws Exception {
        dayToRun.run();

        Map<String, Object> results = dayToRun.getResults();

        System.out.println("PART ONE: %s".formatted(results.get(AocDay.PART_ONE_KEY)));
        System.out.println("PART TWO: %s".formatted(results.get(AocDay.PART_TWO_KEY)));
    }
}
