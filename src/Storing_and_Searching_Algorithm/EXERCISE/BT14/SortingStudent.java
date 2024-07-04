package src.Storing_and_Searching_Algorithm.EXERCISE.BT14;

public class SortingStudent {
    public static Student[] insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getScore() < key.getScore()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
        return students;
    }

    public static Student[] selectionSort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getScore() > students[maxIdx].getScore()) {
                    maxIdx = j;
                }
            }
            Student temp = students[maxIdx];
            students[maxIdx] = students[i];
            students[i] = temp;
        }
        return students;
    }

    public static Student[] bubbleSort(Student[] students) {
        int n = students.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (students[i - 1].getScore() < students[i].getScore()) {
                    Student temp = students[i - 1];
                    students[i - 1] = students[i];
                    students[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return students;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Alice", 85.5),
                new Student(2, "Bob", 90.0),
                new Student(3, "Charlie", 78.0),
                new Student(4, "David", 92.0),
                new Student(5, "Eve", 88.5)
        };

        System.out.println("Original List:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nSorted by Insertion Sort:");
        Student[] insertionSortedStudents = insertionSort(students.clone());
        for (Student student : insertionSortedStudents) {
            System.out.println(student);
        }

        System.out.println("\nSorted by Selection Sort:");
        Student[] selectionSortedStudents = selectionSort(students.clone());
        for (Student student : selectionSortedStudents) {
            System.out.println(student);
        }

        System.out.println("\nSorted by Bubble Sort:");
        Student[] bubbleSortedStudents = bubbleSort(students.clone());
        for (Student student : bubbleSortedStudents) {
            System.out.println(student);
        }
    }
}
