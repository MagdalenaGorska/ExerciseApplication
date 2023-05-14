package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2Service {

    final static private Integer DEFAULT_VALUE = 0;

    final static private Integer SUM_NUMBER = 13;

    final static private Integer INDEX = 1;

    public static void giveAnswers(final List<Integer> integerList) {
        Map<Integer, Integer> mapNumberFrequency = calculateNumberFrequency(integerList);
        findPair(mapNumberFrequency, integerList);
    }

    private static Map<Integer, Integer> calculateNumberFrequency(final List<Integer> integerList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : integerList) {
            Integer count = map.getOrDefault(number, DEFAULT_VALUE);
            map.put(number, count + INDEX);
        }
        return map;
    }

    private static void findPair(final Map<Integer, Integer> mapNumbers, final List<Integer> integerList) {
        for (Integer num : integerList) {
            Integer complement = SUM_NUMBER - num;
            if (mapNumbers.containsKey(complement) && mapNumbers.get(complement) > DEFAULT_VALUE) {
                if (num <= complement) {
                    System.out.println(num + " " + complement);
                } else {
                    System.out.println(complement + " " + num);
                }
                mapNumbers.put(num, mapNumbers.get(num) - INDEX);
                mapNumbers.put(complement, mapNumbers.get(complement) - INDEX);
            }
        }
    }
}
