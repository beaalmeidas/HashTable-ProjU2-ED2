package src.operations;

import java.util.Scanner;
import src.model.Student;
import src.utils.CustomHashTable;


public class RemoveStudent {
    public static void remove(CustomHashTable table) {

        Student student = SearchStudent.search(table);

        if (student != null) {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("\nDo you really want to remove this student? (y/n): ");
                String answer = scan.nextLine();

                if (answer.equalsIgnoreCase("y")) {
                    boolean isRemoved = table.remove(student.getRegistryNumber());

                    if (isRemoved) {
                        System.out.println("\nStudent removed successfully!");
                    } else {
                        System.out.println("\nError removing student.");
                    }
                } else {
                    System.out.println("\nRemoval canceled.");
                }
            }
        }
    }
}
