package src.model;


public class Student {
    private int registryNumber;
    private String name;
    private int age;

    public Student(int registryNumber, String name, int age) {
        this.registryNumber = registryNumber;
        this.name = name;
        this.age = age;
    }

    public int getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(int registryNumber) {
        this.registryNumber = registryNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
