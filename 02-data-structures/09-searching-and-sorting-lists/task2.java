public class task2 {
    static int var1 = 1;

    public static void revers(int i,int[]myArray2){
        if(myArray2[i-1] > myArray2[i]) {
            System.out.println("In reverse");
            int temp = myArray2[i];
            myArray2[i] = myArray2[i - 1];
            myArray2[i - 1] = temp;
            if ((i - 1) == 0) {
                return;
            }
            else{
                revers(i - 1, myArray2);
            }
        }
    }

    public static void recursiveInsertionSort(int[]myArray1){
        if(var1 < myArray1.length){
            revers(var1, myArray1);
            var1 += 1;
            recursiveInsertionSort(myArray1);
        }
    }

    public static void main(String[] args) {
        int[] myArray = {6, 4, 7, 8, 3};
        for (int i = 0; i < myArray.length; i++) {
            int count = 0;
            for (int z = i - 1; z >= 0; z--) {
                if (myArray[z] > myArray[i - count]) {
                    int temp = myArray[i - count];
                    myArray[i - count] = myArray[z];
                    myArray[z] = temp;
                    count += 1;
                } else {
                    break;
                }
            }
        }

        recursiveInsertionSort(myArray);
        System.out.println("Array is");
        for (int s : myArray){
            System.out.println(s);
        }
    }
}
