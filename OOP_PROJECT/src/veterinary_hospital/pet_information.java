package veterinary_hospital;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class pet_information implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userName;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) throws IOException {

//GUI for Login Page
        JFrame frame = new JFrame("Login Page");
        JPanel panel = new JPanel();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        

        panel.setLayout(null);
        userLabel = new JLabel("User Name");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userName = new JTextField(20);
        userName.setBounds(100, 20, 165, 25);
        panel.add(userName);

        passwordLabel = new JLabel("Password ");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(120, 90, 80, 25);
        panel.add(button);
        button.addActionListener(new pet_information());
        success = new JLabel();
        success.setBounds(10, 130, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String user = userName.getText();
        String password = passwordText.getText();

        try {

            if (user.equals("admin") && password.equals("admin")) {
                success.setText("Login Successful");
                GUI_Data ob = new GUI_Data();
            } else if (user != "admin" && password != "admin") {
                JOptionPane.showMessageDialog(null, "Incorrect Username or password"
                        + "\n"
                        + "             Try Again");
                //System.exit(0);

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
