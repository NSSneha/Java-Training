package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {
    public static void main(String[] args) throws IOException {
        //File object = new File("C:\\Users\\Sneha\\IdeaProjects\\Training\\Java_Training\\Demo.txt");

        //call file writer to write inside the file

        FileWriter write = new FileWriter("C:\\Users\\Sneha\\IdeaProjects\\Training\\Java_Training\\Demo.txt", true);// true must be gvn when we can not append too many data into file
        write.append("\nAutomation Testing \n");//with append we can write to a file
        write.append("Manual Testing");
        write.close();
        System.out.println("Written successfully to the file");
    }
}
