package builder.simple;

public class MainTest {
    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .age(20)
                .name("Ramesh")
                .rollNumber(12345)
                .build();

        System.out.println(student);
    }
}
