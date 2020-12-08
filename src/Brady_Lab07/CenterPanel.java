// CenterPanel.java
// Zack Brady | IST 240

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CenterPanel extends JPanel implements ActionListener{
    
    CenterPanel cp;
    TopPanel tp;
    Group group1;
    JButton jb1, jb2, jb3, jb4;

    public CenterPanel(Group group1) {
        super();
        GridLayout grid = new GridLayout(4, 1);
        setLayout(grid);
        setBackground(Color.pink);
        jb1 = new JButton("NAME = " + group1.students[0].getName() + "  |  GPA = " + String.format("%.2f", group1.students[0].GPA));
        jb2 = new JButton("NAME = " + group1.students[1].getName() + "  |  GPA = " + String.format("%.2f", group1.students[1].GPA));
        jb3 = new JButton("NAME = " + group1.students[2].getName() + "  |  GPA = " + String.format("%.2f", group1.students[2].GPA));
        jb4 = new JButton("NAME = " + group1.students[3].getName() + "  |  GPA = " + String.format("%.2f", group1.students[3].GPA));

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        
        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jb1) {
            jb1.setText("NAME = " + group1.students[0].getName() + "  |  GPA = " + String.format("%.2f", group1.getStudentGPA(0)));
            tp.jb3.setText("" + String.format("%.2f", group1.getAverageGPA()));
        }

        if (e.getSource() == jb2) {
            jb2.setText("Name = " + group1.students[1].getName() + "  |  GPA = " + String.format("%.2f", group1.getStudentGPA(1)));
            tp.jb3.setText("" + String.format("%.2f", group1.getAverageGPA()));
        }

        if (e.getSource() == jb3) {
            jb3.setText("Name = " + group1.students[2].getName() + "  |  GPA = " + String.format("%.2f", group1.getStudentGPA(2)));
            tp.jb3.setText("" + String.format("%.2f", group1.getAverageGPA()));
        }

        if (e.getSource() == jb4) {
            jb4.setText("Name = " + group1.students[3].getName() + "  |  GPA = " + String.format("%.2f", group1.getStudentGPA(3)));
            tp.jb3.setText("" + String.format("%.2f", group1.getAverageGPA()));
        }
    }
}
