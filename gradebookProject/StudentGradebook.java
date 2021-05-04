import java.io.*;
import java.util.*;

public class StudentGradebook {
    public static void main(String[] args) throws IOException {
        String filename = "gradebookJava/gradebookProject/gradebook.txt"; // filename path

        Scanner user = new Scanner(System.in); // user input initializing
        File myFile = new File(filename); // initializing the file to open
        Scanner inputFile = new Scanner(myFile); // the file is input into the Scanner to be read

        if (!myFile.exists()) // checks to see if the file exists or not.
		{
			System.out.println("No file on record.");
			System.exit(1);
		}

        System.out.print("Enter your first name to check your grades: "); // asks to input the name of the student
        String name = user.nextLine();

        while (inputFile.hasNext()) { // goes through the file line by line as long as it has another line it will keep goin
            String line = inputFile.next(); // sets the line to the variable line
            String[] lineArr = line.split(","); // splits the line up into an String Array

            if (lineArr[0].equalsIgnoreCase(name)) { // if the first variable in the array after it is split from line contains the name it will print out otherwise keeps checking through
                System.out.print("The grades for " + name + " are: ");
                for (int i = 1; i < lineArr.length; i++) { // loops through the arr to print out the rest of the array
                    System.out.print(lineArr[i] + " ");
                }
                System.exit(1);
            } 
        
        }
        System.out.println("The name is not in the gradebook.");
        //closes the Scanners
        inputFile.close();
        user.close();
    }
}