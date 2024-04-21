package OOPs.Encapsualation;

public class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Creating an object of Student
        Student student = new Student(1, "John Doe");

        // Accessing and printing student details
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
    }
}
