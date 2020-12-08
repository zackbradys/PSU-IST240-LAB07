// CenterPanel.java
// Zack Brady | IST 240

import java.awt.*;
import javax.swing.*;

public class CenterPanel extends JPanel {

    JButton jb1, jb2, jb3, jb4;

    public CenterPanel(Group g1) {
        super();
        GridLayout grid = new GridLayout(4, 1);
        setLayout(grid);
        setBackground(Color.pink);
        jb1 = new JButton("NAME = " + g1.students[0].getName() + "  |  GPA = " + String.format("%.2f", g1.students[0].GPA));
        jb2 = new JButton("NAME = " + g1.students[1].getName() + "  |  GPA = " + String.format("%.2f", g1.students[1].GPA));
        jb3 = new JButton("NAME = " + g1.students[2].getName() + "  |  GPA = " + String.format("%.2f", g1.students[2].GPA));
        jb4 = new JButton("NAME = " + g1.students[3].getName() + "  |  GPA = " + String.format("%.2f", g1.students[3].GPA));

        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
    }
}
