public class Main {
    public static void main(String[] args) {

    ArrayStack s = new ArrayStack();

        try {
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            //s.push(5);
            //s.push(6);
        } catch (StackOverflowException e) {
            System.err.println("Array Stack is full");
        }
        s.print();

        try {
            System.out.println("Last Element in Array is "+s.peek());
        } catch (StackUnderflowException e) {
            System.err.println("There is no element to Show in Array");
        }

        try {
            System.out.println("Remove Element from Array is "+s.pop());
            System.out.println("Remove Element from Array is "+s.pop());
        } catch (StackUnderflowException e) {
            System.err.println("There is no element to Remove in Array");
        }
        try {
            System.out.println("Last Element in Array is "+s.peek());
        } catch (StackUnderflowException e) {
            System.err.println("There is no element to Show in Array");
        }
        s.print();
        System.out.println(s.isEmpty());



        ListStack lStack = new ListStack();
        try {
            lStack.push(8);
            lStack.push(3);
        } catch (StackOverflowException e) {
            System.err.println("List Stack is full");
        }
        try {
            lStack.peek();
        } catch (StackUnderflowException e) {
            System.err.println("There is no element to Show in List");
        }
        try {
            lStack.pop();
        } catch (StackUnderflowException e) {
            System.err.println("There is no element to Remove in List");
        }
    }
}
