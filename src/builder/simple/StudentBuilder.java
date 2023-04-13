package builder.simple;

public class StudentBuilder {
    int rollNumber;
    int age;
    String name;

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder rollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
