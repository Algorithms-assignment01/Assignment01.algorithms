import java.util.Arrays;
import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        String str;
        while(true){
        System.out.print("Enter a sentence: ");
        str=scanner.nextLine();
        
        if (!str.isEmpty()) {
            break;
        } else {
            System.out.println("Input cannot be empty. Please try again.");
        }}
        String[] splits = str.split("\\s");
        for(int i=splits.length-1;i>=0;i--){
            System.out.print(splits[i]+" ");
        }
       
    }
}
