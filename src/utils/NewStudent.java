package src.utils;


import java.util.Scanner;
import src.model.Student;


public class NewStudent {
    public static void create(String[] args) {

        Scanner scan = new Scanner(System.in);

        ClearTerminal.clear();

        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.print("║ Enter the student's registry number: ");
        int registryNumber = scan.nextInt();
        scan.nextLine();

        System.out.print("║ Enter the student's name: ");
        String name = scan.nextLine();

        System.out.print("║ Enter the student's age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("╚════════════════════════════════════════════════════════════════╝");

        ClearTerminal.clear();
        
        Student newStudent = new Student(registryNumber, name, age);

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
