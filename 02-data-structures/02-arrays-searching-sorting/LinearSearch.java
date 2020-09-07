import java.util.Scanner;
public class LinearSearch {
    static boolean linearSearch(int [] a, int i, int k){
        if (i >= a.length){
            return false;
        }
        if (a[i] == k){
            return true;
        }
        else{
            i++;
            return linearSearch(a, i, k);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        System.out.println("Give some Number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        boolean x = linearSearch(array, 0, 3);
        System.out.println(x);
    }
}
