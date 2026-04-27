/**
 * Trevor Herrera
 * Java 2 (R01)
 * 02/23/2026
 * Assignment: Human Resources
 * Purpose: Read Nintendo HR data from a file, remove duplicates,
 *          produce one alphabetized copy and one imperial-units copy,
 *          and write each to its own output file.
 */

/*
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
 */

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("Usage: java Main <hr.txt>");
            System.exit(1);
        }

        PersonOrderedSet orderedSet = new PersonOrderedSet();
        PersonImperialSet imperialSet = new PersonImperialSet();

        Path path = Paths.get(args[0]);
        Scanner fileReader = null;

        try {
            fileReader = new Scanner(path);
        } catch (IOException e) {
            System.err.println("IO Exception error message: " + e.getMessage());
            System.exit(1);
        }

        try {
            // Skip the header row (Name, Height, Weight)
            fileReader.nextLine();

            while (fileReader.hasNext()) {
                String name = fileReader.next();
                double height = fileReader.nextDouble();
                double weight = fileReader.nextDouble();

                // Two separate Persons so the imperial conversion
                // doesn't mutate the one held by the ordered set.
                orderedSet.add(new Person(name, height, weight));
                imperialSet.add(new Person(name, height, weight));
            }

        } catch (java.util.InputMismatchException e) {
            System.err.println("InputMismatchException: " + e.getMessage());
            e.printStackTrace();
        }

        fileReader.close();

        writeToFile("hr_ordered_set_output.txt", orderedSet.toString());
        writeToFile("hr_imperial_set_output.txt", imperialSet.toString());

        System.out.println("Ordered Set:");
        System.out.println(orderedSet);

        System.out.println("Imperial Set:");
        System.out.println(imperialSet);
    }

    private static void writeToFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Failed to write " + filename + ": " + e.getMessage());
        }
    }
}
