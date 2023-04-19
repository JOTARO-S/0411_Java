package jp.ssie.ocjp;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class CurrentDateTime extends JFrame {
    private JLabel dateTimeLabel;

    public CurrentDateTime() {
        dateTimeLabel = new JLabel();
        dateTimeLabel.setFont(new Font("Serif", Font.BOLD, 20));
        dateTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(dateTimeLabel);

        setTitle("現在の日付と時刻");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        Timer timer = new Timer(1000, e -> updateDateTime());
        timer.start();
    }

    private void updateDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dateTime = formatter.format(date);
        dateTimeLabel.setText(dateTime);
    }

    public static void main(String[] args) {
        new CurrentDateTime();
    }
}

