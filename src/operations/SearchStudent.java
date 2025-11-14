package src.operations;

import java.util.Scanner;
import src.model.Student;
import src.utils.ClearTerminal;
import src.utils.CustomHashTable;


public class SearchStudent {
    public static Student search(CustomHashTable table, Scanner scan, boolean waitForEnter) {

        ClearTerminal.clear();

        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                      STUDENT SEARCH                            ║");
        System.out.println("╠════════════════════════════════════════════════════════════════╣");
        System.out.print("║ Enter the student's registry number: ");

        int registryNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("╚════════════════════════════════════════════════════════════════╝");

        Student student = table.search(registryNumber);

        ClearTerminal.clear();

        if (student != null) {
            System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
            System.out.println("║                   STUDENT FOUND                           ║");
            System.out.println("╠═══════════════════════════════════════════════════════════╣");
            System.out.printf("║ Registry Number: %s\n", student.getRegistryNumber());
            System.out.printf("║ Name: %s\n", student.getName());
            System.out.printf("║ Age: %s\n", student.getAge());
            System.out.println("╚═══════════════════════════════════════════════════════════╝");
        } else {
            System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
            System.out.println("║                   STUDENT NOT FOUND                       ║");
            System.out.println("╚═══════════════════════════════════════════════════════════╝");
        }

        if (waitForEnter) {
            System.out.println("\nPress ENTER to return to the main menu...");
            scan.nextLine();
            ClearTerminal.clear();
        }

        return student;
    }
}
