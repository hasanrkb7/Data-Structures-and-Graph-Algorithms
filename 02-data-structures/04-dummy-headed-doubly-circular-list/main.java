public class main {
    public static void main(String[] args) {
        Object [] z = {1,2,3,5,6};
        DummyDoublyCircular list = new DummyDoublyCircular (z);
        System.out.println("Array to List Create");
        list.print();

        System.out.println("Backward Print");
        list.backPrint();

        System.out.println("Insert in 1st Index");
        list.insert(0, 0);
        list.print();

        System.out.println("Insert in nth  Index");
        list.insert(4, 4);
        list.print();

        System.out.println("Insert in last Index");
        list.insert(7, 7);
        list.print();

        System.out.println("Insert in last Element");
        list.insertWithElement(8, 7);
        list.print();

        System.out.println("Delete 1st Index");
        list.delete(0);
        list.print();

        System.out.println("Delete nth Index");
        list.delete(3);
        list.print();

        System.out.println("Delete last Index");
        list.delete(6);
        list.print();

    }
}
