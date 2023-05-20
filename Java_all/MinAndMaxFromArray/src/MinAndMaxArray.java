import java.util.Scanner;

public class MinAndMaxArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int [11];
        for (int i=0;i<11;i++){
            arr[i]=sc.nextInt();
        }
        
        int min=arr[0];
        for (int i=0;i<11;i++){
            if (arr[i]<=min){
                min=arr[i];
            }
        }
        int max=0;
        for (int i=0;i<11;i++){
            if (arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.print("The array is:");
        for (int i=0;i<11;i++){
            System.out.print(arr[i]);
            if (i<11-1){
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("Minimum value:"+min);
        System.out.println("Maximum value:"+max);
    }
}
