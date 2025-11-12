package src.operations;

import java.util.Scanner;
import src.model.Student;


public class NewStudent {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\n╔═════════════════════════════════╗");
            System.out.print("║ Insira o número de matrícula: ");
            int registryNumber = scan.nextInt();
            scan.nextLine();

            System.out.print("║ Insira o nome do aluno: ");
            String name = scan.nextLine();

            System.out.print("║ Insira a idade do aluno: ");
            int age = scan.nextInt();
            scan.nextLine();
            System.out.println("╚═════════════════════════════════╝");

            Student newStudent = new Student(registryNumber, name, age);

            System.out.println("\n╔═════════════════════════════════╗");
            System.out.println("║       NOVO ESTUDANTE INSERIDO   ║");
            System.out.println("╠═════════════════════════════════╣");
            System.out.printf("║ %-25s ║\n", "Registry Number: " + newStudent.getRegistryNumber());
            System.out.printf("║ %-25s ║\n", "Nome: " + newStudent.getName());
            System.out.printf("║ %-25s ║\n", "Idade: " + newStudent.getAge());
            System.out.println("╚═════════════════════════════════╝"); 
        }
    }
}
