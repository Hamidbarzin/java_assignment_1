import java.util.Scanner;

public class chapter_430 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square (1 to 20): ");
        int size = scanner.nextInt();

        // اگر اندازه ضلع کمتر از یک یا بیشتر از 20 باشد، پیغام خطایی نمایش داده شود
        if (size < 1 || size > 20) {
            System.out.println("Error: Size must be between 1 and 20.");
            return;
        }

        // نمایش مربع ستاره
        for (int i = 0; i < size; i++) {
            // در صورتی که در خطوط اول یا آخر هستیم، یک خط کامل از ستاره‌ها چاپ می‌شود
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("* ");
                }
            } else {
                // در غیر این صورت، یک ستاره و سپس فضای خالی و در آخر یک ستاره چاپ می‌شود
                System.out.print("* ");
                for (int j = 0; j < size - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            // تغییر خط
            System.out.println();
        }

        scanner.close();
    }
}
