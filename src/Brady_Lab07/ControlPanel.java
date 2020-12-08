// ControlPanel.java
// Zack Brady | IST 240

import java.awt.*;
import javax.swing.*;

public class ControlPanel extends JPanel {

    CenterPanel cp;
    TopPanel tp;
    Group group1;

    public ControlPanel() {
        super();
        BorderLayout border = new BorderLayout();
        setLayout(border);
        setBackground(Color.gray);

        tp = new TopPanel(group1);
        cp = new CenterPanel(group1);
        add(tp, "North");
        add(cp, "Center");
        
        Student[] students = new Student[4];
        students[0] = new Student("Elwood", "Luntz", 24);
        students[1] = new Student("Penny", "Burke", 20);
        students[2] = new Student("Eli", "Tarlings", 29);
        students[3] = new Student("Jennifer", "Seeger", 23);
        group1 = new Group("Nittany Lions");
        group1.addStudents(students);

    }
}
