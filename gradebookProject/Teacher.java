import java.util.Scanner;
import java.util.*;
public class Teacher
{
public Teacher() {
      Scanner n = new Scanner(System.in);
      String name; //variables
      double grade[]; //variables  
      int students; //variables 
      
    
      System.out.println("Enter student's name:"); // the name of the student in class
      name = n.nextLine();   
      
       
      System.out.println("Student's name is: " + name); //the printing of student's name 
      

      System.out.print("Enter the number of grades that are going to be calculated of that subject: "); //the number of grades the teacher user wants to grade of whichever subject 
      Scanner sc = new Scanner(System.in);
      students = sc.nextInt(); //scans through the input number of grades that will be calculated
      grade = new double[students]; //declaring array determined by the user input 

      System.out.println();
      

      for(int i = 0; i < students; i++){ //for loop array
          System.out.print("Enter in grade #" +(i+1)+" : "); // the grades that would be inputted by user
          grade[i] = sc.nextDouble(); //takes the input of the user 
          }
      double sum = 0; //calculate sum of array
      for(int i = 0; i < students; i++){
          sum = sum + grade[i]; //takes the sum and input to get the average
           }

        double average = sum/students; //calculate the total average

        System.out.println("The average is : "+ average);//printing the average of the student 

    }
}