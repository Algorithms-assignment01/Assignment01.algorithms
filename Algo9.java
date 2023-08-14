import java.util.Arrays;
import java.util.Scanner;

public class Algo9 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String[] splits;
        String str;
        while(true){
        System.out.print("Enter a single word: ");
        str =scanner.nextLine();
        splits = str.split("\\s");
        
        if(splits.length==1){
            break;
        }else{
            System.out.println("Input cannot be multiple words or sentence. Please try again.");
        }}
        
        char[] chars = splits[0].toCharArray();
        char[] temp=new char[chars.length];
        for(int i=0;i<chars.length;i++){
            temp[i]=chars[chars.length-1-i];

        }
        
        System.out.println(temp);
        if(Arrays.toString(temp)==str)System.out.println("Palindrome");
        else System.out.println("invalid");
        
    }
}
