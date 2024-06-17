package src.Day2;

public class BT7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count < 20; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                count++;
            }
        }
    }
}
