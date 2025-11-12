package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n╔═════════════════════════╗");
        System.out.println("║        MAIN MENU        ║");
        System.out.println("╠═════════════════════════╣");
        System.out.println("║ 1) Insert new student   ║");
        System.out.println("║ 2) Search student       ║");
        System.out.println("║ 3) Remove student       ║");
        System.out.println("║ 4) Display hash table   ║");
        System.out.println("║ 5) Exit system          ║");
        System.out.println("╚═════════════════════════╝");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\nSelect the desired option: ");
            int answer = scan.nextInt();
            scan.nextLine();

            switch (answer) {
                case 1 -> src.operations.NewStudent.main(new String[0]);
                case 2 -> src.operations.NewStudent.main(new String[0]);
                case 3 -> src.operations.NewStudent.main(new String[0]);
                case 4 -> src.operations.NewStudent.main(new String[0]);
                case 5 -> System.exit(0);
                default -> throw new AssertionError("");
            }
        }

        System.out.println("\n");

    }
}
