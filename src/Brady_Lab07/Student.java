// Student.java
// Zack Brady | IST 240

import java.util.Random;

class Student {

    String fName;
    String lName;
    int age;
    Random random = new Random();
    double GPA = (random.nextDouble() * 4.0);

    Student(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.GPA = semesterGPA();
    }

    public String getName() {
        return this.fName + " " + this.lName;
    }

    public double semesterGPA() {

        double rdn = random.nextDouble();
        GPA = Math.round((rdn * 4.0) * 10.0) / 10.0;
        return GPA;
    }

}
