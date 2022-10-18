package CollectionFramework;

import java.util.*;

public class ListExample {
    //declare obj of a list

    public void declarationExample() {
        List<String> list1 = new ArrayList<>(); //creating a list of type Arraylist
        list1.add("INDIA");
        list1.add("USA");
        list1.add("UK");
        System.out.println("Printing List1..........");
        new ListExample().readListData(list1); //to read list 1

        List<String> list2 = new LinkedList<>(); //creating a list of type Linked list
        list2.add("INDIA");
        list2.add("USA");
        list2.add("UK");
        list2.add("Australia");
        System.out.println("Printing List2..........");
        new ListExample().readListData(list2); //to read list 2;
        //the above method is the best method to follow to read a list

        if (list1.equals(list2)) { //equals method to check if 2 list objs are equal or not
            System.out.println("List are equal");
        }
        else {
            System.out.println("Lists are not equal");
        }

        //can add any data to these above lists at a particular index
        list1.add(2, "NY");
        System.out.println("List1 after adding new data " + list1);

        ArrayList<String> abc = new ArrayList<>();
        abc.add("India");
        abc.add("USA");
        abc.add("UK");
        abc.add("Australia");

         readListData(abc); //not a proper way of calling for reading

        if (abc.equals(list2)) {
            System.out.println("List are equal");
        }
        else {
            System.out.println("Lists are not equal");
        }
        //sort method to sort in ascending/descending/alphabetical order

        Collections.sort(list1);
            System.out.println("List1 details " + list1);
    }

    public void readListData(List<String> list) { //it is reading collections, collection is list, datatype and user defined name, here gvn "list"
        System.out.println(list);
    }

    public static void main(String[] args) {
        ListExample liex = new ListExample();
        liex.declarationExample();
    }
}
