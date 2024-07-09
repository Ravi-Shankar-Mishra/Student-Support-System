package Student.Support.System;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class Home extends JFrame implements ActionListener{
        private JButton iirfButton, nirf_Button, top_Rank_College_India; //ranking
        private JButton mca_Colleges_India, b_Tech_Colleges_India, discover_Top_Colleges_India; //college
        private JButton b_Tech_Exam, mca_Exam, check_Exam; //exam
    public JLabel addParagraph()
    {
//        setLayout(null);
        String paragraphText = "<html><p style=\"text-align: justify;\">" +
                "This project offers a comprehensive platform designed to simplify your transition into college life. It connects you with everything you need – from examing suitable accommodation and reliable transportation to exploring college options.<br>\"+\r\n" + //
                                                "                \"In this project, there are four sections named : <br>\"+\r\n" + //
                                                "                \"<ul>\"+\r\n" + //
                                                "                \"<li>Student Section.</li>\"+\r\n" + //
                                                "                \"<li>Room Owner Section.</li>\"+\r\n" + //
                                                "                \"<li>Transport Section.</li>\"+\r\n" + //
                                                "                \"<li>College Section.</li>\"+\r\n" + //
                                                "                \"</ul> "+
                "</p></html>";

        JLabel paragraphLabel = new JLabel(paragraphText);
//        paragraphLabel.setLayout(null);
        paragraphLabel.setBounds(20, 0, 500, 200);
        add(paragraphLabel);
        return paragraphLabel;
    }
    public String addsParagraph()
    {
//        setLayout(null);
        String paragraphText = "<html><p style=\"text-align: justify;\">" +
                "This project offers a comprehensive platform designed to simplify your transition into college life. It connects you with everything you need – from examing suitable accommodation and reliable transportation to exploring college options.<br>"+
                "In this project, there are four sections named : <br>"+
                "<ul>"+
                "<li>Student Section.</li>"+
                "<li>Room Owner Section.</li>"+
                "<li>Transport Section.</li>"+
                "<li>College Section.</li>"+
                "</ul>"+
                "</p></html>";
        return paragraphText;
    }

    public JLabel addHomePanel()
    {

        JLabel homePanel=new JLabel();   // create label for contain all data
        homePanel.setLayout(null);
        homePanel.setBounds(4,10,595,450);
        // homePanel.setBorder(BorderFactory.createLineBorder(Color.RED, 1));


//=================------------ panel for hold Ranking System-----------==========================
//left - 1
        JPanel college_Ranking=new JPanel();
        college_Ranking.setLayout(null);
        college_Ranking.setBounds(3,5,290,215);
        college_Ranking.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        homePanel.add(college_Ranking);

                //add data into the Panel
                JPanel rankPanel=new JPanel();
                rankPanel.setLayout(null);
                rankPanel.setBounds(1,1,288,99);
                rankPanel.setBackground(new Color(236, 227, 183));
                // rankPanel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                college_Ranking.add(rankPanel);

                        //add data into the Panel
                        JLabel college_Ranking_label=new JLabel("College Ranking");
                        college_Ranking_label.setForeground(Color.RED);
                        college_Ranking_label.setFont(new Font("Tahoma", Font.BOLD, 20));
                        college_Ranking_label.setBounds(5, 1, 250, 30);
                        // college_Ranking_label.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                        rankPanel.add(college_Ranking_label);


                        JLabel rank_Desc=new JLabel("College ranked based");
                        rank_Desc.setForeground(Color.blue);
                        rank_Desc.setFont(new Font("Courier New", Font.BOLD, 15));
                        rank_Desc.setBounds(5, 35, 200, 15);
                        rankPanel.add(rank_Desc);

                        JLabel rank_Desc2=new JLabel("on real data.");
                        rank_Desc2.setForeground(Color.blue);
                        rank_Desc2.setFont(new Font("Courier New", Font.BOLD, 15));
                        rank_Desc2.setBounds(5, 51, 200, 16);
                        rankPanel.add(rank_Desc2);



                                //add images
                                ImageIcon rank_icon=new ImageIcon(ClassLoader.getSystemResource("images/Ranks.png"));
                                Image rank_img = rank_icon.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
                                ImageIcon rank_icon_scaled = new ImageIcon(rank_img);
                                JLabel rank_icon_label = new JLabel(rank_icon_scaled);
                                rank_icon_label.setBounds(175,8,100,90);
                                rankPanel.add(rank_icon_label);

                JPanel rankPanel2=new JPanel();
                rankPanel2.setLayout(null);
                rankPanel2.setBounds(1,100,288,114);
                rankPanel2.setBackground(new Color(185, 191, 188));
                // rankPanel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                college_Ranking.add(rankPanel2);

                        iirfButton=new JButton("   IIRF    >");
                        // iirfButton.setContentAreaFilled(false);
                        iirfButton.setBackground(new Color(191, 188, 193));
                        iirfButton.setFocusPainted(false);
                        iirfButton.setForeground(Color.BLACK);
                        iirfButton.setFont(new Font("Arial", Font.BOLD, 15));
                        iirfButton.setBounds(5, 5, 100, 20);
                        iirfButton.addActionListener(this);
                        rankPanel2.add(iirfButton);


                        nirf_Button=new JButton("   NIRF    >");
                        // iirfButton.setContentAreaFilled(false);
                        nirf_Button.setBackground(new Color(191, 188, 193));
                        nirf_Button.setFocusPainted(false);
                        nirf_Button.setForeground(Color.BLACK);
                        nirf_Button.setFont(new Font("Arial", Font.BOLD, 15));
                        nirf_Button.setBounds(5, 40, 120, 20);
                        nirf_Button.addActionListener(this);
                        rankPanel2.add(nirf_Button);

                        JButton top_Rank_College_India=new JButton("Top Colleges in India    >");
                        // iirfButton.setContentAreaFilled(false);
                        top_Rank_College_India.setBackground(new Color(191, 188, 193));
                        top_Rank_College_India.setFocusPainted(false);
                        top_Rank_College_India.setForeground(Color.BLACK);
                        top_Rank_College_India.setFont(new Font("Arial", Font.BOLD, 15));
                        top_Rank_College_India.setBounds(5, 80, 210, 20);
                        top_Rank_College_India.addActionListener(this);
                        rankPanel2.add(top_Rank_College_India);
                        







//=================------------create panel for course Colleges-----------==========================
//right - 1
        JPanel find_College=new JPanel();
        find_College.setLayout(null);
        find_College.setBounds(300,5,290,215);
        find_College.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        homePanel.add(find_College);

                //add data into the Panel
                JPanel find_Panel=new JPanel();
                find_Panel.setLayout(null);
                find_Panel.setBounds(1,1,288,100);
                find_Panel.setBackground(new Color(236, 227, 183));
                // find_Panel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                find_College.add(find_Panel);

                        //add data into the Panel
                        JLabel find_Label=new JLabel("Find Colleges");
                        find_Label.setForeground(Color.RED);
                        find_Label.setFont(new Font("Courier New", Font.BOLD, 20));
                        find_Label.setBounds(5, 1, 250, 30);
                        // college_Ranking_label.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                        find_Panel.add(find_Label);

                        JLabel search_Desc=new JLabel("Discover 1 lac+ ");
                        search_Desc.setForeground(Color.blue);
                        search_Desc.setFont(new Font("Courier New", Font.BOLD, 15));
                        search_Desc.setBounds(5, 35, 230, 15);
                        find_Panel.add(search_Desc);

                        JLabel search_Desc2=new JLabel("Colleges via");
                        search_Desc2.setForeground(Color.blue);
                        search_Desc2.setFont(new Font("Courier New", Font.BOLD, 15));
                        search_Desc2.setBounds(5, 51, 200, 16);
                        find_Panel.add(search_Desc2);

                        JLabel search_Desc3=new JLabel("preference.");
                        search_Desc3.setForeground(Color.blue);
                        search_Desc3.setFont(new Font("Courier New", Font.BOLD, 15));
                        search_Desc3.setBounds(5, 66, 200, 16);
                        find_Panel.add(search_Desc3);

                                //add images
                                ImageIcon find_icon=new ImageIcon(ClassLoader.getSystemResource("images/search.png"));
                                Image find_img = find_icon.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
                                ImageIcon find_icon_scaled = new ImageIcon(find_img);
                                JLabel find_icon_label = new JLabel(find_icon_scaled);
                                find_icon_label.setBounds(183,5,100,90);
                                find_Panel.add(find_icon_label);

                JPanel find_Pannel2=new JPanel();
                find_Pannel2.setLayout(null);
                find_Pannel2.setBounds(1,100,288,114);
                find_Pannel2.setBackground(new Color(185, 191, 188));
                // rankPanel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                find_College.add(find_Pannel2);                                           
                
                        mca_Colleges_India=new JButton(" Best MCA College in India");
                         // iirfButton.setContentAreaFilled(false);
                        mca_Colleges_India.setBackground(new Color(191, 188, 193));
                        mca_Colleges_India.setFocusPainted(false);
                        mca_Colleges_India.setForeground(Color.BLACK);
                        mca_Colleges_India.setFont(new Font("Arial", Font.BOLD, 15));
                        mca_Colleges_India.setBounds(5, 5, 200, 20);
                        mca_Colleges_India.addActionListener(this);
                        find_Pannel2.add(mca_Colleges_India);
                                        
                
                
                        b_Tech_Colleges_India=new JButton("Best B.Tech Colleges in India");
                        // iirfButton.setContentAreaFilled(false);
                        b_Tech_Colleges_India.setBackground(new Color(191, 188, 193));
                        b_Tech_Colleges_India.setFocusPainted(false);
                        b_Tech_Colleges_India.setForeground(Color.BLACK);
                        b_Tech_Colleges_India.setFont(new Font("Arial", Font.BOLD, 15));
                        b_Tech_Colleges_India.setBounds(5, 40, 120, 20);
                        b_Tech_Colleges_India.addActionListener(this);
                        find_Pannel2.add(b_Tech_Colleges_India);
                        
                
                        discover_Top_Colleges_India=new JButton("Discover Top Colleges in India    >");
                        // iirfButton.setContentAreaFilled(false);
                        discover_Top_Colleges_India.setBackground(new Color(191, 188, 193));
                        discover_Top_Colleges_India.setFocusPainted(false);
                        discover_Top_Colleges_India.setForeground(Color.BLACK);
                        discover_Top_Colleges_India.setFont(new Font("Arial", Font.BOLD, 15));
                        discover_Top_Colleges_India.setBounds(5, 80, 210, 20);
                        discover_Top_Colleges_India.addActionListener(this);
                        find_Pannel2.add(discover_Top_Colleges_India);



//=================------------create panel for Entrace Exam-----------==========================
//left - 2
        JPanel exam_College=new JPanel();
        exam_College.setLayout(null);
        exam_College.setBounds(3,230,290,215);
        exam_College.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        homePanel.add(exam_College);

         //add data into the Panel----------------------=================
                JPanel exam_Panel=new JPanel();
                exam_Panel.setLayout(null);
                exam_Panel.setBounds(1,1,288,100);
                exam_Panel.setBackground(new Color(187, 248, 224));
                // exam_Panel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                exam_College.add(exam_Panel);

                        //add data into the Panel
                        JLabel exam_Label=new JLabel("Exam");
                        exam_Label.setForeground(Color.RED);
                        exam_Label.setFont(new Font("Tahoma", Font.BOLD, 20));
                        exam_Label.setBounds(5, 1, 250, 30);
                        // college_Ranking_label.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                        exam_Panel.add(exam_Label);

                        JLabel exam_Desc=new JLabel("Know more about your");
                        exam_Desc.setForeground(Color.blue);
                        exam_Desc.setFont(new Font("Courier New", Font.BOLD, 15));
                        exam_Desc.setBounds(5, 35, 230, 15);
                        exam_Panel.add(exam_Desc);

                        JLabel exam_Desc2=new JLabel("exam.");
                        exam_Desc2.setForeground(Color.blue);
                        exam_Desc2.setFont(new Font("Courier New", Font.BOLD, 15));
                        exam_Desc2.setBounds(5, 51, 200, 16);
                        exam_Panel.add(exam_Desc2);

                                //add images
                                ImageIcon exam_icon=new ImageIcon(ClassLoader.getSystemResource("images/examms.png"));
                                Image exam_img = exam_icon.getImage().getScaledInstance(100, 90, Image.SCALE_SMOOTH);
                                ImageIcon exam_icon_scaled = new ImageIcon(exam_img);
                                JLabel exam_icon_label = new JLabel(exam_icon_scaled);
                                // exam_icon_label.setSize(100,100);
                                exam_icon_label.setBounds(175,8,100,90);
                                exam_Panel.add(exam_icon_label);

                JPanel exam_Panel2=new JPanel();
                exam_Panel2.setLayout(null);
                exam_Panel2.setBounds(1,100,288,114);
                exam_Panel2.setBackground(new Color(185, 191, 188));
                // rankPanel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                exam_College.add(exam_Panel2);

                        b_Tech_Exam=new JButton("B.Tech");
                        // iirfButton.setContentAreaFilled(false);
                        b_Tech_Exam.setBackground(new Color(191, 188, 193));
                        b_Tech_Exam.setFocusPainted(false);
                        b_Tech_Exam.setForeground(Color.BLACK);
                        b_Tech_Exam.setFont(new Font("Arial", Font.BOLD, 15));
                        b_Tech_Exam.setBounds(5, 5, 100, 20);
                        b_Tech_Exam.addActionListener(this);
                        exam_Panel2.add(b_Tech_Exam);         
                                
                                
                        mca_Exam=new JButton("MCA");
                        // iirfButton.setContentAreaFilled(false);
                        mca_Exam.setBackground(new Color(191, 188, 193));
                        mca_Exam.setFocusPainted(false);
                        mca_Exam.setForeground(Color.BLACK);
                        mca_Exam.setFont(new Font("Arial", Font.BOLD, 15));
                        mca_Exam.setBounds(5, 40, 120, 20);
                        mca_Exam.addActionListener(this);
                        exam_Panel2.add(mca_Exam);
                        

                        check_Exam=new JButton("Check All Entrance Exam >");
                        // iirfButton.setContentAreaFilled(false);
                        check_Exam.setBackground(new Color(191, 188, 193));
                        check_Exam.setFocusPainted(false);
                        check_Exam.setForeground(Color.BLACK);
                        check_Exam.setFont(new Font("Arial", Font.BOLD, 15));
                        check_Exam.setBounds(5, 80, 210, 20);
                        check_Exam.addActionListener(this);
                        exam_Panel2.add(check_Exam);




//=================------------create panel for exam Courses-----------==========================
//right - 2
        JPanel course_examer=new JPanel();
        course_examer.setLayout(null);
        course_examer.setBounds(300,230,290,215);
        course_examer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        homePanel.add(course_examer);

                //add data into the Panel
                JPanel course_Panel=new JPanel();
                course_Panel.setLayout(null);
                course_Panel.setBounds(1,1,288,100);
                course_Panel.setBackground(new Color(187, 248, 224));
                // course_Panel.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
                course_examer.add(course_Panel);

                        //add data into the Panel
                        JLabel course_Label=new JLabel("Courses");
                        course_Label.setForeground(Color.RED);
                        course_Label.setFont(new Font("Tahoma", Font.BOLD, 20));
                        course_Label.setBounds(5, 1, 250, 30);
                        // college_Ranking_label.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                        course_Panel.add(course_Label);

                        JLabel course_Desc=new JLabel("Discover top colleges ");
                        course_Desc.setForeground(Color.blue);
                        course_Desc.setFont(new Font("Courier New", Font.BOLD, 15));
                        course_Desc.setBounds(5, 35, 230, 15);
                        course_Panel.add(course_Desc);

                        JLabel course_Desc2=new JLabel("in Indian Colleges 2024.");
                        course_Desc2.setForeground(Color.blue);
                        course_Desc2.setFont(new Font("Courier New", Font.BOLD, 15));
                        course_Desc2.setBounds(5, 51, 200, 15);
                        course_Panel.add(course_Desc2);

                        JLabel course_Desc3=new JLabel("2024.");
                        course_Desc3.setForeground(Color.blue);
                        course_Desc3.setFont(new Font("Courier New", Font.BOLD, 15));
                        course_Desc3.setBounds(5, 70, 230, 15);
                        course_Panel.add(course_Desc3);


                                //add images
                                ImageIcon course_icon=new ImageIcon(ClassLoader.getSystemResource("images/courses.png"));
                                Image course_img = course_icon.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
                                ImageIcon course_icon_scaled = new ImageIcon(course_img);
                                JLabel course_icon_label = new JLabel(course_icon_scaled);
                                course_icon_label.setBounds(175,8,100,90);
                                course_Panel.add(course_icon_label);

                JPanel course_Panel2=new JPanel();
                course_Panel2.setLayout(null);
                course_Panel2.setBounds(1,100,288,114);
                course_Panel2.setBackground(new Color(185, 191, 188));
                // rankPanel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
                course_examer.add(course_Panel2);                                           
                                
                        JButton mba_Course=new JButton("MBA");
                        // iirfButton.setContentAreaFilled(false);
                        mba_Course.setBackground(new Color(191, 188, 193));
                        mba_Course.setFocusPainted(false);
                        mba_Course.setForeground(Color.BLACK);
                        mba_Course.setFont(new Font("Arial", Font.BOLD, 15));
                        mba_Course.setBounds(5, 5, 100, 20);
                        mba_Course.addActionListener(this);
                        course_Panel2.add(mba_Course);
                        
                                                        
                                
                                
                        JButton mca_Courses=new JButton("MCA");
                        // iirfButton.setContentAreaFilled(false);
                        mca_Courses.setBackground(new Color(191, 188, 193));
                        mca_Courses.setFocusPainted(false);
                        mca_Courses.setForeground(Color.BLACK);
                        mca_Courses.setFont(new Font("Arial", Font.BOLD, 15));
                        mca_Courses.setBounds(5, 40, 120, 20);
                        mca_Courses.addActionListener(this);
                        course_Panel2.add(mca_Courses);
                                
                        JButton get_Top_Courses=new JButton("Get Top Courses in India    >");
                        // iirfButton.setContentAreaFilled(false);
                        get_Top_Courses.setBackground(new Color(191, 188, 193));
                        get_Top_Courses.setFocusPainted(false);
                        get_Top_Courses.setForeground(Color.BLACK);
                        get_Top_Courses.setFont(new Font("Arial", Font.BOLD, 15));
                        get_Top_Courses.setBounds(5, 80, 210, 20);
                        get_Top_Courses.addActionListener(this);
                        course_Panel2.add(get_Top_Courses);




        return homePanel;        //return JLabel
    }

/*
 *      private JButton iirfButton, nirf_Button, top_Rank_College_India; //ranking
        private JButton mca_Colleges_India, b_Tech_Colleges_India, discover_Top_Colleges_India; //college
        private JButton b_Tech_Exam, mca_Exam, check_Exam; //exam
 */

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() ==  iirfButton)
            {
                new IIRF();
            }
            if (e.getSource()==top_Rank_College_India)
            {
                new Colleges();
            }
        } catch (RuntimeException E) {
                E.printStackTrace();
            }
    }
}

//      private Border createCurvedBorder() {
//         int radius = 20;
//         int thickness = 5;
//         int inset = 5;
//         int arcWidth = 100;
//         int arcHeight = 100;

//         Shape shape = new RoundRectangle2D.Double(inset, inset, thickness - inset * 2, thickness - inset * 2, arcWidth, arcHeight);
//         return BorderFactory.createEmptiedBorder().getBorder("Button.border", shape);
// }

