/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Rakibul Hasan Remon
 */
public class MaxAndMin {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter Array Size : ");
        int size = input.nextInt();
        double [] arr = new double [size];
        System.out.print("Please Enter a Number : ");
        double num = input.nextDouble();
        
        double max = num;
        double min =  num;
        
        for (int i = 1; i < size; i++) {
            
            System.out.print("Please Enter a Number : ");
            arr [i] = input.nextDouble();
            
        }
        for (int i = 1; i < size; i++) {
            if (arr [i] < min){
                min = arr [i];
            }
            else if (arr [i] > max){
                max = arr [i];
            }
        }
        
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
        
    }
    
}
