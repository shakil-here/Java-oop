public class EmployeeTest {
    public static void main(String[] args) {
        Employee person1= new Employee();
        person1.setFirst_name("Md Shakil");
        person1.setLast_name("Hossain");
        person1.setSalary(1000);
        Employee person2= new Employee();
        person2.setSalary(90);
        person2.setFirst_name("Abdur");
        person2.setLast_name("Rahim");

        System.out.println(person1.getEmployeeinfo());
        System.out.println(person2.getEmployeeinfo());
        person1.increaseSalary();
        person2.increaseSalary();
        System.out.println("After adding 10%\n"+person1.getEmployeeinfo());
        System.out.println("After adding 10%\n"+person2.getEmployeeinfo());
    }
}
