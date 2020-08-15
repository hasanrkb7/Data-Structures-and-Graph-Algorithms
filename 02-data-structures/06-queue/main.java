import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();

        try {
            q.enqueue(9);
            q.enqueue(8);
            q.enqueue(7);
            q.enqueue(6);
            q.enqueue(5);
            q.enqueue(4);
        } catch (StackOverflowException e) {
            System.out.println ("Queue is Full");
        }

        System.out.println("Array is ");
        q.printArray();

        System.out.println("Size of the Queue is: "+q.size());


        try {
            System.out.println("Removed Element is "+q.dequeue());
            System.out.println("Removed Element is "+q.dequeue());
        } catch (StackUnderflowException e) {
            System.out.println ("There is no Element in the Array queue to Remove");
        }

        System.out.println ("Array is :");
        q.printArray();

        try {
            System.out.println("First Element in the Queue is:  "+q.peek());
        } catch (StackUnderflowException e){
            System.out.println ("There is no Element in the queue to Display");
        }

        try {
            q.enqueue(4);
            q.enqueue(3);
        } catch (StackOverflowException e) {
            System.err.println("Queue is Full");
        }
        System.out.println("Array is: ");
        q.printArray();
    }
}
