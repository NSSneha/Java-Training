package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) {
//try catch block is mandatory when creating a file within a folder
        try {
            File obj = new File("C:\\Users\\Sneha\\IdeaProjects\\Training\\Java_Training\\Demo.txt");

            if (obj.createNewFile()) {
                System.out.println("File created successfully: " + obj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Something unexpected happened");
        }
    }
}
