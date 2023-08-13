import java.util.Arrays;
import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
      
         String input;

        while (true) {
            System.out.print("Enter a text: ");
            input = scanner.nextLine();

            if (!input.isEmpty()) {
                break;
            } else {
                System.out.println("Input cannot be empty. Please try again.");
            }
        }

        char[] chars = input.toUpperCase().toCharArray();

        
        
            for (int i = 0,j=chars.length-1; i < j; i++,j--) {
                   
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
           

} System.out.println(chars);
    
}}

    
