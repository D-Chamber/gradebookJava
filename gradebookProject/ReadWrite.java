import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import jdk.tools.jimage.resources.jimage;

public class ReadWrite {

    private String studentName = " ";
    private String[][] gradebookList;
    private File inFile = new File("gradebook.txt");

    public ReadWrite (String studentName) throws FileNotFoundException {
        this.studentName = studentName;

        gradebookList = read(studentName);
        System.out.println(gradebookList);
    }

    public String[][] read (String studentName) throws FileNotFoundException {
        Scanner reader1 = new Scanner(inFile);

        int ctr = 0;
        while(reader1.hasNext()) {
            ctr++;
            reader1.next();
        }
        reader1.close();

        Scanner reader2 = new Scanner(inFile);
        for (int i = 0; i < ctr; i++) {
            String[] line = reader2.nextLine().split(",");
            for (int j = 0; j < line.length; j++) {
                gradebookList[i][j] = line[j];
            }

        }
        System.out.println(Arrays.deepToString(gradebookList));
        return gradebookList;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ReadWrite rw = new ReadWrite("Jon Jones");
        rw.read("Jon Jones");
    }
}
