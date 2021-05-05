
import java.util.Scanner;
public class Teacher{

    public static void main(String[] args) {
        System.out.println("Enter the number of grades that are going to be calculated of that subject: "); //input 
        Scanner scanner = new Scanner(System.in);
        int cla = scanner.nextInt();
        double[] arr = new double[cla]; //Declaring array of elements
         
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	System.out.print("Enter in grade #" +(i+1)+" : "); //input of the grade
        	arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){ 
        	total = total + arr[i];
        }
        double average = total / arr.length; //finding the total average
        
        System.out.format("The average is: %.3f", average); //print from input
    }
}