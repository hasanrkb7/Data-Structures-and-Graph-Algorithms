import java.util.Scanner;
public class BinarySearch {
    static boolean binarySearch(int [] a, int l, int r, int item){
        if (l <= r){
            int mid = (l + r) / 2;

            if (item == a[mid]) {
                return true;
            }
            if (item > a[mid]) {
                l = mid + 1;
                return binarySearch(a, l, r, item);
            } else {
                r = mid - 1;
                return binarySearch(a, l, r, item);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        System.out.println("Give some Number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int left = 0;
        int right = array.length-1;
        System.out.print("Give a Number you want to check: ");
        int num = sc.nextInt();
        boolean x = binarySearch(array, left, right, num);
        System.out.println(x);;
    }
}
