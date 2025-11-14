package src.operations;


import java.util.Scanner;
import src.model.Student;
import src.utils.ClearTerminal;
import src.utils.CustomHashTable;


public class NewStudent {
    public static void create(CustomHashTable table, Scanner scan) {

        ClearTerminal.clear();

        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                      ADD NEW STUDENT                           ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝");
        
        int registryNumber;
        while (true) {
            System.out.print("║ Enter the student's registry number: ");
            registryNumber = scan.nextInt();
            scan.nextLine();
            
            if (table.exists(registryNumber)) {
                System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
                System.out.println("║ ERROR: A student with this registry number already exists!");
                System.out.println("║ Please enter a different registry number.");
                System.out.println("╚════════════════════════════════════════════════════════════════╝");
            } else {
                break;
            }
        }

        System.out.print("║ Enter the student's name: ");
        String name = scan.nextLine();

        System.out.print("║ Enter the student's age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("╚════════════════════════════════════════════════════════════════╝");

        ClearTerminal.clear();

        Student newStudent = new Student(registryNumber, name, age);
        table.insert(newStudent);

        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║                    NEW STUDENT ADDED                      ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        System.out.printf("║ Registry Number: %s\n", newStudent.getRegistryNumber());
        System.out.printf("║ Name: %s\n", newStudent.getName());
        System.out.printf("║ Age: %s\n", newStudent.getAge());
        System.out.println("╚═══════════════════════════════════════════════════════════╝");

        System.out.println("\nPress ENTER to return to the main menu...");
        scan.nextLine();
        ClearTerminal.clear();
    }
}
