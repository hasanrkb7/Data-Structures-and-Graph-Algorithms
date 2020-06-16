
package class1;

import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please Enter Initial Number : ");
        int num1 = input.nextInt();
        
        System.out.println("Please Enter Final Number : ");
        int num2 = input.nextInt();
        
        int count = 0;
        for (int i = num1; i <= num2; i++){
            
            for (int j=2; j < i; j++){
            
                if (i % j==0 ){
                   count++;
                   break;
                   
                }
            }
            if (count==0){
                System.out.print(i +" , ");
                
            }
            count=0;
            
        }
               
    }
    
}
