package Student.Support.System;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class About extends JFrame {

    public String aboutPage()
    {
        String paragraphText = "<html><p style=\"text-align: justify;\">" +
                "This project offers a comprehensive platform designed to simplify your transition into college life. It connects you with everything you need – from finding suitable accommodation and reliable transportation to exploring college options.<br>"+
                "In this project, there are four sections named : <br>"+
                "<ul>"+
                "<li>Ram Student Section.</li>"+
                "<li>Ram Ram Jai Raja Ram :- Room Owner Section.</li>"+
                "<li>Transport Section.</li>"+
                "<li>College Section.</li>"+
                "</ul>"+
                "</p></html>";

                // JLabel paragraphs=new JLabel(paragraphText);
                // paragraphs.setFont(new Font("Arial", Font.BOLD, 14));
                // paragraphs.setBounds(0,5,500,400);


        return paragraphText;
    }

    public JLabel addAboutPanel()
    {
        String paragraphText = "<html><p style=\"text-align: justify;\">" +
                "This project offers a comprehensive platform designed to simplify your transition into college life. It connects you with everything you need – from finding suitable accommodation and reliable transportation to exploring college options.<br>"+
                "In this project, there are four sections named : <br>"+
                "<ul>"+
                "<li>Student Section.</li>"+
                "<li>Room Owner Section.</li>"+
                "<li>Transport Section.</li>"+
                "<li>College Section.</li>"+
                "</ul>"+
                "</p></html>";

        JLabel aboutPanel = new JLabel(paragraphText);
        aboutPanel.setLayout(null);
        aboutPanel.setFont(new Font("Arial",Font.BOLD,14));
        // aboutPanel.setBounds(50, 5, 550, 450);
        aboutPanel.setSize(550, 450);
        aboutPanel.setBorder(BorderFactory.createLineBorder(Color.red,10));
        


        return aboutPanel;
    }
}
