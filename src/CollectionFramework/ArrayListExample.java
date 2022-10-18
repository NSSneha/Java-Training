package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    /* old way of defining ArrayList (non generic)*/
    public void nonGenericArrayListExample() {
        ArrayList list = new ArrayList(); //create object, Array list is a collection of data
        list.add(1); //add method used here
        list.add("Sneha");
        list.add(3.14);
        System.out.println(list);
    }
    /* /** documentation string
     * proper way of declaring ArrayList
     * telling the type of the list and storing only particular type of data
     */
    public void genericArrayListExample() {
        ArrayList<String> list = new ArrayList<>(); //list is a ArrayList of string
        list.add("INDIA");
        list.add("USA");
        list.add("UK");
         //list.add //will throe compile time error as the list does not accept integers: says only string should be inputted
        System.out.println(list);
    }
    //how to iterate our list

    public void listIteratorExample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("INDIA");
        list.add("USA");
        list.add("UK");

        //how to traverse the list / iterate

        Iterator itr = list.iterator();//iterator method and keyword at being is used
        while (itr.hasNext()) {//hasNext() method is a boolean value, returns true if elements are there
            System.out.println(itr.next()); //if data is available please print next
        }
    }
    //for-each loop for an array list
    public void listForEachExample () {
        ArrayList<String> list = new ArrayList<>();
        list.add("INDIA");
        list.add("USA");
        list.add("UK");
        for (String country : list) { //country is user defined name
            System.out.println(country);
        }
    }

    public static void main(String[] args) {
        ArrayListExample obj = new ArrayListExample();
        obj.nonGenericArrayListExample();
        obj.genericArrayListExample();
        obj.listIteratorExample();
        obj.listForEachExample();
    }
}
