
package cse220lec01;

public class ResizeAnArray {
    
    public static void main(String[] args) {
        int [] a = {10, 20, 30, 40, 50, 60, 70};
        print(a);
        
        
        int [] z = {10, 20, 30, 40, 50, 60, 70, 0, 0, 0};
        
        
        int [] cA = copyArray (a);
        System.out.println("Copied Array: ");
        print(cA);
        
        System.out.println("Forward Print: ");
        printForward(a);
        
        System.out.println("Backward Print: ");
        printBackward(a);
        
        int [] rev = reverse(a);
        System.out.println("Reverse Out Space: ");
        print(rev);
        
        System.out.println("Reverse In Space: ");
        reverseInSpace(a);
        
        System.out.println("Right Shift by 1 Space: ");
        rightShift(a);
        
        System.out.println("Left Shift by 1 Space");
        leftShift(a);
        
        System.out.println("Right Rotate by 1 Space: ");
        rightRotate (a);
        
        System.out.println("Left Rotate by 1 Space: ");
        leftRotate (a);
        
        System.out.println("Right Shift by K Space: ");
        //rightShiftKSpace (a,3);
        
        System.out.println("Left Shift by K Space: ");
        leftShiftKSpace (a,3);
        
        System.out.println("Right Rotate by K space: ");
        rightRotateKSpace(a,3);
        
        System.out.println("Left Rotate by K space: ");
        leftRotateKSpace(a,3);
        
        System.out.println("Insertion: ");
        boolean result = insertion(z, 6, 2, 200);
        if (result == true){
            System.out.println("True");
            print(z);
        }
        else{
            System.out.println("False");
        }
        
 
    }
    
    //Copy Method
    public static  int [] copyArray (int [] x){
        int[] c = new int [x.length];
        for (int i = 0; i < x.length; i++) {
            c [i] = x [i];
        }
        return c;
        
    }
    
    //Printing Method
    public static void print(int [] x){
        for (int i = 0; i < x.length; i++) {

                System.out.println(x[i]);
            }
        System.out.println();
        System.out.println();
    
    }
    
    //Print Forward
    public static void printForward(int [] x){
        for (int i = 0; i < x.length; i++) {

                System.out.println(x[i]);
            }
        System.out.println();
        System.out.println();
        
    }
    
    //Print Backward
    public static void printBackward(int [] x){
        for (int i = x.length-1; i >= 0; i--) {
                System.out.println(x[i]);
            }
        System.out.println();
        System.out.println();  
    }
    
    
    //Out-Space reverse
    public static int [] reverse(int [] x){
        int [] r = new int [x.length];
        for (int i = 0, j = x.length-1; i < x.length; i++, j--) {
                r [i] = x[j];
            }  
        return r;
    }

    //In-Space reverse
    public static void reverseInSpace(int [] x){
        for (int i = 0, j = x.length-1; i < j; i++, j--) {
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            //System.out.print(x[i]+", ");
        }
        print(x);
    }
    
    //Right Shift 1 Space
    public static void rightShift (int [] x){
        int [] r = copyArray(x);
        for (int i = r.length-1; i > 0; i--) {
            r[i] = r[i-1];
        }
        r[0] = 0;
        print(r);
    }
    
    //Left Shift 1 Space
    public static void leftShift (int [] x){
        int [] r = copyArray(x);
        for (int i = 0; i < r.length-1; i++) {
            r[i] = r[i+1];
        }
        r[r.length-1] = 0;
        print(r);
    }
    
    //Right Rotate 1 Space
    public static void rightRotate (int [] x){
        int [] r = copyArray(x);
        int temp = r[r.length-1];
        for (int i = r.length-1; i > 0; i--) {
            r[i] = r[i-1];
        }
        r[0] = temp;
        print(r);
    }
    
    //Left Rotate 1 Space
    public static void leftRotate (int [] x){
        int [] r = copyArray(x);
        int temp = r[0];
        for (int i = 0; i < r.length-1; i++) {
            r[i] = r[i+1];
        }
        r[r.length-1] = temp;
        print(r);
    }
    
    /*
    //Right Shift k Space
    public static void rightShiftKSpace (int [] x, int k){
        int [] r = copyArray(x);
        for (int i = r.length-1; i >= r; i--) {
            r[i] = r[i-k];
        }
        for (int i = 0; i < k ; i++) {
            r[i] = 0;
        }
        print(r);
    }
    */
    
    //Left Shift k Space
    public static void leftShiftKSpace (int [] x, int k){
        int [] r = copyArray(x);
        for (int i = 0; i < r.length-k; i++) {
            r[i] = r[i+k];
        }
        for (int i = r.length-1; i > k; i--) {
            r[i] = 0;
        }
        print(r);
    }
    
    //Right Rotate k Space
    public static void rightRotateKSpace (int [] x, int k){
        int [] r = copyArray(x);
        int [] temp = new int [k];
        for (int i = r.length-k, j = 0; i < r.length; i++, j++) {
            temp [j] = r [i];
        }
        
        for (int i = r.length-1; i >= k; i--) {
            r [i] = r[i-k];
        }
        for (int i = 0; i < k; i++) {
            r [i] = temp [i];
        }
        print(r);
    }
    
    //Left Rotate k Space
    public static void leftRotateKSpace (int [] x, int k){
        int [] r = copyArray(x);
        int [] temp = new int [k];
        for (int i = 0; i < k; i++) {
            temp [i] = r [i];
        }
        
        for (int i = 0; i < r.length-k; i++) {
            r[i] = r[i+k];
        }
        for (int i = r.length-k, j = 0; i < r.length; i++, j++) {
            r [i] = temp [j];
        }
        print(r);
    }
    
    
    public static boolean insertion(int [] x, int size, int index, int value){
        int [] r = copyArray(x);
        if (size < r.length && index >= 0 && index <= size-1){
            for (int i = size; i> index; i--) {
                r[i] = r[i-1];
            }
            r[index] = value;
            return true;
        }
        else {
            return false;
        }
    }
    
}
