package Arrays;

public class OneDArray {
    public static void main(String[] args) {
        // Indexing starts from 0 to n-1
        String[] name = {"Sneha", "Swathi", "Saurav", "Taru"}; //[] represents arrays, must be gvn within {}
        int[] numbers = {1,2,3,4,5,6};
        char[] letters = {'a','s','d','f'};

        System.out.println(name[1]);
        //System.out.println(name[4]); //array index out of bound error as 3 is max index of name

        //to check length of an array

        System.out.println("array length is: " + name.length);
        System.out.println("array length is: " + numbers.length);

        //to print list of array we use for loop
        for (int i = 0; i < letters.length; i ++){ //do not take numbers in real time, take length
            System.out.print(letters[i] + " ");
        }

        //for each loop or also called enhanced for loop
        /*Syntax : for(datatype var_name : array_name){
                        //statements}
                        */

        for(int x : numbers){
            System.out.println(x + " ");
        }

        //another method to create an array using new keyword

        int values[] = new int[3]; //array of 3 size, but not an efficient manner
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        values[3] = 40; //not allowed as size is set as 3, we can not have more than 3 elements
    }
}
