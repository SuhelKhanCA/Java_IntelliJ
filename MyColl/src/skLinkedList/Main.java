package skLinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(7);
        list.display();
        System.out.println("Size is :" + list.size);
        list.insertEnd(500);
        list.insertEnd(45);
        list.display();
        System.out.println("Size is :" + list.size);

        list.insertAny(41, 3);
        list.display();
        System.out.println("Size is: " +list.size);
    }
}
