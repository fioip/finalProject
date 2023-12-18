package FinalProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class FinalProject {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JPanel controlPanel;
    private JLabel statusLabel;
    private JPanel textField;

    public FinalProject() {
        prepareGUI();
    }

    public static void main(String[] args){
        FinalProject swingControlDemo = new FinalProject();
        swingControlDemo.showLabelDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Registration Form");
        mainFrame.setBackground(Color.DARK_GRAY);
        mainFrame.setSize(700,700);
        GridLayout layout = new GridLayout(6,6, 10, 10);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

        headerLabel = new JLabel("Registration Form",JLabel.CENTER);
        headerLabel.setSize(200,200);

        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(500,500);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        textField = new JPanel();
        textField.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(textField);

        mainFrame.setVisible(true);
    }
    private void showLabelDemo(){
        JLabel namelabel= new JLabel("User ID: ", JLabel.RIGHT);
        JLabel passwordLabel = new JLabel("Password: ", JLabel.CENTER);
        final JTextField userText = new JTextField(6);
        final JPasswordField passwordText = new JPasswordField(6);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Username: " + userText.getText();
                data += ", Password: " + new String(passwordText.getPassword());
                statusLabel.setText(data);
            }
        });

        textField.add(namelabel);
        textField.add(userText);
        textField.add(passwordLabel);
        textField.add(passwordText);
        textField.add(loginButton);

        mainFrame.setVisible(true);
    }
}
