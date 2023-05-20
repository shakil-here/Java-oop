public class Employee {

    private String first_name="";
    private String last_name="";
    private double salary=0;
    public Employee(){
       this.first_name=first_name;
       this.last_name=last_name;
       if (salary>=0) {
           this.salary = salary;
       }
    }
    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeinfo(){
        return first_name+" "+ last_name+"\n"+"Salary: "+salary;
    }

    public void increaseSalary(){
        salary+=((salary/100)*10);
    }

}