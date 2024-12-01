package main.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.AocDay;

public class DayOne extends AocDay {


    List<Integer> listOne = new ArrayList<>();
    List<Integer> listTwo = new ArrayList<>();
    Map<Integer, Integer> occurrencesMap = new HashMap<>();
    int totalDifference = 0;
    int similarityScore = 0;

    static final String DEFAULT_FILE_NAME = "main/day1/input.txt";

    public DayOne() {
        super(DEFAULT_FILE_NAME);
    }

    public DayOne(String fileName) {
        super(fileName);
    }

    public static final String COORDINATE_DELIMITER = "   ";

    @Override
    protected void initializeInput() {
        listOne = new ArrayList<>();
        listTwo = new ArrayList<>();
        occurrencesMap = new HashMap<>();
        totalDifference = 0;
        similarityScore = 0;
    }

    @Override
    protected void perInput(String input) {
        String[] coordinates = input.split(COORDINATE_DELIMITER);

        listOne.add(Integer.parseInt(coordinates[0]));

        Integer listTwoCoordinate = Integer.parseInt(coordinates[1]);

        if (occurrencesMap.containsKey(listTwoCoordinate)) {
            occurrencesMap.put(listTwoCoordinate, occurrencesMap.get(listTwoCoordinate) + 1);
        } else {
            occurrencesMap.put(listTwoCoordinate, 1);
        }

        listTwo.add(listTwoCoordinate);
    }

    @Override
    protected void runLogic() {
        Collections.sort(listOne);
        Collections.sort(listTwo);

        for (int i = 0; i < listOne.size(); i++) {

            totalDifference += Math.abs(listOne.get(i) - listTwo.get(i));
            if (occurrencesMap.containsKey(listOne.get(i))) {
                similarityScore += listOne.get(i) * occurrencesMap.get(listOne.get(i));
            }
        }
    }

    @Override
    public Map<String, Object> getResults() {
        return Map.of(PART_ONE_KEY, totalDifference, PART_TWO_KEY, similarityScore);
    }
}
