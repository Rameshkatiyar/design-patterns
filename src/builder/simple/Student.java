package builder.simple;

public class Student {
    int rollNumber;
    int age;
    String name;

    public Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
    }
}
