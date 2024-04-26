import java.util.Scanner;

public class chapter_235 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total miles driven per day:");
        double milesDrivenPerDay = scanner.nextDouble();

        System.out.println("Enter cost per gallon of gasoline:");
        double costPerGallon = scanner.nextDouble();

        System.out.println("Enter average miles per gallon:");
        double averageMilesPerGallon = scanner.nextDouble();

        System.out.println("Enter daily parking cost:");
        double parkingCostPerDay = scanner.nextDouble();

        System.out.println("Enter tolls per day:");
        double tollsPerDay = scanner.nextDouble();

        // محاسبه هزینه بنزین
        double gasolineCost = (milesDrivenPerDay / averageMilesPerGallon) * costPerGallon;

        // محاسبه هزینه رانندگی کل
        double totalDrivingCost = gasolineCost + parkingCostPerDay + tollsPerDay;

        System.out.println("Your daily driving cost to work is: $" + totalDrivingCost);

        scanner.close();
    }
}