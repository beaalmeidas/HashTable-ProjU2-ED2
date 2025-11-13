package src;

import java.util.Scanner;
import src.utils.ClearTerminal;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer;

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
                case 1 -> src.operations.NewStudent.main(new String[0]);
                // case 2 -> src.operations.SearchStudent.main(new String[0]);
                // case 3 -> src.operations.RemoveStudent.main(new String[0]);
                // case 4 -> src.operations.DisplayHashTable.main(new String[0]);
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
