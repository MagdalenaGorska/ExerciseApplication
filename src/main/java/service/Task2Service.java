package service;

import java.util.List;

public class Task2Service {

    final static private Integer SUM_NUMBER = 13;

    public static void giveAnswers(final List<Integer> integerList) {
        integerList.stream()
                .sorted()
                .flatMap(i -> integerList.stream()
                        .sorted()
                        .filter(j -> i + j == SUM_NUMBER && j > i)
                        .map(j -> new Integer[]{i, j}))
                .forEach(pair -> System.out.println(pair[0] + ", " + pair[1]));
    }
}
