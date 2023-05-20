import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        int count=0;
        Scanner sc= new Scanner(System.in);
        for (int i=0;;i++){
            if (i%2==0&&count<10){
                count++;
                System.out.println(i);
            }
            if (count==10){
                break;
            }
        }
    }
}
