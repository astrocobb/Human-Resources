/**
 * Trevor Herrera
 * Java 2 (R01)
 * 02/23/2026
 * Assignment: Human Resources
 * Purpose:
 */

/*
 * This code is provided to give you a
 * starting place. It should be modified.
 * No further imports are needed.
 * To earn full credit, you must also
 * answer the following questions:
 *
 * Q1: Car and Engine are related
 * by which, Inheritance or Composition?
 *     Composition
 *
 * Q2: Color and Red are related
 * by which, Inheritance or Composition?
 *     Inheritance
 *
 * Q3: Shirt and Clothing are related
 * by which, Inheritance or Composition?
 *     Inheritance
 *
 * Q4: Furniture and Desk are related
 * by which, Inheritance or Composition?
 *     Inheritance
 *
 * Q5: CellPhone and Battery are related
 * by which, Inheritance or Composition?
 *     Composition
 *
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println();

        Person me = new Person("Trevor", 179, 73);

        Path path = Paths.get(args[0]);
        Scanner fileReader = null;

        try {
            fileReader = new Scanner(path);
        } catch (IOException e) {
            System.err.println("IO Exception error message: " + e.getMessage());
            System.exit(1);
        }

        String name = "";
        double height = 0;
        double weight = 0;

        try {

            fileReader.nextLine();

            while (fileReader.hasNextLine()) {

                name = fileReader.next();
                height = fileReader.nextDouble();
                weight = fileReader.nextDouble();

                Person person = new Person(name, height, weight);
                System.out.println(person.toString());
            }

        } catch (java.util.InputMismatchException e) {
            System.err.println("InputMismatchException error message: " + e.getMessage());
            e.printStackTrace();
            System.out.println("\n"+e+"\n");
        }

        fileReader.close();

        try {
            FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
            fileWriterOrder.write("testing");
            fileWriterOrder.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
            System.exit(1);
        }
    }
}
