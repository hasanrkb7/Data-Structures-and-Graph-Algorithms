import java.util.Scanner;
public class InsertionSort {
    static int [] insertionSort(int [] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (a[j+1] < a[j]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
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
        int [] x = insertionSort(array);
        print(x);
    }
}
