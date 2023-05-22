package service;

import model.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task3Service {

    final static private String REGEX = " ";


    static public void giveAnswers() {
        Scanner scanner = new Scanner(System.in);
        List<Node> nodes = new ArrayList<>();
        int counter = 0;
        System.out.println("Provide amount of nodes");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(" Provide coordinates in separate by space");
        IntStream.range(0, n).forEach(number -> {
            String input = scanner.nextLine();
            String[] providedNumbers = input.split(REGEX);
            nodes.add(new Node(Integer.valueOf(providedNumbers[0]), Integer.valueOf(providedNumbers[1]), false));
        });
        scanner.close();

        for (int i = 0; i < nodes.size(); i++) {
            Node currentNode = nodes.get(i);
            if (currentNode.isVisited()) {
                continue;
            }
            currentNode.setVisited(true);

            for (int j = 0; j < nodes.size(); j++) {
                if ((Objects.equals(currentNode.getDestination(), nodes.get(j).getSource()) || Objects.equals(currentNode.getSource(), nodes.get(j).getDestination())) && !nodes.get(j).isVisited()) {
                    currentNode = nodes.get(j);
                    currentNode.setVisited(true);
                    j = 0;

                } else if (j == nodes.size() - 1) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
