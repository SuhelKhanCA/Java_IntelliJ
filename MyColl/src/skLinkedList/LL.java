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