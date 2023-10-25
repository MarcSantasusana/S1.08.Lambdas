package n3exercici1;

public class Student {

    private String name;
    private int age;
    private String course;

    private int grade;

    public Student(String name, int age, String course, int grade)
    {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getCourse() {
        return course;
    }
}
