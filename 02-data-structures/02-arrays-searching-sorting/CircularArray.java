public class CircularArray {
    public static void main(String[] args) {
        int[] a = {40, 50, 0, 0, 0, 0, 0, 10, 20, 30};
        System.out.println("Traversal Print: ");
        printTraversal(a, 7, 5);

        int[] b = {40, 50, 0, 0, 0, 0, 0, 10, 20, 30};
        System.out.println("Reverse Print: ");
        reverse(b, 7, 5);

        int [] c = {10,20,30,40,50,0,0,0,0,0,0};
        int [] circular = cirArray(c, 8, 5);
        System.out.println("Linear Array to Circular Array: ");
        System.out.println("Linear Array :");
        print(c);
        System.out.println();
        System.out.println("Circular Array: ");
        print(circular);

        int [] d = {20, 30, 40, 50, 10};
        int [] resizeCircular = resize(d, 4, 5);
        System.out.println("Resize: ");
        print(resizeCircular);

    }



    public static void print(int [] x){
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println();
        System.out.println();
    }

    public static void printTraversal(int[] x, int start, int size) {
        for (int i = 0, j = start; i < size; i++, j = (j + 1) % x.length) {
            System.out.println(x[j]);
        }
        System.out.println();
    }

    public static void reverse(int[] x, int start, int size) {
        for (int i = 0, j = (start + size - 1) % x.length; i < size; i++) {
            System.out.println(x[j]);
            j--;
            if (j < 0) {
                j = x.length - 1;
            }
        }
    }

    public static int[] cirArray(int[] x, int start, int size) {
        int[] r = new int[x.length];
        for (int i = 0, j = start; i < size; i++, j = (j + 1) % r.length) {
            r[j] = x[i];
        }

        return r;
    }

    public static int [] resize (int [] x, int start, int size){
        int [] r = new int [x.length+2];
        for (int i = 0, j = start, k=start; i < size; i++, j = (j+1)%x.length, k = (k+1)%r.length) {
             r [k] = x [j];
        }
        return r;
    }

    //right shift and left shift
}

