package merge;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFront(5);
        list.insertFront(2);
        list.insertFront(1);
        list.insertFront(9);
        list.insertFront(8);
        list.insertFront(7);

        LL list2 = new LL();
        list2.insertFront(45);
        list2.insertFront(200);
        list2.insertFront(100);
        list2.insertFront(99);
        list2.insertFront(85);
        list2.insertFront(75);
        // merging
        list.merge(list2);
        list.display();
    }
}
