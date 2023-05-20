public class HeartRateTest {

    public static void main(String[] args) {
        HeartRates person = new HeartRates("Md Shakil", "Hossain", 12, 6, 2002);

        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Age: " + person.calculateAge() + " years");
        System.out.println("Maximum Heart Rate: " + person.calculateMaximumHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + person.calculateTargetHeartRateRange() + " bpm");
    }
}
