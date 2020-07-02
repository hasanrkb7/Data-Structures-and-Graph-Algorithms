
package cse220lec01;

import java.util.Scanner;

public class ArrayDeclarationAndInitialization {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        //System.out.println("Enter Array Size:");
        //int size = scanner.nextInt();
        int [] array = {10, 20, 30, 40, 50, 60};
        print(array);
        /*System.out.println("Please Enter Some Number : ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            System.out.println(i+". " + array[i]);
            
        }*/
        
        
        }    
        
    public static void print(int [] x){
            for (int i : x) {
                System.out.println(i);

            }
    }
    
}
