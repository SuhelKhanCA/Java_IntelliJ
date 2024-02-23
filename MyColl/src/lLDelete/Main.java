package lLDelete;
public class Main {
    public static void main(String[] args) {
   LL list = new LL();
        list.insertFront(5);
        list.insertFront(2);
        list.insertFront(1);
        list.insertFront(9);
        list.insertFront(8);
        list.insertFront(7);
        list.display();
        System.out.println("Size is :" + list.size);
        list.insertEnd(500);
        list.insertEnd(45);
        list.display();
        System.out.println("Size is :" + list.size);
        list.insert(41, 3);
        list.display();
        System.out.println("Size is: " +list.size);
         System.out.println("Deleted node is:" + (list.deleteFront()));
         list.display();
         System.out.println("Size is: " +list.size);
        System.out.println("Deleted node is: " +list.deleteEnd());
         list.display();
        System.out.println("Deleted node is : " + list.delete(4));
        list.display();
    }
}
