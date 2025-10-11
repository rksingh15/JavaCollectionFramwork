import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Ravi", 75),
            new Student("Amit", 90),
            new Student("Anu", 55),
            new Student("Rahul", 85),
            new Student("Ajay", 65)
        );

        List<String> topStudents = students.stream()
            .filter(s -> s.marks > 60)                              //  60 se upar marks
            .sorted((a, b) -> b.marks - a.marks)                    // descending sort
            .limit(3)                                               // top 3
            .map(s -> s.name.toUpperCase())                         //  uppercase
            .collect(Collectors.toList());                          //  list me collect

        System.out.println(topStudents);
    }
}
