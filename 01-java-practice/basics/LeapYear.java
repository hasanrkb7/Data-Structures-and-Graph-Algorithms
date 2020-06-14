
package class1;
import java.util.Scanner;

public class LeapYear {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int year;
        
        System.out.print("Enter a Year : ");
        year = input.nextInt();
        
        if (year%4==0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println ("Not a Leap Year");
        }
    }
    
}
