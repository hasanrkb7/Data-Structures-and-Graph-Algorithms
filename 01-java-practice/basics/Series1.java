package class1;
import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Please Enter the End number : ");
        double num = input.nextDouble();
        double sum = 0;

        for (double i = 1.5; i <= num; i= i+1) {
            
            sum = sum + i;
            
        }
        
        
        System.out.println(sum);
        
    }
    
}

