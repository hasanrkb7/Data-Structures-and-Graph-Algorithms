public class task1{
    static int i = 0;
    static int count = -1;
    static int min;
    static int swapIndex;
    public static void sortRec(int []b){
        if(count == b.length){
            int temp = b[i];
            b[i] = min;
            b[swapIndex] = temp;
            i++;
        }
        if(count >= 0 && count < b.length){
            if(min >= b[count]){
                min = b[count];
                swapIndex = count;
            }
            count++;
            sortRec(b);
        }
        if(i < b.length){
            count = 0+i;
            min = b[i];
            sortRec(b);
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 2, 4, 1, 6, 7, 9, 10, 8};
        sortRec(a);
        for (int s : a) {
            System.out.println(s);
        }
    }
}
