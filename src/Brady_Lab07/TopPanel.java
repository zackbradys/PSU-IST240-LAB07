// TopPanel.java
// Zack Brady | IST 240

import java.awt.*;
import javax.swing.*;

public class TopPanel extends JPanel {

    JButton jb1, jb2, jb3;

    public TopPanel(Group group1) {
        super();
        setBackground(Color.blue);
        jb1 = new JButton(group1.getGroupName());
        jb2 = new JButton("Group Average GPA is ");
        jb3 = new JButton(String.format("%.2f", group1.groupSemesterAverage()));

        add(jb1);
        add(jb2);
        add(jb3);
    }
}
