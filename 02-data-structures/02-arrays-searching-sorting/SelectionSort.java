import java.util.Scanner;
public class SelectionSort {
    static int [] selectionSort(int [] a){
        for (int i = 0; i < a.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[minIdx]){
                    minIdx = j;
                }
            }
            if (a[i] != a[minIdx]) {
                int temp = a[minIdx];
                a[minIdx] = a[i];
                a[i] = temp;
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
        int [] x = selectionSort(array);
        print(x);
    }
}
