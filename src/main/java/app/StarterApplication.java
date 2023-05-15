package app;

import service.Task1Service;
import service.Task2Service;
import service.Task3Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StarterApplication {

    static public void start() {
        List<Integer> lListForTask1 = new ArrayList<>(Arrays.asList(1, 10, 20, 20, 2, 5));
        List<Integer> listForTask2 = new ArrayList<>(Arrays.asList(1, 2, 10, 7, 5, 3, 6, 6, 13, 0));
        String input = """
                6
                2 3
                3 4
                4 5
                6 7
                8 9
                9 10""";

        System.out.println("Task 1: ");
        Task1Service.giveAnswers(lListForTask1);
        System.out.println("\nTask 2: ");
        Task2Service.giveAnswers(listForTask2);
        System.out.println("\nTask 3:");
        Task3Service.giveAnswers(input);
    }
}
