public class task6 {
    public static void  binarySearch(int []a,int start,int end,int value){
        int mid=(start+end)/2;
        if(start >= end && a[mid] == value){
            System.out.println("the value is found in index "+start);
            return;
        }
        if(start >= end && a[mid] != value){
            System.out.println("The value is not found ");
            return;
        }

        if(a[mid] == value){
            System.out.println("The value is found in index "+mid);
            return;
        }
        if(a[mid] > value){
            binarySearch(a, start, mid-1, value);
        }else{
            binarySearch(a, mid+1, end, value);
        }
    }

    public static void main(String[] args) {
        int []myArray = {0,1,3,4,5,6,7,8,9,10};
        binarySearch(myArray,0,11,4);
    }
}
