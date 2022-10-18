package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public void simpleLinkedListExample() {
        LinkedList<String> list = new LinkedList<>();
        list.add("INDIA");
        list.add("USA");
        list.add("UK");

        //traversing list through iterator
        Iterator itr = itr = list.iterator(); //getting the iterator
        while (itr.hasNext()) { //check if the iterator has elements
            System.out.println(itr.next()); // print the element & move to next element
        }
    }

    public static void main(String[] args) {
        LinkedListExample linkedObj = new LinkedListExample();
        linkedObj.simpleLinkedListExample();
    }
}
