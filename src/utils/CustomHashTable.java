package src.utils;

import java.util.LinkedList;
import src.model.Student;


public class CustomHashTable {
    // array attribute that stores linked lists of student objects
    private LinkedList<Student>[] table;

    // constructor for the table
    @SuppressWarnings("unchecked")
    public CustomHashTable(int size) {
        table = (LinkedList<Student>[]) new LinkedList[size];

        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void insert(Student student) {
        int position = HashFunction.hash(student.getRegistryNumber(), table.length);
        table[position].add(student);
    }

    public Student search(int registryNumber) {
        int position = HashFunction.hash(registryNumber, table.length);
        
        // for each student in the list of this position of the array
        for (Student s : table[position]) {
            if (s.getRegistryNumber() == registryNumber) {
                return s;
            }
        }
        return null;
    }

    public boolean remove(int registryNumber) {
        int position = HashFunction.hash(registryNumber, table.length);

        boolean isRemoved = table[position].removeIf(s -> s.getRegistryNumber() == registryNumber);

        return isRemoved;
    }

    public void display() {
        System.out.println("\nHash Table:");

        for (int i = 0; i < table.length; i++) {
            System.out.print(i + " → ");
            if (table[i].isEmpty()) {
                System.out.println("empty");
            } else {
                for (Student s : table[i]) {
                    System.out.print("[" + s.getRegistryNumber() + "] ");
                }
                System.out.println();
            }
        }
    }
}
