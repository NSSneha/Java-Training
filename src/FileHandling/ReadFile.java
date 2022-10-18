package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        File obj = new File("C:\\Users\\Sneha\\IdeaProjects\\Training\\Java_Training\\Demo.txt");
//try catch or throws any one can be used
        Scanner read = null;
        try {
            read = new Scanner(obj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (read.hasNextLine()) { //if file available pls read and gv to me
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close(); //always reading must be closed
        }
    }

