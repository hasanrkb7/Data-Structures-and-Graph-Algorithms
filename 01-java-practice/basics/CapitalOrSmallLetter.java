
package class1;
import java.util.Scanner;

public class CapitalOrSmallLetter {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        char c;
        System.out.print("Enter a Character : ");
        c = input.next().charAt(0);
        
        if (c >= 97 && c <= 122){
            System.out.println ("Small Letter");
        }
        else 
            System.out.println ("Capital Letter");
    }
    
}
