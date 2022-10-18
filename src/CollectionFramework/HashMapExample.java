package CollectionFramework;

import java.util.HashMap;

public class HashMapExample { //Key : value pair

    public static void main(String[] args) {
        HashMap<String, Integer> marksOfStudents = new HashMap<>();
        marksOfStudents.put("Sneha" , 85);//put method for adding data
        marksOfStudents.put("Taru" , 86);
        marksOfStudents.put("Swathi", 87);

      /*  System.out.println(marksOfStudents);

        //to access an item

        System.out.println(marksOfStudents.get("Sneha")); //key should be gvn to extract the value

        //to remove an item

        marksOfStudents.remove("Swathi");
        System.out.println(marksOfStudents);

        //to add
        marksOfStudents.put("Neha", 80);
        System.out.println(marksOfStudents);

        //to clear entire hash map
        marksOfStudents.clear();
        System.out.println(marksOfStudents); */

        //to iterate

        for (String i : marksOfStudents.keySet()){ //to iterate keys; string data type of key
            System.out.println(i);
        }
        //to iterate values
        for (int j : marksOfStudents.values()){
            System.out.println(j);
        }
    }
}
/*
* Hash map does not follow any order
* In case of arraylist and linkedlist they follow order
* */