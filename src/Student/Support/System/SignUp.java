package Student.Support.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class SignUp extends JFrame implements ActionListener {

    private JPanel messagPanel,workPanel, loginMainPanel;
    private JButton signinButton, signupButton, upload_pictureButton;
    private Choice choiceAsChoice;
    JLabel create_Heading, sign_up_inst;
    JTextField fullNameTextField, emailTextField, studentIdTextField, serviceProviderIdTextField, picTextField;
    JPasswordField passwordField, confirmPasswordField;


    SignUp()
    {
        setTitle("-----------Student Support System----------");
//        setLayout(null);
        setBounds(200,35,1020,690);
        // setLocation(300, 15);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginMainPanel =new JPanel();
        loginMainPanel.setLayout(null);
        // loginMainPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 10));
        loginMainPanel.setBounds(5, 5, 800, 650);
        add(loginMainPanel);

                messagPanel=new JPanel();
                messagPanel.setLayout(null);
                messagPanel.setBackground(new Color(0, 94, 78));
                messagPanel.setBounds(0, 0, 400, 650);
                // messagPanel.setBorder(BorderFactory.createLineBorder(Color.red, 1));
                loginMainPanel.add(messagPanel);

                        JLabel create_Heading=new JLabel("Welcome Back!");
                        create_Heading.setForeground(Color.WHITE);
                        create_Heading.setFont(new Font("Arial Black", Font.BOLD, 40));
                        create_Heading.setBounds(20, 200, 400, 50);
                        messagPanel.add(create_Heading);

                        JLabel create_desc=new JLabel("To keep connect with us please");
                        create_desc.setForeground(Color.WHITE);
                        create_desc.setFont(new Font("Arial", Font.BOLD, 20));
                        create_desc.setBounds(45, 260, 400, 20);
                        messagPanel.add(create_desc);

                        JLabel create_desc2=new JLabel("login with your personal info.");
                        create_desc2.setForeground(Color.WHITE);
                        create_desc2.setFont(new Font("Arial", Font.BOLD, 18));
                        create_desc2.setBounds(70, 290, 400, 20);
                        messagPanel.add(create_desc2);

                        signinButton=new JButton("Sign In");
                        signinButton.setBackground(new Color(0, 94, 78));
                        signinButton.setForeground(Color.WHITE);
                        signinButton.setFont(new Font("Arial", Font.BOLD, 20));
                        signinButton.setBounds(100, 350, 200, 50);
                        signinButton.setFocusPainted(false);
                        signinButton.addActionListener(this);
                        messagPanel.add(signinButton);


                workPanel=new JPanel();
                workPanel.setLayout(null);
                workPanel.setBackground(Color.WHITE);
                workPanel.setBounds(400, 0, 600, 650);
                workPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 94, 78), 5));
                loginMainPanel.add(workPanel);


                        create_Heading=new JLabel("Create Account");
                        create_Heading.setForeground(new Color(0, 94, 78));
                        create_Heading.setFont(new Font("Arial Black", Font.BOLD, 50));
                        create_Heading.setBounds(80, 50, 500, 50);
                        workPanel.add(create_Heading);

                                ImageIcon facebookIcon=new ImageIcon(ClassLoader.getSystemResource("images/icon/facebook1.png"));
                                Image face_img = facebookIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
                                ImageIcon face_icon_scaled = new ImageIcon(face_img);
                                JLabel face_icon_label = new JLabel(face_icon_scaled);
                                face_icon_label.setBounds(240,105,35,35);
                                workPanel.add(face_icon_label);

                                ImageIcon google_icon=new ImageIcon(ClassLoader.getSystemResource("images/icon/google.png"));
                                Image google_img = google_icon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
                                ImageIcon google_icon_scaled = new ImageIcon(google_img);
                                JLabel google_icon_label = new JLabel(google_icon_scaled);
                                google_icon_label.setBounds(300,105,35,35);
                                workPanel.add(google_icon_label);

                                ImageIcon linkedin_icon=new ImageIcon(ClassLoader.getSystemResource("images/icon/linkedin1.png"));
                                Image linkedin_img = linkedin_icon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
                                ImageIcon linkedin_icon_scaled = new ImageIcon(linkedin_img);
                                JLabel linkedin_icon_label = new JLabel(linkedin_icon_scaled);
                                linkedin_icon_label.setBounds(360,105,35,35);
                                workPanel.add(linkedin_icon_label);


                        sign_up_inst=new JLabel("Use your email for Registration");
                        sign_up_inst.setForeground(new Color(0, 94, 78));
                        sign_up_inst.setForeground(Color.DARK_GRAY);
                        sign_up_inst.setFont(new Font("Arial", Font.BOLD, 18));
                        sign_up_inst.setBounds(180, 150, 300, 50);
                        workPanel.add(sign_up_inst);

                        JLabel chooseAny=new JLabel("Create Account As :");
                        chooseAny.setForeground(new Color(0, 94, 78));
                        chooseAny.setFont(new Font("Arial", Font.BOLD, 20));
                        chooseAny.setBounds(50, 205, 200, 20);
                        workPanel.add(chooseAny);

                        choiceAsChoice=new Choice();
                                choiceAsChoice.add("Student");
                                choiceAsChoice.add("Service Provider");
                        choiceAsChoice.setBackground(new Color(0, 94, 78));
                        choiceAsChoice.setForeground(Color.WHITE);
                        choiceAsChoice.setFont(new Font("Arial", Font.BOLD, 20));
                        choiceAsChoice.setBounds(250, 200, 300, 20);
                        workPanel.add(choiceAsChoice);

                        JLabel fullName=new JLabel("Full Name : ");
                        fullName.setForeground(new Color(0, 94, 78));
                        fullName.setFont(new Font("Arial", Font.BOLD, 20));
                        fullName.setBounds(50, 250, 200, 20);
                        workPanel.add(fullName);

                        fullNameTextField=new JTextField();
                        fullNameTextField.setBackground(new Color(236, 227, 183));
                        fullNameTextField.setForeground(Color.BLACK);
                        fullNameTextField.setFont(new Font("Arial", Font.BOLD, 15));
                        fullNameTextField.setBounds(250, 250, 300, 30);
                        workPanel.add(fullNameTextField);

                        JLabel email=new JLabel("Email : ");
                        email.setForeground(new Color(0, 94, 78));
                        email.setFont(new Font("Arial", Font.BOLD, 20));
                        email.setBounds(50, 300, 200, 20);
                        workPanel.add(email);

                        emailTextField=new JTextField();
                        emailTextField.setBackground(new Color(236, 227, 183));
                        emailTextField.setForeground(Color.BLACK);
                        emailTextField.setFont(new Font("Arial", Font.BOLD, 15));
                        emailTextField.setBounds(250, 300, 300, 30);
                        workPanel.add(emailTextField);


                        JLabel password=new JLabel("Password : ");
                        password.setForeground(new Color(0, 94, 78));
                        password.setFont(new Font("Arial", Font.BOLD, 20));
                        password.setBounds(50, 350, 200, 20);
                        workPanel.add(password);

                        passwordField=new JPasswordField();
                        passwordField.setBackground(new Color(236, 227, 183));
                        passwordField.setForeground(Color.BLACK);
                        passwordField.setFont(new Font("Arial", Font.BOLD, 15));
                        passwordField.setBounds(250, 350, 300, 30);
                        workPanel.add(passwordField);


                        JLabel confirmPassword=new JLabel("Confirm Password : ");
                        confirmPassword.setForeground(new Color(0, 94, 78));
                        confirmPassword.setFont(new Font("Arial", Font.BOLD, 20));
                        confirmPassword.setBounds(50, 400, 200, 20);
                        workPanel.add(confirmPassword);

                        confirmPasswordField=new JPasswordField();
                        confirmPasswordField.setBackground(new Color(236, 227, 183));
                        confirmPasswordField.setForeground(Color.BLACK);
                        confirmPasswordField.setFont(new Font("Arial", Font.BOLD, 15));
                        confirmPasswordField.setBounds(250, 400, 300, 30);
                        workPanel.add(confirmPasswordField);

                        JLabel studentId=new JLabel("Student ID : ");
                        studentId.setForeground(new Color(0, 94, 78));
                        studentId.setFont(new Font("Arial", Font.BOLD, 20));
                        studentId.setBounds(50, 450, 200, 20);
                        workPanel.add(studentId);

                        studentIdTextField=new JTextField();
                        studentIdTextField.setBackground(new Color(236, 227, 183));
                        studentIdTextField.setForeground(Color.BLACK);
                        studentIdTextField.setFont(new Font("Arial", Font.BOLD, 15));
                        studentIdTextField.setBounds(250, 450, 300, 30);
                        workPanel.add(studentIdTextField);

                        JLabel serviceProviderId=new JLabel("Pan Card :");
                        serviceProviderId.setForeground(new Color(0, 94, 78));
                        serviceProviderId.setFont(new Font("Arial", Font.BOLD, 20));
                        serviceProviderId.setBounds(50, 450, 200, 20);
                        workPanel.add(serviceProviderId);

                        serviceProviderIdTextField=new JTextField();
                        serviceProviderIdTextField.setBackground(new Color(236, 227, 183));
                        serviceProviderIdTextField.setForeground(Color.BLACK);
                        serviceProviderIdTextField.setFont(new Font("Arial", Font.BOLD, 15));
                        serviceProviderIdTextField.setBounds(250, 450, 300, 30);
                        workPanel.add(serviceProviderIdTextField);    


                        choiceAsChoice.addItemListener(new ItemListener() {
                            @Override
                            public void itemStateChanged(ItemEvent e) {
                                if(choiceAsChoice.getSelectedItem().equals("Student"))
                                {
                                    studentId.setVisible(true);
                                    // studentIdTextField.setEditable(true);
                                    studentIdTextField.setVisible(true);
                                    serviceProviderId.setVisible(false);                                    
                                    serviceProviderIdTextField.setVisible(false);
                                    
                                }
                                else
                                {
                                    studentId.setVisible(false);
                                    studentIdTextField.setVisible(false);
                                    serviceProviderId.setVisible(true);
                                    // serviceProviderIdTextField.setEditable(true);
                                    serviceProviderIdTextField.setVisible(true);
                                }
                            }

                            
                        });

                        JLabel picture=new JLabel("Upload Picture");
                        picture.setForeground(new Color(0, 94, 78));
                        picture.setFont(new Font("Arial", Font.BOLD, 20));
                        picture.setBounds(50, 500, 200, 20);
                        workPanel.add(picture);

                        picTextField=new JTextField();
                        picTextField.setBackground(new Color(236, 227, 183));
                        picTextField.setForeground(Color.BLACK);
                        picTextField.setFont(new Font("Arial", Font.BOLD, 15));
                        picTextField.setBounds(250, 500, 200, 30);
                        workPanel.add(picTextField);

                        upload_pictureButton=new JButton("Upload");
                        upload_pictureButton.setBackground(new Color(0, 94, 78));
                        upload_pictureButton.setForeground(Color.WHITE);
                        upload_pictureButton.setFocusPainted(false);
                        upload_pictureButton.setFont(new Font("Arial", Font.BOLD, 20));
                        upload_pictureButton.setBounds(450, 500, 100, 30);
                        upload_pictureButton.addActionListener(this);
                        workPanel.add(upload_pictureButton);


                        
                            

                            signupButton=new JButton("Sign Up");
                            signupButton.setBackground(new Color(0, 94, 78));
                            signupButton.setForeground(Color.WHITE);
                            signupButton.setFocusPainted(false);
                            signupButton.setFont(new Font("Arial", Font.BOLD, 20));
                            signupButton.setBounds(250, 550, 150, 40);
                            workPanel.add(signupButton);
                        

                        // signupButton=new JButton("Sign Up");
                        // signupButton.setBackground(new Color(0, 94, 78));
                        // signupButton.setForeground(Color.WHITE);
                        // signupButton.setFont(new Font("Arial", Font.BOLD, 20));
                        // signupButton.setBounds(250, 450, 150, 40);
                        // workPanel.add(signupButton);







        setVisible(true);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) 
    {
        if(e.getSource()==signinButton)
        {
            loginMainPanel.removeAll();
            JLabel jl=new Login().loginPage();
            loginMainPanel.add(jl);
            loginMainPanel.revalidate();
            loginMainPanel.repaint();            
        }

        if(e.getSource()==upload_pictureButton)
        {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            picTextField.setText(filename);
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
