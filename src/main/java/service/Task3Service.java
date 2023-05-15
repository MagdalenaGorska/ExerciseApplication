package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3Service {

    final static private String REGEX = " ";

    private static Integer numberSeparatedGraphs = 1;


    static public void giveAnswers(final String input) {

        List<Integer> columnValues = prepareAndSplitInput(input);
        countSeparatedGraphs(columnValues);
        System.out.println(numberSeparatedGraphs);
    }

    static private List<Integer> prepareAndSplitInput(final String input) {
        Scanner scanner = new Scanner(input);
        List<Integer> columnValues = new ArrayList<>();

        scanner.nextInt();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                String[] values = line.split(REGEX);
                int firstValue = Integer.parseInt(values[0]);
                columnValues.add(firstValue);
            }
        }
        return columnValues;
    }

    static private void countSeparatedGraphs(final List<Integer> columnValues) {
        for (int i = 1; i < columnValues.size(); i++) {
            int currentNumber = columnValues.get(i - 1);
            int nextNumber = columnValues.get(i);

            if (currentNumber + 1 != nextNumber) {
                numberSeparatedGraphs++;
            }
        }
    }

}
