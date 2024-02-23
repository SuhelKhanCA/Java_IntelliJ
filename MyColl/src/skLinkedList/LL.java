package skLinkedList;
public class LL {
    private Node head;
    private Node tail;
    int size;
    public LL() {
        this.size = 0;
    }
    private class Node{
        private  int value;
        private  Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    // Insertion at first place
    public  void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null){
            tail = head;
        }
        size++;
    }
    // Inserting at the End
    public  void insertEnd(int value){
        if (tail==head){
            this.insertFirst(value);
            size++;
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;

        size++;
    }
    // Inserting a Node at any position
    public void insertAny(int val, int index){
//        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }
    // Printing the linked-list
    void display(){
        Node temp = this.head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}