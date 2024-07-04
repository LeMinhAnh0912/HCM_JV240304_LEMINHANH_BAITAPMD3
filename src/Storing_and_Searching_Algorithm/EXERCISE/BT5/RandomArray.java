package src.Storing_and_Searching_Algorithm.EXERCISE.BT5;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        // Step 1: Create an array with 20 random natural numbers sorted
        int[] randomArray = new int[20];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100) + 1; // Generates a random number between 1 and 100
        }
        Arrays.sort(randomArray);

        // Print the sorted array
        System.out.println("Sorted random array: " + Arrays.toString(randomArray));

        // Step 2: Get min and max values from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();

        // Step 3: Find the positions of the closest greater than min and less than max using binary search
        int minIndex = findMinIndex(randomArray, min);
        int maxIndex = findMaxIndex(randomArray, max);

        // Step 4: Print the count and details of the numbers found
        if (minIndex != -1 && maxIndex != -1 && minIndex <= maxIndex) {
            int count = maxIndex - minIndex + 1;
            System.out.println("Number of elements found: " + count);
            System.out.print("Elements: ");
            for (int i = minIndex; i <= maxIndex; i++) {
                System.out.print(randomArray[i] + " ");
            }
        } else {
            System.out.println("No elements found in the specified range.");
        }
    }

    private static int findMinIndex(int[] array, int min) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] > min) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private static int findMaxIndex(int[] array, int max) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] < max) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    
}
