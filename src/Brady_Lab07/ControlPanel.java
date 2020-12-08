// ControlPanel.java
// Zack Brady | IST 240

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlPanel extends JPanel implements ActionListener {

    CenterPanel cp;
    TopPanel tp;
    Group g1;

    public ControlPanel() {
        super();
        BorderLayout border = new BorderLayout();
        setLayout(border);
        setBackground(Color.gray);
        
        Student[] students = new Student[4];
        students[0] = new Student("Elwood", "Luntz", 24);
        students[1] = new Student("Penny", "Burke", 20);
        students[2] = new Student("Eli", "Tarlings", 29);
        students[3] = new Student("Jennifer", "Seeger", 23);
        g1 = new Group("Nittany Lions");
        g1.addStudents(students);

        cp = new CenterPanel(g1);
        tp = new TopPanel(g1);
        add(tp, "North");
        add(cp, "Center");

        cp.jb1.addActionListener(this);
        cp.jb2.addActionListener(this);
        cp.jb3.addActionListener(this);
        cp.jb4.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cp.jb1) {
            cp.jb1.setText("NAME = " + g1.students[0].getName() + "  |  GPA = " + String.format("%.2f", g1.getStudentGPA(0)));
            tp.jb3.setText("" + String.format("%.2f", g1.getAverageGPA()));
        }

        if (e.getSource() == cp.jb2) {
            cp.jb2.setText("Name = " + g1.students[1].getName() + "  |  GPA = " + String.format("%.2f", g1.getStudentGPA(1)));
            tp.jb3.setText("" + String.format("%.2f", g1.getAverageGPA()));
        }

        if (e.getSource() == cp.jb3) {
            cp.jb3.setText("Name = " + g1.students[2].getName() + "  |  GPA = " + String.format("%.2f", g1.getStudentGPA(2)));
            tp.jb3.setText("" + String.format("%.2f", g1.getAverageGPA()));
        }

        if (e.getSource() == cp.jb4) {
            cp.jb4.setText("Name = " + g1.students[3].getName() + "  |  GPA = " + String.format("%.2f", g1.getStudentGPA(3)));
            tp.jb3.setText("" + String.format("%.2f", g1.getAverageGPA()));
        }
    }
}
