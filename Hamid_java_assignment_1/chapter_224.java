import java.util.Scanner;

public class chapter_224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // خواندن پنج عدد صحیح
        System.out.println("Enter five integers:");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // پیدا کردن بزرگترین و کوچکترین عدد
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // چاپ بزرگترین و کوچکترین عدد
        System.out.println("Largest integer: " + largest);
        System.out.println("Smallest integer: " + smallest);

        scanner.close();
    }
}