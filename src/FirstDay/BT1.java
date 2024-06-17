package src.FirstDay;
import java.util.Scanner;
public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Instantiate Scanner
        System.out.println("Enter your name: "); 
        String name = scanner.nextLine();          // Read user input
        System.out.println("Hello: " + name);      // Print greeting
    }

}
