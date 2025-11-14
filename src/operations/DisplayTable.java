package src.operations;

import java.util.Scanner;
import src.utils.ClearTerminal;
import src.utils.CustomHashTable;


public class DisplayTable {
    public static void display(CustomHashTable table, Scanner scan) {
        table.display();

        System.out.println("\nPress ENTER to return to the main menu...");
        scan.nextLine();
        ClearTerminal.clear();
    }
}
