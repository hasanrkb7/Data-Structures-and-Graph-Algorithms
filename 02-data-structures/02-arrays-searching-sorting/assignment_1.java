public class assignment_1 {
    public static void main(String[] args) {
        System.out.println(powerN(3,3));
        System.out.println(hocBuilder(3));
        space(5, 1);
        row(5,5);
        int[]array={25000,100000,250000,350000};
        print(array,0);
    }


    //question 01
    static int powerN(int base, int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return base * powerN(base, n-1);
        }
    }


    //question 03
    public static int hocBuilder (int height){
        if(height == 0){
            return 0;
        }
        else if(height == 1){
            return 8;
        }
        else{
            return 5 + hocBuilder(height-1);
        }
    }


    //question 5(a)
    static void Number(int num, int i){
        //int i = 1;
        if (num == 0)
            return;
        else{
            System.out.print(i);
            i++;
            Number(num-1, i);
        }
    }
    static void space(int n, int i){
        if (n == 0)
            return;
        else{
            Number(i, 1);
            System.out.println();
            space(n - 1, i + 1);
        }
    }
    //question 5(b)
    static void space(int s){
        if (s == 0){
            return;
        }
        else{
            System.out.print(" ");
            space(s - 1);
        }
    }
    static void number(int num, int i){
        if (num == 0){
            return;
        }
        else{
            System.out.print(i);
            i++;
            number(num - 1, i);
        }
    }
    static void row(int num, int i){
        if (num == 0){
            return;
        } else{
            space(num - 1);
            number(i - num + 1, 1);
            System.out.println();
            row(num - 1, i);
        }
    }


    //question 06
    public static void print(int[]array,int idx){

        if(idx<array.length){
            double profit=calcProfit(array[idx]);
            System.out.println("Profit: " + profit);
            idx = idx+1;
            print(array, idx);
        }
    }
    public static double calcProfit(int investment){
        if(investment <= 25000){
            return 0;
        }
        else if(investment <= 100000){
            return 4.5 + calcProfit(investment - 100);
        }
        else{
            return 8.0 + calcProfit(investment - 100);
        }
    }
}
