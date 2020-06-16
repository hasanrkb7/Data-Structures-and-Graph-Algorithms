
package class1;
import java.util.Scanner;

public class SeriesOfMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Please Enter the End number : ");
        double num = input.nextDouble();
        double multiple = 1;

        for (double i = 1.5; i <= num; i= i+1) {
            
            multiple = multiple * i;
            
        }
        
        
        System.out.println(multiple);
        
    }
    
}
