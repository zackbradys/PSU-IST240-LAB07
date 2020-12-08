// Group.java
// Zack Brady | IST 240

public class Group {

    private String GroupName;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;

    public Group(String GroupName, Student student1, Student student2, Student student3, Student student4) {
        this.GroupName = GroupName;
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
        this.student4 = student4;
    }

    public String getGroupName() {
        return GroupName;
    }

    public Student getStudent1() {
        return student1;
    }

    public Student getStudent2() {
        return student2;
    }

    public Student getStudent3() {
        return student3;
    }

    public Student getStudent4() {
        return student4;
    }
    
    public double groupSemesterAverage() {
        double GroupAverage = (student1.getGPA() + student2.getGPA() + student3.getGPA() + student4.getGPA()) / 4;
        return GroupAverage;
    }
}
