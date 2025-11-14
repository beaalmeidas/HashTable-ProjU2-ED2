package src;

import java.util.Scanner;
import src.operations.DisplayTable;
import src.operations.NewStudent;
import src.operations.RemoveStudent;
import src.operations.SearchStudent;
import src.utils.ClearTerminal;
import src.utils.CustomHashTable;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer;
        CustomHashTable table = new CustomHashTable(10);

        ClearTerminal.clear();

        while (true) { 
            System.out.println("\n╔═════════════════════════╗");
            System.out.println("║        MAIN MENU        ║");
            System.out.println("╠═════════════════════════╣");
            System.out.println("║ 1) Insert new student   ║");
            System.out.println("║ 2) Search student       ║");
            System.out.println("║ 3) Remove student       ║");
            System.out.println("║ 4) Display hash table   ║");
            System.out.println("║ 5) Exit system          ║");
            System.out.println("╚═════════════════════════╝");

            System.out.print("\nSelect the desired option: ");
            answer = scan.nextInt();
            scan.nextLine();

            switch (answer) {
                case 1 -> NewStudent.create(table, scan);
                case 2 -> SearchStudent.search(table, scan, true);
                case 3 -> RemoveStudent.remove(table, scan);
                case 4 -> DisplayTable.display(table, scan);
                case 5 -> {
                    System.out.println("\nGoodbye!\n");
                    scan.close();
                    System.exit(0);
                }
                default -> throw new AssertionError("\nInvalid option. Please try again.\n");
            }
        }
    }
}
