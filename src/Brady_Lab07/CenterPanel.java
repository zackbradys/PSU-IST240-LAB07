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

    public CenterPanel(Group group1, TopPanel tp) {
        super();
        GridLayout grid = new GridLayout(4, 1);
        setLayout(grid);
        setBackground(Color.pink);
        jb1 = new JButton("NAME = " + group1.getStudent1().getName() + "  |  GPA = " + String.format("%.2f", group1.getStudent1().getGPA()));
        jb2 = new JButton("NAME = " + group1.getStudent2().getName() + "  |  GPA = " + String.format("%.2f", group1.getStudent2().getGPA()));
        jb3 = new JButton("NAME = " + group1.getStudent3().getName() + "  |  GPA = " + String.format("%.2f", group1.getStudent3().getGPA()));
        jb4 = new JButton("NAME = " + group1.getStudent4().getName() + "  |  GPA = " + String.format("%.2f", group1.getStudent4().getGPA()));

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
            
        if (e.getSource() == cp.jb1) {
            cp.jb1.setText("NAME = " + group1.getStudent1().getName() + "  |  GPA = " + String.format("%.2f", group1.getStudent1().getGPA()));
            tp.jb3.setText("" + String.format("%.2f", group1.groupSemesterAverage()));
        }

        else if (e.getSource() == cp.jb2) {
            cp.jb2.setText("NAME = " + group1.getStudent2().getName() + "  |  GPA = " + String.format("%.2f", group1.getStudent2().getGPA()));
            tp.jb3.setText("" + String.format("%.2f", group1.groupSemesterAverage()));
        }

        else if (e.getSource() == cp.jb3) {
            cp.jb3.setText("NAME = " + group1.getStudent3().getName() + "  |  GPA = " + String.format("%.2f", group1.getStudent3().getGPA()));
            tp.jb3.setText("" + String.format("%.2f", group1.groupSemesterAverage()));
        }

        else if (e.getSource() == cp.jb4) {
            cp.jb4.setText("NAME = " + group1.getStudent4().getName() + "  |  GPA = " + String.format("%.2f", group1.getStudent4().getGPA()));
            tp.jb3.setText("" + String.format("%.2f", group1.groupSemesterAverage()));
        }
    }
}
