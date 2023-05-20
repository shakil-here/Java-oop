import java.util.Scanner;





public class WordCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println("Total Word in this Sentence: "+Wordcount(sentence));



    }
    public static int Wordcount(String sen){
        String [] Arr= sen.split(" ");
        return Arr.length;
    }
}
