package lLDelete;

public class LL {
    private Node head;
    private Node tail;
    int size;
    public LL(){
        this.size = 0;
    }
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
           this.value = value;
           this.next = next;
        }
    }
    // Inserting at front of list
    public void insertFront(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null){
            tail = head;
        }
        size++;
    }
    // insertion at the end of list
    public void insertEnd(int value){
        if (tail==head){
            this.insertFront(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
        size++;
    }
    // insertion at any index
    public void insert(int value, int index){
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size++;
    }
    // Deletion at front
    public int deleteFront(){
        if (head==null && tail==null){
            return -1;
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp.value;
    }
    // Deletion at end
    public int deleteEnd(){
        Node temp = head;
        for (int i = 1; i <size-1 ; i++) {
            temp = temp.next;
        }
        int val = tail.value;
        temp.next = null;
        tail = temp;
        return val;
    }
    // deletion at any position
    public int delete(int index){
        Node temp = head;
        for (int i = 1; i < index-1; i++) {
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        return val;
    }
    // printing the linked-list
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
