import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JTextField txt;
    private JButton button1;
    private JButton button2;

    GUI() {
        JFrame frame = new JFrame("Lab 14");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("Delete");
        button2 = new JButton("Reverse");
        txt = new JTextField(15);
        Container cp = frame.getContentPane();
        cp.add(txt);
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));
        cp.add(button1);
        cp.add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            txt.setText("");
        } else if (e.getSource() == button2) {
            String newStr = "";
            for (int i = txt.getText().length() - 1; i >= 0; i--) {
                newStr = newStr + txt.getText().charAt(i);
            }
            txt.setText(newStr);
        }
    }
}
