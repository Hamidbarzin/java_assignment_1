

public class chapter_317 {
    private String firstName;
    private int birthDay;

    // Constructor
    public chapter_317(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay,
            double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.birthDay = birthDay;
    }

    // Setters and Getters
    // اضافه کردن متدهای set و get برای هر ویژگی

    // Calculate age
    public int calculateAge() {
        return birthDay;
        // اضافه کردن کد برای محاسبه سن
    }

    // Calculate BMI
    public double calculateBMI() {
        return birthDay;
        // اضافه کردن کد برای محاسبه BMI
    }

    // Calculate maximum heart rate
    public int calculateMaximumHeartRate() {
        return birthDay;
        // اضافه کردن کد برای محاسبه حداکثر ضربان قلب
    }

    // Calculate target heart rate range
    public String calculateTargetHeartRateRange() {
        return firstName;
        // اضافه کردن کد برای محاسبه محدوده ضربان قلب هدف
    }

    public String getFirstName() {
        //
        throw new UnsupportedOperationException("Unimplemented method 'getFirstName'");
    }

    public String getGender() {
        //
        throw new UnsupportedOperationException("Unimplemented method 'getGender'");
    }

    public String getBirthYear() {
        //
        throw new UnsupportedOperationException("Unimplemented method 'getBirthYear'");
    }

    public String getHeightInInches() {
        //
        throw new UnsupportedOperationException("Unimplemented method 'getHeightInInches'");
    }

    public String getWeightInPounds() {
        //
        throw new UnsupportedOperationException("Unimplemented method 'getWeightInPounds'");
    }
}
