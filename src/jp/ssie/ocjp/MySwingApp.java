package jp.ssie.ocjp;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MySwingApp extends JFrame {
    public MySwingApp() {
        super("My Swing App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello, World!");
        getContentPane().add(label);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MySwingApp app = new MySwingApp();
            app.setVisible(true);
        });
    }
}