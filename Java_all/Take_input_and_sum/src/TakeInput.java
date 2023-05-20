import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        System.out.println("Enter Two Integer:");
       int a,b,sum;
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.printf("Sum of two integer is %d.",sum);
    }
}