/*
CODETECH Internship Task 1 - CREATE A JAVA PROGRAM TO READ,
WRITE, AND MODIFY TEXT FILES.
*/

import java.io.BufferedReader;     // Used to write data into file
import java.io.FileReader;     // Used to read data from file
import java.io.FileWriter; // Used to read file line by line
import java.io.IOException;    // Used to handle input/output errors

public class FileHandlingDemo {

    // File name where data will be stored
    static String fileName = "internship_file_task1.txt";

    public static void main(String[] args) {

        // Writing data into the file
        writeFile();

        // Reading data from the file
        readFile();

        // Modifying the file (adding new content)
        modifyFile();

        // Reading file again after modification
        readFile();
    }

    /*
    Method Name : writeFile()
    Purpose     : Creates a file and writes data into it
    */
    public static void writeFile() {
        try {
            // FileWriter creates file if it does not exist
            FileWriter writer = new FileWriter(fileName);

            // Writing content into file
            writer.write("Java File Handling Program\n");
            writer.write("This file is created for internship task.\n");
            writer.write("Operations performed:\n");
            writer.write("1. Write\n2. Read\n3. Modify\n");

            // Closing the writer
            writer.close();

            System.out.println("File written successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }
    }

    /*
    Method Name : readFile()
    Purpose     : Reads and displays file content
    */
    public static void readFile() {
        try {
            // FileReader reads data from file
            FileReader reader = new FileReader(fileName);

            // BufferedReader helps read line by line
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("Reading file content:");

            // Loop runs until end of file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Closing reader
            br.close();
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }

    /*
    Method Name : modifyFile()
    Purpose     : Adds new data to existing file
    */
    public static void modifyFile() {
        try {
            // true means append mode (modify file)
            FileWriter writer = new FileWriter(fileName, true);

            writer.write("\nFile modified successfully.\n");
            writer.write("New content added to the file.\n");

            writer.close();

            System.out.println("File modified successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while modifying file.");
        }
    }
}
