package src.operations;

import java.util.Scanner;
import src.model.Student;
import src.utils.ClearTerminal;
import src.utils.CustomHashTable;


public class RemoveStudent {
    public static void remove(CustomHashTable table, Scanner scan) {

        Student student = SearchStudent.search(table, scan);

        if (student != null) {
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

        System.out.println("\nPress ENTER to return to the main menu...");
        scan.nextLine();
        ClearTerminal.clear();
    }
}
