// MainFrame.java
// Zack Brady | IST 240

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    ControlPanel CPObj;

    public MainFrame() {
        super("L07: Lab Assignment - Java Tracking Buttons - Part 2 | Zack Brady");
        CPObj = new ControlPanel();
        getContentPane().add(CPObj, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 480);
        setVisible(true);
    }

    public void MacLayoutSetup() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
