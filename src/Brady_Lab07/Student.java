// Student.java
// Zack Brady | IST 240

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private double GPA;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.GPA = SemesterGPA();
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public double getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }

    public String getStudentInfo() {
        return getName() + "  " + getAge() + " " + getGPA();
    }
    
    public double SemesterGPA() {
        double RandomGPA = (Math.random() * 4.00) + 0.00;
        GPA = RandomGPA;
        return RandomGPA;
    }
}

