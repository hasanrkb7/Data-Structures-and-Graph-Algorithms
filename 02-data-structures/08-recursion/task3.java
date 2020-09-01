public class task3 {
    public static void print(int[]array, int i) {
        if (i == array.length) {
            return;
        } else {
            System.out.println(array[i]);
            i = i + 1;
            print(array, i);
        }
    }

    public static void main(String[] args) {
        int[] array = {25000, 100000, 250000, 350000};
        print(array, 0);
    }
}
