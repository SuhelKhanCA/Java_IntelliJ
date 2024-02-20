package JCF;

import java.util.Iterator;
import java.util.LinkedList;

public class CreatingLinkedList {
    public static void main(String[] args) {
        // creating an empty linked-list of class LinkedList
        LinkedList<String> l1 = new LinkedList<String>();
        // adding elements in it
        l1.add("Mumbai");
        l1.add("Chennai");
        l1.add("Kolkata");
        l1.add("Delhi");
        l1.add("Banglore");
        l1.add("Guahti");
        l1.add("Hydrabad");
        System.out.println("Linked List-(Simple printing)========= : " + l1); // simple printing
        // printing the list using an iterator
        System.out.println("==========Printing via 'itr' object==========");
        Iterator<String> itr = l1.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }
        System.out.println();
        // Enhaced for loop
        System.out.println("========Printing using enhanced for loop=======");
        for (String s : l1) {
            System.out.print(s + ", ");
        }
    }
}
