
package class1;
import java.util.Scanner;
import java.lang.Math;

public class SeriesOfPower {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Please Enter the Power number : ");
        int p = input.nextInt();
        System.out.print("Please Enter the End number : ");
        int num = input.nextInt();
        
        double sum = 0.0;

        for (double i = 1; i <= num; i= i+1) {
            
            sum = Math.pow( i, p)+sum;
            
        }
        
        
        System.out.println(sum);
        
    }
    
}