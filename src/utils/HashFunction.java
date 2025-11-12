package src.utils;


public class HashFunction {
    public static int calculate(int registryNumber, int tableSize) {
        int key = registryNumber % tableSize;
        return key;
    }
}
