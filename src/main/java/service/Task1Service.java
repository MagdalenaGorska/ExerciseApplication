package service;

import java.util.List;

public class Task1Service {

    public static void giveAnswers(final List<Integer> integerList) {
        sortList(integerList);
        System.out.println(sortList(integerList));
        System.out.println("count: " + count(integerList));
        System.out.println("distinct: " + distinct(integerList));
        System.out.println("min: " + findMaxValue(integerList));
        System.out.println("max: " + findMinValue(integerList));
    }

    private static List<Integer> sortList(final List<Integer> integerList) {
        return integerList.stream().distinct().sorted().toList();
    }

    private static Integer count(final List<Integer> integerList) {
        return integerList.size();
    }

    private static Integer distinct(final List<Integer> integerList) {
        return integerList.stream().distinct().toList().size();
    }

    private static Integer findMinValue(final List<Integer> integerList) {
        return integerList.stream().min(Integer::compareTo).orElseThrow();
    }

    private static Integer findMaxValue(final List<Integer> integerList) {
        return integerList.stream().max(Integer::compareTo).orElseThrow();
    }
}
