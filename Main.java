package solidExample;

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

class StudentRepository {
    public void save(Student student) {
        System.out.println(student.getName() + " adlı öğrenci veritabanına kaydedildi.");
    }
}

class StudentPrinter {
    public void print(Student student) {
        System.out.println("Öğrenci: " + student.getName() + " | Not: " + student.getGrade());
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Esma Çelebi", 90);

        StudentRepository repo = new StudentRepository();
        StudentPrinter printer = new StudentPrinter();

        repo.save(s1);
        printer.print(s1);
    }
}
