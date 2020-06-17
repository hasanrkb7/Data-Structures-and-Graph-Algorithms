
package array;

import java.util.Scanner;


public class SumAndAvg {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter Array Size : ");
        int size = input.nextInt();
        double [] arr = new double [size];
        double sum = 0, avg = 0;
        
        for (int i = 0; i < size; i++) {
            
            System.out.print("Please Enter a Number : ");
            arr [i] = input.nextDouble();
            
        }
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
            avg = sum / size;
        }
        
        System.out.println(sum);
        System.out.println(avg);
        
    }
    
}
