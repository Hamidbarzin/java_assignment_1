

import java.util.Scanner;

public class chapter_test_317 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // درخواست اطلاعات فرد
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter your gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter your birth year:");
        int birthYear = scanner.nextInt();

        System.out.println("Enter your birth month:");
        int birthMonth = scanner.nextInt();

        System.out.println("Enter your birth day:");
        int birthDay = scanner.nextInt();

        System.out.println("Enter your height in inches:");
        double heightInInches = scanner.nextDouble();

        System.out.println("Enter your weight in pounds:");
        double weightInPounds = scanner.nextDouble();

        // ایجاد شی از کلاس HealthProfile
        chapter_317 healthProfile = new chapter_317(firstName, lastName, gender, birthYear, birthMonth, birthDay,
                heightInInches, weightInPounds);

        // چاپ اطلاعات فرد و محاسبات
        System.out.println("Name: " + healthProfile.getFirstName() + " " + healthProfile.getFirstName());
        System.out.println("Gender: " + healthProfile.getGender());
        System.out.println("Birth Date: " + healthProfile.getBirthYear() + "/" + healthProfile.getBirthYear() + "/"
                + healthProfile.getBirthYear());
        System.out.println("Age: " + healthProfile.calculateAge());
        System.out.println("Height: " + healthProfile.getHeightInInches() + " inches");
        System.out.println("Weight: " + healthProfile.getWeightInPounds() + " pounds");
        System.out.println("BMI: " + healthProfile.calculateBMI());
        System.out.println("Maximum Heart Rate: " + healthProfile.calculateMaximumHeartRate());
        System.out.println("Target Heart Rate Range: " + healthProfile.calculateTargetHeartRateRange());

        scanner.close();
    }
}