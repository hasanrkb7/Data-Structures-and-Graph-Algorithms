import java.util.*;
public class BubbleSort {
    static int [] bubbleSort(int [] a){
        for (int i = a.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        }
        return a;
    }

    static void print(int [] b){
        System.out.println();
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        System.out.println("Give some Number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int [] x = bubbleSort(array);
        print(x);
    }
}
