import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHanddelingExample {

    static void writing() {
        try {
            FileWriter writer = new FileWriter("File.txt", true);

            writer.write("From Inoue Orehime \n");
            writer.write("Bye Bye! Kurasaki kun. :)");
            writer.write(".........");

            writer.close();

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("Failed to Write");
        }
    }

    public static void main(String[] args) {

        try {
            File file = new File("File.txt");

            // Create file
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            writing();

            // Read file
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}