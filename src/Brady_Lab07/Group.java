// Group.java
// Zack Brady | IST 240

public class Group {

    String groupName;
    double avgGPA = 0;
    Student[] students;

    Group(String groupName) {
        this.groupName = groupName;
        students = new Student[4];
    }

    public void addStudents(Student[] studentarray) {
        students[0] = studentarray[0];
        students[1] = studentarray[1];
        students[2] = studentarray[2];
        students[3] = studentarray[3];
    }

    public double getAverageGPA() {
        avgGPA = 0;
        for (Student s : this.students) {
            this.avgGPA += s.GPA;
        }
        return (Math.round((this.avgGPA / 4.0) * 10.0) / 10.0);
    }

    public double getStudentGPA(int index) {
        return (students[index].semesterGPA());
    }
}
