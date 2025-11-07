public class HashFunction {
    public static int calculate(int registry, int tableSize) {
        int key = registry % tableSize;
        return key;
    }
}
