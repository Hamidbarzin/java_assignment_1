import java.util.Scanner;

public class chapter_511 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int numberOfValues = scanner.nextInt();

        // اگر تعداد مقادیر منفی یا صفر باشد، پیغام خطایی نمایش داده شود
        if (numberOfValues <= 0) {
            System.out.println("Error: Number of values must be positive.");
            
        }

        System.out.print("Enter value 1: ");
        int min = scanner.nextInt(); // فرض کنید اولین مقدار وارد شده کوچکترین است

        // خواندن مقادیر بقیه اعداد و یافتن کوچکترین آنها
        for (int i = 2; i <= numberOfValues; i++) {
            System.out.print("Enter value " + i + ": ");
            int value = scanner.nextInt();
            if (value < min) {
                min = value;
            }
        }

        // نمایش کوچکترین عدد
        System.out.println("The minimum value is: " + min);

        scanner.close();
    }
}
