public class HealthProfileinfo {
    private String first_name, lastname, gender;
    private int day, month, year;
    private float height;
    private float weight;

    public HealthProfileinfo(String first_name, String lastname, String gender, int day, int month, int year, float height, float weight) {
        this.first_name = first_name;
        this.lastname = lastname;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }


    public String dob() {
        return month + "/" + day + "/" + year;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge(){
       int currentday=21;
       int currentmonth=5;
       int currentyear=2023;
       int age=currentyear-getYear();
       if (month>currentmonth||(currentday<day&&month==currentmonth)){
           age--;
       }

        return age;
    }
    public int calculateMaximumHeartRate() {
        int age = getAge();
        return 220 - age;
    }

    public String calculateTargetHeartRateRange() {
        int maximumHeartRate = calculateMaximumHeartRate();
        int lowerBound = (int) (maximumHeartRate * 0.5);
        int upperBound = (int) (maximumHeartRate * 0.85);

        return lowerBound + " - " + upperBound;
    }

    public double getBMI(){
        double bmi=(weight*703)/(height*height);
        return bmi;
    }
    public String getBMItable(){
        double bmi=getBMI();
        if (bmi<18.5){
            return "BMI :"+bmi+"    STATUS : Underweight";
        } else if (bmi>=18.5&&bmi<24.9) {
            return "BMI :"+bmi+"    STATUS : Normal";

        }
        else if (bmi>=25&&bmi<29.9) {
            return "BMI :"+bmi+"    STATUS : Overweight";

        }
        else{
            return "BMI :"+bmi+"    STATUS : Obese";

        }
    }


    public String getinfo() {
        return "First name= " + first_name + "\n" + "Last name= " + lastname + "\n" +"Date of Birth= "+dob()+"\n"+"Age= "+getAge()+"\n"+"Gender= " + gender + "\n" + "Height= " + height +"\n" + "Weight= " + weight  +"\n" +getBMItable()+"\n"+"Maximum Heart Rate= "+calculateMaximumHeartRate()+"\n"+"Heart Rate Range= "+calculateTargetHeartRateRange()+"\n";

    }
}
