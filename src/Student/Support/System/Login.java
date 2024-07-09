package Student.Support.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Login extends JFrame implements ActionListener {

    private JPanel logPanel, logMessagePanel;
    private JLabel heading1, heading2, desc1,desc2, enter_mail, enter_pass;
    private JTextField userName_textField;
    private JButton signin_Button, signup_Button;
    private JPasswordField log_passwordField;

    public JLabel loginPage()
    {
        JLabel loginMainPanel =new JLabel();
        loginMainPanel.setLayout(null);
        loginMainPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        loginMainPanel.setBounds(2, 2, 800, 500);
        add(loginMainPanel);


                logPanel=new JPanel();
                logPanel.setLayout(null);
                logPanel.setBackground(Color.WHITE);
                logPanel.setBounds(0, 0, 499, 500);
                loginMainPanel.add(logPanel);

                        heading2=new JLabel("Sign In in to Projects");
                        heading2.setForeground(new Color(0,94,78));
                        heading2.setFont(new Font("Arial Black", Font.BOLD, 35));
                        heading2.setBounds(50, 50, 450, 50);
                        logPanel.add(heading2);

                                ImageIcon facebookIcon=new ImageIcon(ClassLoader.getSystemResource("images/icon/facebook1.png"));
                                Image face_img = facebookIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
                                ImageIcon face_icon_scaled = new ImageIcon(face_img);
                                JLabel face_icon_label = new JLabel(face_icon_scaled);
                                face_icon_label.setBounds(80,105,35,35);
                                logPanel.add(face_icon_label);

                                ImageIcon google_icon=new ImageIcon(ClassLoader.getSystemResource("images/icon/google.png"));
                                Image google_img = google_icon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
                                ImageIcon google_icon_scaled = new ImageIcon(google_img);
                                JLabel google_icon_label = new JLabel(google_icon_scaled);
                                google_icon_label.setBounds(130,105,35,35);
                                logPanel.add(google_icon_label);

                                ImageIcon linkedin_icon=new ImageIcon(ClassLoader.getSystemResource("images/icon/linkedin1.png"));
                                Image linkedin_img = linkedin_icon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
                                ImageIcon linkedin_icon_scaled = new ImageIcon(linkedin_img);
                                JLabel linkedin_icon_label = new JLabel(linkedin_icon_scaled);
                                linkedin_icon_label.setBounds(175,105,35,35);
                                logPanel.add(linkedin_icon_label);

                                // ImageIcon mail_icon=new ImageIcon(ClassLoader.getSystemResource("images/icon/mail.png"));
                                // Image mail_img = mail_icon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
                                // ImageIcon mail_icon_scaled = new ImageIcon(mail_img);
                                // JLabel mail_icon_label = new JLabel(mail_icon_scaled);
                                // mail_icon_label.setBounds(50,200,35,35);
                                // logPanel.add(mail_icon_label);


                        enter_mail=new JLabel("User Name ");
                        enter_mail.setForeground(new Color(0,94,78));
                        enter_mail.setFont(new Font("Arial", Font.BOLD, 20));
                        enter_mail.setBounds(50, 150, 300, 50);
                        logPanel.add(enter_mail);

                        userName_textField=new JTextField();
                        userName_textField.setHorizontalAlignment(JTextField.LEADING);
                        userName_textField.setForeground(Color.BLACK);
                        userName_textField.setFont(new Font("Arial", Font.BOLD, 20));
                        userName_textField.setColumns(20);
                        userName_textField.setBounds(50, 200, 400, 50);
                        logPanel.add(userName_textField);
                            // if(userName_textField.getText().isEmpty()){
                            //     ImageIcon mail_icon=new ImageIcon(ClassLoader.getSystemResource("images/icon/mail.png"));
                            //     Image mail_img = mail_icon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
                            //     ImageIcon mail_icon_scaled = new ImageIcon(mail_img);
                            //     JLabel mail_icon_label = new JLabel(mail_icon_scaled);
                            //     mail_icon_label.setBounds(5,2,35,35);
                            //     userName_textField.add(mail_icon_label);
                            // }
                               

                        enter_mail=new JLabel("Enter Password ");
                        enter_mail.setForeground(new Color(0,94,78));
                        enter_mail.setFont(new Font("Arial", Font.BOLD, 20));
                        enter_mail.setBounds(50, 250, 300, 50);
                        logPanel.add(enter_mail);

                        log_passwordField=new JPasswordField();
                        log_passwordField.setForeground(Color.BLACK);
                        log_passwordField.setFont(new Font("Arial", Font.BOLD, 35));
                        log_passwordField.setBounds(50, 300, 400, 50);
                        logPanel.add(log_passwordField);

                        signin_Button=new JButton("Sign In");
                        signin_Button.setBackground(new Color(0, 94, 78));
                        signin_Button.setForeground(Color.WHITE);
                        signin_Button.setFont(new Font("Arial", Font.BOLD, 20));
                        signin_Button.setFocusPainted(false);
                        signin_Button.setBounds(100, 370, 200, 50);
                        logPanel.add(signin_Button);

                      

                logMessagePanel=new JPanel();
                logMessagePanel.setLayout(null);
                logMessagePanel.setBounds(500, 0, 300, 500);
                logMessagePanel.setBackground(new Color(0, 94, 78));
        //        logMessagePanel.setBackground(new Color(6, 113, 93));
                loginMainPanel.add(logMessagePanel);

                        heading1=new JLabel("Hello, Friend!");
                        heading1.setForeground(Color.WHITE);
                        heading1.setFont(new Font("Arial", Font.BOLD, 35));
                        heading1.setBounds(40, 150, 250, 50);
                        logMessagePanel.add(heading1);

                        desc1=new JLabel("Enter Your Personal Details");
                        desc1.setForeground(Color.WHITE);
                        desc1.setFont(new Font("Arial", Font.BOLD, 15));
                        desc1.setBounds(50, 180, 250, 50);
                        logMessagePanel.add(desc1);

                        desc2=new JLabel("and start journey with us.");
                        desc2.setForeground(Color.WHITE);
                        desc2.setFont(new Font("Arial", Font.BOLD, 12));
                        desc2.setBounds(55, 200, 250, 50);
                        logMessagePanel.add(desc2);

                        signup_Button=new JButton("Sign Up");
                        signup_Button.setBackground(new Color(0, 94, 78));
                        signup_Button.setForeground(Color.WHITE);
                        signup_Button.setFont(new Font("Arial", Font.BOLD, 20));
                        signup_Button.setFocusPainted(false);
                        signup_Button.setBounds(60, 250, 150, 50);
                        signup_Button.addActionListener(this);
                        logMessagePanel.add(signup_Button);
                        
            return loginMainPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == signup_Button) {
            new SignUp();
        }
    }

    // public static void main(String[] args) {
    //     new Login();
    // }
}
