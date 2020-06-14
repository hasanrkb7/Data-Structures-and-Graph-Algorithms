
package class1;

import java.util.Scanner;

public class FahrenheitToCelsius {
    
    public static void main (String[] args){
        
        
        Scanner input = new Scanner(System.in);
        
        double f,c;
        
        System.out.print("Enter the Farenheit : ");
        f = input.nextDouble();
        
        c= (5/9.0) *(f-32);
        
        System.out.println(c);
    
    
    
    }
    
    
    
    
}
