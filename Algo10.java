import java.util.Scanner;

public class Algo10 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        String str;
        while(true){
            System.out.print("Enter a number: ");
            str =scanner.nextLine();
            
            
            if (!str.isEmpty()) {
                break;
            } else {
                System.out.println("Input cannot be empty. Please try again.");
            }}

            while(true){
            char[] chars = str.toCharArray();

            for(int i=0; i<chars.length;i++){

                if(Character.isDigit(chars[i]))System.out.println("Character is a digit ");break;
               

                
                    
                }if(chars.length==12 && str.startsWith("+94"))System.out.println("valid phone number");
                break;
                
            }}

            
        
    }

