class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Person constructor called");
    }
}

class Student extends Person {
    int marks;

    // Default constructor
    Student() {
        this("Shalini", 19, 90);
        System.out.println("Student default constructor called");
    }

    // Parameterized constructor
    Student(String name, int age, int marks) {
        super(name, age);

        this.marks = marks;

        System.out.println("Student Parameterized Constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("\nStudent details:");

        s.display();
    }
}