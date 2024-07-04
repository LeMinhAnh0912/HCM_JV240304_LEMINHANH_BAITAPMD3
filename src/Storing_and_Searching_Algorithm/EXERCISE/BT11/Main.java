package src.Storing_and_Searching_Algorithm.EXERCISE.BT11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam(1, "Team A", 11, 50));
        teams.add(new FootballTeam(2, "Team B", 11, 70));
        teams.add(new FootballTeam(3, "Team C", 11, 60));
        teams.add(new FootballTeam(4, "Team D", 11, 80));
        teams.add(new FootballTeam(5, "Team E", 11, 90));

        System.out.println("Original list:");
        printTeams(teams);

        System.out.println("\nBubble Sort:");
        List<FootballTeam> bubbleSortedTeams = new ArrayList<>(teams);
        Sorting.bubbleSort(bubbleSortedTeams);
        printTeams(bubbleSortedTeams);

        System.out.println("\nSelection Sort:");
        List<FootballTeam> selectionSortedTeams = new ArrayList<>(teams);
        Sorting.selectionSort(selectionSortedTeams);
        printTeams(selectionSortedTeams);

        System.out.println("\nInsertion Sort:");
        List<FootballTeam> insertionSortedTeams = new ArrayList<>(teams);
        Sorting.insertionSort(insertionSortedTeams);
        printTeams(insertionSortedTeams);
    }

    private static void printTeams(List<FootballTeam> teams) {
        for (FootballTeam team : teams) {
            System.out.println(team);
        }
    }
}

