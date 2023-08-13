import java.util.Scanner;

public class Algo1{
    private  final static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        loop:do{

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int i;
        int c;
        int b=1;
        int a=0;

        scanner.nextLine();
         if(num<0)continue loop;
         else{
           
            String output="fib : ";
            if(num==0)System.out.println(0);
            if(num==1)System.out.println(1);
            for (i = 2; i <= num; i++) {
                c = a + b;
                a = b;
                b = c;
                output+=","+a+","+b;
                //
            }System.out.print("\b"+output);
         }
        }while(true);
    }
}