package src.Storing_and_Searching_Algorithm.EXERCISE.BT13;

import java.util.Random;

public class IncreaseArray {

    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        return array;
    }

    // Selection Sort
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Hàm in mảng
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray(20, 1, 100);

        System.out.println("Mảng ban đầu:");
        printArray(array);

        // Selection Sort
        int[] selectionSortedArray = array.clone();
        selectionSort(selectionSortedArray);
        System.out.println("Mảng sau khi sắp xếp chọn:");
        printArray(selectionSortedArray);

        // Insertion Sort
        int[] insertionSortedArray = array.clone();
        insertionSort(insertionSortedArray);
        System.out.println("Mảng sau khi sắp xếp chèn:");
        printArray(insertionSortedArray);

        // Bubble Sort
        int[] bubbleSortedArray = array.clone();
        bubbleSort(bubbleSortedArray);
        System.out.println("Mảng sau khi sắp xếp nổi bọt:");
        printArray(bubbleSortedArray);
    }
}
