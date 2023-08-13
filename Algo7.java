import java.util.Scanner;

public class Algo7 {
     private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        int min =100;
        int max=0;
        String shortest=null;
        String longest=null;
        while(true){
        System.out.print("Enter a sentence: ");
        str=scanner.nextLine();
        
        if (!str.isEmpty()) {
            break;
        } else {
            System.out.println("Input cannot be empty. Please try again.");
        }}
        String[] splits = str.split("\\s");
        for(int i=0;i<splits.length;i++){
            
                if(splits[i].length()<min){
                    min=splits[i].length();
                    shortest=splits[i];

                 if(splits[i].length()>max){
                    max=splits[i].length();
                    longest=splits[i];
                
            }
            
        }}System.out.println("Shortest word is: "+shortest);
        System.out.println("Longest word is: "+longest);
    }}

