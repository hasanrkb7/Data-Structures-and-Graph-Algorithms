
package class1;

import java.util.Scanner;

public class Binary_Octal_HexaDecimal_Decimal {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter a Number : ");
        String num = input.nextLine();
        
        //Binary,Octal,HexaDecimal to Decimal
        Integer decimal = Integer.parseInt(num, 2);
        System.out.println(decimal);
        
    }
    
}
