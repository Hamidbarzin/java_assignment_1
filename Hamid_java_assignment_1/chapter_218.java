//2.18 (Displaying Shapes with Asterisks) 
import java.util.Scanner;

public class chapter_218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of the shape you want to draw:");
        System.out.println("1. Box");
        System.out.println("2. Ellipse");
        System.out.println("3. Arrow");
        System.out.println("4. Diamond");
        
        int choice = scanner.nextInt();
        drawShape(choice);
        
        scanner.close();
    }

    public static void drawShape(int choice) {
        switch (choice) {
            case 1:
                drawBox();
                break;
            case 2:
                drawEllipse();
                break;
            case 3:
                drawArrow();
                break;
            case 4:
                drawDiamond();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void drawBox() {
        String[] box = {
            "*****",
            "*   *",
            "*   *",
            "*****"
        };

        System.out.println("Box:");
        for (String line : box) {
            System.out.println(line);
        }
    }

    public static void drawEllipse() {
        String[] ellipse = {
            " *** ",
            "*   *",
            "*   *",
            " *** "
        };

        System.out.println("Ellipse:");
        for (String line : ellipse) {
            System.out.println(line);
        }
    }

    public static void drawArrow() {
        String[] arrow = {
            "  *  ",
            " *** ",
            "*****",
            "  *  "
        };

        System.out.println("Arrow:");
        for (String line : arrow) {
            System.out.println(line);
        }
    }

    public static void drawDiamond() {
        String[] diamond = {
            "  *  ",
            " * * ",
            "*   *",
            " * * ",
            "  *  "
        };

        System.out.println("Diamond:");
        for (String line : diamond) {
            System.out.println(line);
        }
    }
}
