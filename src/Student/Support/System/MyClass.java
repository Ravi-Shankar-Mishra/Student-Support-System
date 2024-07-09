package Student.Support.System;

//import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class MyClass {
    private JPanel topPanel, imagePanel, contentPanel, menuBar, sideBar,bordr,tabPanel;
    private JButton homeBtn, aboutBtn, collegeBtn;
    private JTabbedPane tabbedPane;
    //    private JScrollPane contentScrollPane; // Added for scrolling
//   private JLabel imgpic;


    MyClass()
    {
        JFrame f=new JFrame();
        f.setTitle("-----------Student Support System----------");
        f.setLayout(new BorderLayout());
        f.setBounds(0,0,845,1700);
//        setSize(845,1700);
        f.setLocation(300, 15);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//===============-----------Create Top panel for logo------------=================
        topPanel = new JPanel();
        topPanel.setBounds(5,5,800,100);
        topPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        topPanel.setLayout(null);
        f.add(topPanel);

        //------------add logo image--------------------

        ImageIcon imglogo = new ImageIcon(ClassLoader.getSystemResource("images/logos.png"));
        Image imglg = imglogo.getImage().getScaledInstance(250, 100, Image.SCALE_DEFAULT);
        ImageIcon newlogo = new ImageIcon(imglg);
        JLabel logo = new JLabel(newlogo);
        logo.setBounds(0, 0, 250, 100);
        topPanel.add(logo);


//===================---------- Set Images of College--------------======================
        imagePanel=new JPanel();
        imagePanel.setLayout(null);
        imagePanel.setBounds(5,101,800,300);
        f.add(imagePanel);
        //image set
//----------------------Lable set on Pannel-----------------------------
        ImageNavigator pics=new ImageNavigator();
        JLabel imgpic=pics.picSet();
        imagePanel.add(imgpic);


//==========-----------Set Border below-----------================
//        bordr=new JPanel();
//        bordr.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
//        bordr.setBounds(5,401,800,3);
//        add(bordr);




//==========-----------Set SideBar-----------================

        sideBar=new JPanel();
        sideBar.setBounds(5, 402, 200, 500);
        sideBar.setBackground(Color.decode("#3CB371"));
        sideBar.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        f.add(sideBar);



//==========-----------Set MenuBar-----------================

        menuBar=new JPanel();
        menuBar.setLayout(null);
        menuBar.setBounds(205, 402, 600, 40);
        menuBar.setBackground(Color.decode("#3CB371"));
//        menuBar.setBackground(Color.decode("#808000"));
        menuBar.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        f.add(menuBar);

//------------Create Button for Menu----------------

        homeBtn=new JButton("Home");
        homeBtn.setFont(new Font("Arial", Font.BOLD, 20));
        homeBtn.setBounds(2, 0, 100, 40);
        homeBtn.setBorderPainted(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setFocusPainted(false);
        homeBtn.setForeground(Color.black);
        homeBtn.setBackground(Color.cyan);
        menuBar.add(homeBtn);

        aboutBtn=new JButton("About");
        aboutBtn.setFont(new Font("Arial", Font.BOLD, 20));
        aboutBtn.setBounds(104, 0, 100, 40);
        aboutBtn.setBorderPainted(false);
        aboutBtn.setContentAreaFilled(false);
        aboutBtn.setFocusPainted(false);
        aboutBtn.setForeground(Color.BLACK);
        menuBar.add(aboutBtn);

        collegeBtn=new JButton("Colleges");
        collegeBtn.setFont(new Font("Arial", Font.BOLD, 20));
        collegeBtn.setBounds(206, 0, 120, 40);
        collegeBtn.setBorderPainted(false);
        collegeBtn.setContentAreaFilled(false);
        collegeBtn.setFocusPainted(false);
        collegeBtn.setForeground(Color.black);
        collegeBtn.setBackground(Color.cyan);
        menuBar.add(collegeBtn);


//------------Create TabbedPane for Description----------------

//        tabbedPane=new JTabbedPane();
////        tabbedPane.setLayout(null);
//        tabbedPane.setBounds(205,440,600,500);
//        tabbedPane.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
//        f.add(tabbedPane);


//------------Create Pannel for Description and used on TabbedPan----------------

        tabPanel=new JPanel();
        tabPanel.setLayout(null);
        tabPanel.setBounds(205,441,550,500);
        tabPanel.setBorder(BorderFactory.createLineBorder(Color.cyan, 10));
        f.add(tabPanel);

        //=============-------------------add Paragraph---------------------==================

        String paragraphText = "<html><p style=\"text-align: justify;\">" +
                "This is your paragraph content. You can add line breaks \"This is your paragraph content. You can add line breaks " +
                "using `<br>`. However, advanced formatting options " +
                "like bold or italics are not supported with this approach." +
                "</p></html>";

        JLabel paragraphLabel = new JLabel(paragraphText);
        paragraphLabel.setBounds(20, -50, 500, 200);
        tabPanel.add(paragraphLabel);







        //  Border border = BorderFactory.createLineBorder(Color.BLACK, 1); // Customize color and thickness
        //  ((JComponent) getContentPane()).setBorder(border);
//        setLayout(new FlowLayout());




        contentPanel=new JPanel();
        JScrollPane contentScrollPane = new JScrollPane(contentPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        contentScrollPane.setBounds(810, 0, 20, 1700);
//
        // Add JScrollPane to the frame
        f.add(contentScrollPane);


//        pack();
        f.setVisible(true);

    }



    public static void main(String[] args) {

        new MyClass();
    }
}