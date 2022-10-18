package Arrays;

public class MultiDArray { //also called Array  of arrays

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3,  4}, //1 to 4 is 1 element
                            {5, 6, 7, 8}, // 5 to 6 is 2nd element
             /*9 to 6 is 3rd element */ {9, 8, 7, 6}}; //3 rows and 4 cols

        System.out.println(numbers[0][1]); //0th row, 1th element

        //to print all elements we use for loop

        for(int i = 0; i < 3; i ++){ //for rows i < 3 cos there are 3 elements(3 smaller sub arrays)
            for (int j = 0; j < 4; j++){ //for cols
                System.out.print(" " + numbers[i][j]);
            }
            System.out.println(); //to print as box form of an array
        }
        //called as Jagged Array as it does not have equal no.of rows and cols
        int [][] myNumbers = {{1, 2, 3, 4},
                              {5, 6, 7},
                              {9, 8, 7, 6, 5, 4}};
        //efficient manner to write in for loop, kindly follow the below method
        for (int i = 0; i < myNumbers.length; i++){ // rows
            for(int j = 0; j < myNumbers[i].length; j++){ //cols; myNumbers[i] is given to take the length of each sub arrays irrespective of the size
                System.out.print(" " + myNumbers[i][j]);
            }
            System.out.println();
        }
    }
}
