package FileHandling;

import java.io.File;

public class CreatingAFolder {
    public static void main(String[] args) {
        //to create file we need to access FILE CLASS

        File obj = new File("C:\\Users\\Sneha\\IdeaProjects\\Training\\Java_Training\\SnehaNS");

        //to create folder

        if (obj.mkdir()) {
            System.out.println("Folder Created : " + obj.getName()); //getName() gives name of folder created
        }
        else {
            System.out.println("The folder already exists");
        }
    }
}
