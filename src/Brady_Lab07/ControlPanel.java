// ControlPanel.java
// Zack Brady | IST 240

import java.awt.*;
import javax.swing.*;

public class ControlPanel extends JPanel {

    CenterPanel cp;
    TopPanel tp;

    public ControlPanel() {
        super();
        BorderLayout border = new BorderLayout();
        setLayout(border);
        setBackground(Color.gray);
      
        Student student1 = new Student("Elwood", "Luntz", 24);
        Student student2 = new Student("Penny", "Burke", 20);
        Student student3 = new Student("Eli", "Tarlings", 29);
        Student student4 = new Student("Jennifer", "Seeger", 23);
        Group group1 = new Group("Nittany Lions", student1, student2, student3, student4);
        
        tp = new TopPanel(group1);
        cp = new CenterPanel(group1, tp);
        add(tp, "North");
        add(cp, "Center");
        
    }
}
