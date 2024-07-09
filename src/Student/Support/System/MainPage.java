package Student.Support.System;

//import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame implements ActionListener  {
    private JPanel mainPannel, topPanel, imagePanel, contentPanel, menuBar, sideBar,tabPanel;
    private JScrollPane contentScrollPane; // Added for scrolling
    private JButton homeBtn, aboutBtn, collegeBtn, courseBtn, createBtn;
    private JTabbedPane tabbedPane;
    private JLabel addhm;


    MainPage()
    {
        setTitle("-----------Student Support System----------");
//        setLayout(null);
        setBounds(100,100,845,1700);
        setLocation(300, 15);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






//===============-----------Create Main_panel for Scroll Page------------=================
        mainPannel=new JPanel();
        mainPannel.setLayout(null);
        mainPannel.setBounds(5,5,835,1700);





//===============-----------Create Top panel for logo------------=================
        topPanel = new JPanel();
        topPanel.setLayout(null);
        topPanel.setBounds(5,5,800,101);
        topPanel.setBackground(Color.gray);
        topPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        mainPannel.add(topPanel);

//==============------------add logo image--------------------================
        Header1 h1=new Header1();
        JLabel logo = h1.logoSet();
        logo.setBounds(0, 0, 250, 100);
        topPanel.add(logo);

                JTextField searField=new JTextField("Search Colleges or Courses");
                searField.setBounds(300, 25, 400, 40);
                searField.setForeground(Color.GRAY);
                searField.setCaretColor(Color.GRAY);
                searField.setFont(new Font("Times New Roman",Font.BOLD, 20));
                topPanel.add(searField);

                ImageIcon searchIcon=new ImageIcon(ClassLoader.getSystemResource("images/icon/search.png"));
                Image search_img = searchIcon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
                ImageIcon searchIcon2 = new ImageIcon(search_img);
                JLabel search_Label = new JLabel(searchIcon2);
                search_Label.setBounds(365, 7, 30, 30);
                searField.add(search_Label);


//===================---------- Set Images of College--------------======================
        imagePanel=new JPanel();
        imagePanel.setLayout(null);
        imagePanel.setBounds(5,101,800,300);
        mainPannel.add(imagePanel);

//----------------------Lable set on Pannel  //image set-----------------------------
        ImageNavigator pics=new ImageNavigator();
        JLabel imgpic=pics.picSet();
        imagePanel.add(imgpic);





//==========-----------Set MenuBar-----------================

        menuBar=new JPanel();
        menuBar.setLayout(null);
        menuBar.setBounds(5, 401, 800, 40);
        menuBar.setBackground(new Color(0, 94, 78));
//        menuBar.setBackground(new Color(0, 94, 78));
        menuBar.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        mainPannel.add(menuBar);

        //==============------------Create Button for Menu----------------========================

        homeBtn=new JButton("Home");
        homeBtn.setFont(new Font("Arial", Font.BOLD, 20));
        homeBtn.setBounds(0, 0, 160, 40);
        homeBtn.setBackground(new Color(0, 94, 78));
//        homeBtn.setBaackground(Color.decode("#3CB371"));
        //                        homeBtn.setBorderPainted(false);
        // homeBtn.setContentAreaFilled(false);
        homeBtn.setFocusPainted(false);
        homeBtn.setForeground(Color.black);
        homeBtn.addActionListener(this);
        menuBar.add(homeBtn);

        aboutBtn=new JButton("About");
        aboutBtn.setFont(new Font("Arial", Font.BOLD, 20));
        aboutBtn.setBounds(160, 0, 160, 40);
        //                        aboutBtn.setBorderPainted(false);
        aboutBtn.setBackground(new Color(0, 94, 78));
        aboutBtn.setFocusPainted(false);
        aboutBtn.setForeground(Color.BLACK);
        aboutBtn.addActionListener(this);
        menuBar.add(aboutBtn);

        collegeBtn=new JButton("Colleges");
        collegeBtn.setFont(new Font("Arial", Font.BOLD, 20));
        collegeBtn.setBounds(320, 0, 160, 40);
        //      collegeBtn.setBorderPainted(false);
        collegeBtn.setBackground(new Color(0, 94, 78));
        collegeBtn.setFocusPainted(false);
        collegeBtn.setForeground(Color.black);
        // collegeBtn.setBackground(Color.cyan);
        collegeBtn.addActionListener(this);
        menuBar.add(collegeBtn);

        courseBtn=new JButton("Courses");
        courseBtn.setFont(new Font("Arial", Font.BOLD, 20));
        courseBtn.setBounds(480, 0, 160, 40);
        //                        courseBtn.setBorderPainted(false);
        courseBtn.setBackground(new Color(0, 94, 78));
        // courseBtn.setContentAreaFilled(false);
        courseBtn.setFocusPainted(false);
        courseBtn.setForeground(Color.black);
        courseBtn.addActionListener(this);
        menuBar.add(courseBtn);

        createBtn = new JButton("Create");
        // create.setBackground(new Color(66,127,219));
        createBtn.setBackground(new Color(0, 94, 78));
        createBtn.setForeground(Color.black);
        createBtn.setFont(new Font("Arial", Font.BOLD, 20));
        createBtn.setBounds(640, 0, 160, 40);
        // create.setBorderPainted(false);
        // create.setContentAreaFilled(false);
        createBtn.setFocusPainted(false);
        createBtn.addActionListener(this);
        menuBar.add(createBtn);

//==========-----------create a panel which hold SideBar and TabPanel-----------================

        contentPanel=new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBounds(5, 440, 800, 500);
        // contentPanel.setBorder(BorderFactory.createLineBorder(Color.cyan, 10));
        mainPannel.add(contentPanel);


//==========-----------Set SideBar-----------================

        sideBar=new JPanel();
        sideBar.setBounds(0, 1, 200, 500);
        sideBar.setBackground(new Color(0, 94, 78));
        sideBar.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        contentPanel.add(sideBar);

                String topColleges_String="<html><p style=\"text-align: justify;\">" +
                                        "<marquee>"+"<u>"+"Top 5 Colleges in India<br>"+"</u>"+"</marquee>"+
                                        "<ul>"+
                                        "<li>IIT Madras.</li>"+
                                        "<li>IIM Ahmedabad.</li>"+
                                        "<li>IIM Bangalore.</li>"+
                                        "<li>IIM Kolkata.</li>"+
                                        "<li>IIT Delhi.</li>"+
                                        "</ul>"+
                                        "</p></html>";
        //------------Create Pannel for Description and used on TabbedPan----------------

                        JLabel topCollegLabel=new JLabel(topColleges_String);
                        topCollegLabel.setFont(new Font("Arial", Font.BOLD, 17));
                        topCollegLabel.setBounds(0, 0, 200, 150);
                        topCollegLabel.setForeground(Color.white);
                        sideBar.add(topCollegLabel);


                        String topCourses_String="<html><p style=\"text-align: justify;\">" +
                                        "<marquee>"+"<u>"+"Top 5 Courses in India<br>"+"</u>"+"</marquee>"+
                                        "<ul>"+
                                        "<li>B.Tech.</li>"+
                                        "<li>MBBS.</li>"+
                                        "<li>Nursing.</li>"+
                                        "<li>Agriculture.</li>"+
                                        "<li>MCA.</li>"+
                                        "</ul>"+
                                        "</p></html>";

                        JLabel topCoursesLabel=new JLabel(topCourses_String);
                        topCoursesLabel.setFont(new Font("Arial", Font.BOLD, 17));
                        topCoursesLabel.setBounds(0, 150, 200, 150);
                        topCoursesLabel.setForeground(Color.white);
                        sideBar.add(topCoursesLabel);

                        String topExam_String="<html><p style=\"text-align: justify;\">" +
                                        "<marquee>"+"<u>"+"Top 5 Exam in India<br>"+"</u>"+"</marquee>"+
                                        "<ul>"+
                                        "<li>JEE Mains.</li>"+
                                        "<li>NEET.</li>"+
                                        "<li>CUET.</li>"+
                                        "<li>NIMCET.</li>"+
                                        "<li>UPTU.</li>"+
                                        "</ul>"+
                                        "</p></html>";

                        JLabel topExamLabel=new JLabel(topExam_String);
                        topExamLabel.setFont(new Font("Arial", Font.BOLD, 17));
                        topExamLabel.setBounds(0, 300, 200, 150);
                        topExamLabel.setForeground(Color.white);
                        sideBar.add(topExamLabel);







//------------Create Pannel for Description and used on TabbedPan----------------

        tabPanel=new JPanel();
        tabPanel.setLayout(null);
        tabPanel.setBounds(200,1,600,500);
        tabPanel.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        contentPanel.add(tabPanel);

//===============-----------Add Home Page---------------=================

        Home hm=new Home();
        addhm=hm.addHomePanel();
        addhm.setBounds(4, 10, 595, 490);
        addhm.setFont(new Font("Arial", Font.BOLD, 20));
        tabPanel.add(addhm);


//                addhm=hm.addParagraph();
//        //        addhm.setLayout(null);
//                addhm.setBounds(20, -90, 565, 490);
//                addhm.setFont(new Font("Arial", Font.BOLD, 20));
//                tabPanel.add(addhm);



//=============-------------------add Paragraph---------------------==================

        add(mainPannel);
        setMinimumSize(mainPannel.getPreferredSize());


//====================-------------------add Scroll Bar-------------------=========================//

// Create a JViewport and set its size to match the size of the JScrollPane
        JViewport viewport = new JViewport();
        viewport.setView(mainPannel);



// Create a custom ScrollPaneLayout with a larger view size



        // Create a JScrollPane and set its viewport to the JViewport
        JScrollPane scrollPane = new JScrollPane(viewport);
        scrollPane.setBounds(5, 5, 835, 1700);
        add(scrollPane);
        // Set the preferred size of the mainPannel to be larger than the size of the JScrollPane
        viewport.setPreferredSize(new Dimension(835, 1700));





        setVisible(true);

    }




    @Override
    public void actionPerformed(ActionEvent e)
    {


        try {
            if(e.getSource()==homeBtn)
            {
                contentPanel.removeAll();
                contentPanel.add(sideBar);
                contentPanel.add(tabPanel);
                tabPanel.removeAll(); // clear the tabPanel
                JLabel result = new Home().addHomePanel();
                tabPanel.add(result);
                tabPanel.revalidate();
                tabPanel.repaint();

                //===========-------------set Decoration on Button---------==========
                homeBtn.setBackground(Color.RED);
                homeBtn.setForeground(Color.WHITE);
                aboutBtn.setBackground(new Color(0, 94, 78));
                collegeBtn.setBackground(new Color(0, 94, 78));
                courseBtn.setBackground(new Color(0, 94, 78));
                createBtn.setBackground(new Color(0, 94, 78));

                aboutBtn.setForeground(Color.BLACK);
                collegeBtn.setForeground(Color.BLACK);
                courseBtn.setForeground(Color.BLACK);
                createBtn.setForeground(Color.BLACK);

                // // tabPanel.removeAll();
                // JLabel result = new Home().addHomePanel();
                // addhm.removeAll();
                // addhm.add(result);
                // addhm.revalidate();
                // addhm.repaint();


                // addhm.setText(new Home().addsParagraph());

                // addhm.setText(new About().aboutPage());



            }
            else if(e.getSource()==aboutBtn)
            {
                tabPanel.removeAll(); // clear the tabPanel
                JLabel aboutPanel = new About().addAboutPanel();
                tabPanel.add(aboutPanel);
                tabPanel.revalidate();
                tabPanel.repaint();

                //========---------set Decoration on Buttons--------==========
                aboutBtn.setBackground(Color.RED);
                aboutBtn.setForeground(Color.WHITE);
                //set all button background instead of about Button
                homeBtn.setBackground(new Color(0, 94, 78));
                collegeBtn.setBackground(new Color(0, 94, 78));
                courseBtn.setBackground(new Color(0, 94, 78));
                createBtn.setBackground(new Color(0, 94, 78));
                //set all button color instead of about Button
                homeBtn.setForeground(Color.BLACK);
                collegeBtn.setForeground(Color.BLACK);
                courseBtn.setForeground(Color.BLACK);
                createBtn.setForeground(Color.BLACK);



                // tabPanel.removeAll();
                // addhm.removeAll();
                // addhm.setText(new About().aboutPage());
                // addhm.revalidate();
                // addhm.repaint();


                //  addhm.setText(new About().aboutPage());
                //  About about = new About();
                // JLabel aboutPanel = about.aboutPage();
                // tabPanel.add(aboutPanel);
                // // Update the selected component of the tabbed pane
                // tabbedPane.setSelectedComponent(aboutPanel);
            }
            else if(e.getSource()==collegeBtn)
            {
                // contentPanel.removeAll(); // clear the Content Panel
                new Colleges();
            }
            else if (e.getSource()==courseBtn) {
                // contentPanel.removeAll(); // clear the Content Panel
                new Coursees();

            }
            else if (e.getSource()==createBtn)
            {
                new SignUp();

//                contentPanel.removeAll(); // clear the Content Panel
//                JLabel loginJLabel=new Login().loginPage();
//                contentPanel.add(loginJLabel);
//                contentPanel.revalidate();
//                contentPanel.repaint();
//
//                //========---------set Decoration on Buttons--------==========
//                        createBtn.setBackground(Color.RED);
//                        createBtn.setForeground(Color.WHITE);
//                        //set all button background instead of about Button
//                        homeBtn.setBackground(new Color(0, 94, 78));
//                        collegeBtn.setBackground(new Color(0, 94, 78));
//                        courseBtn.setBackground(new Color(0, 94, 78));
//                        aboutBtn.setBackground(new Color(0, 94, 78));
//                        //set all button color instead of about Button
//                        homeBtn.setForeground(Color.BLACK);
//                        collegeBtn.setForeground(Color.BLACK);
//                        courseBtn.setForeground(Color.BLACK);
//                        aboutBtn.setForeground(Color.BLACK);
            }

        }catch (RuntimeException E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new MainPage();
    }
}