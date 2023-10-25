package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Marc", 26, "JAVA", 10));
        studentList.add(new Student("Pere", 16, "PHP", 9));
        studentList.add(new Student("Maria", 25, "PYTHON", 2));
        studentList.add(new Student("Joan", 17, "PHP", 8));
        studentList.add(new Student("Miquel", 16, "JAVA", 3));
        studentList.add(new Student("Anna", 29, "JAVA", 7));
        studentList.add(new Student("Laura", 32, "PYTHON", 8));
        studentList.add(new Student("Josefina", 14, "JAVA", 4));
        studentList.add(new Student("Pau", 17, "JAVA", 10));
        studentList.add(new Student("Alba", 28, "PHP", 7));

        System.out.println("All students: ");
        printNameAge(studentList);

        System.out.println("Only students whose name starts with A: ");
        printNamesThatStartWithA(studentList);

        System.out.println("Only students whose grade is 5 or higher: ");
        printStudentsGrade5(studentList);

        System.out.println("Only students whose grade is 5 or higher and do not course PHP: ");
        printStudentsGrade5NoPHP(studentList);

        System.out.println("Only adult students who course JAVA: ");
        printStudentsAdultJAVA(studentList);


    }

    public static void printNameAge(List<Student> studentList)
    {
        studentList.forEach(student -> System.out.println("Name: " + student.getName() + ", Age:" + student.getAge()));
        System.out.println();
    }

    public static void printNamesThatStartWithA(List<Student> studentList)
    {
        List<Student> resultList = studentList.stream()
                        .filter(student->student.getName().startsWith("A"))
                        .toList();

       printNameAge(resultList);
    }

    public static void printStudentsGrade5(List<Student> studentList)
    {
        List<Student> resultList = studentList.stream()
                .filter(student->student.getGrade() >= 5)
                .toList();

        printNameAge(resultList);
    }

    public static void printStudentsGrade5NoPHP(List<Student> studentList)
    {
        List<Student> resultList = studentList.stream()
                .filter(student->student.getGrade() >= 5 && !student.getCourse().equals("PHP"))
                .toList();

        printNameAge(resultList);
    }

    public static void printStudentsAdultJAVA(List<Student> studentList)
    {
        List<Student> resultList = studentList.stream()
                .filter(student->student.getAge() >= 18 && student.getCourse().equals("JAVA"))
                .toList();

        printNameAge(resultList);
    }
}
