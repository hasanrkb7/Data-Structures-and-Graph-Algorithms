package class1;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        double f, c;
        
        System.out.print("Enter The Celsius : ");
        c = input.nextDouble();
        
        f = 1.8 * c +32;
        
        System.out.print("Fahrenheit is : "+f);
    
    }
    
}
