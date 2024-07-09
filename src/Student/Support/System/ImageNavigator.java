package Student.Support.System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.Timer;

public class ImageNavigator extends  JFrame {
    JLabel pic;
    Timer tm;
    int x = 0;
    String[] list = {
            "F:/Projects/images/BHU.jpg",
            "F:/Projects/images/DU.jpg",
            "F:/Projects/images/Sage1.jpg",
            "F:/Projects/Student Support System/src/images/IIM-AHMBD.png",
            "F:/Projects/images/Sage4.jpg"
    };


    public JLabel picSet() {
        setLayout(null);

        pic = new JLabel();
        pic.setSize(800, 300);
        setImageSize(4);

        tm = new Timer(2500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImageSize(x);
                x += 1;
                if (x == list.length) {
                    x = 0;
                }
            }
        });

        add(pic);
        tm.start();

        return pic;
    }
    public void setImageSize(int i) {

        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage().getScaledInstance(800, 300, Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(img);
        pic.setIcon(newIcon);
    }
    public JLabel picsSet() {
        setLayout(null);

        pic = new JLabel();
        pic.setSize(1000, 300);
        setImageSize2(4);

        tm = new Timer(2500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImageSize2(x);
                x += 1;
                if (x == list.length) {
                    x = 0;
                }
            }
        });

        add(pic);
        tm.start();

        return pic;
    }

    

    public void setImageSize2(int i) {

        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage().getScaledInstance(1000, 300, Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(img);
        pic.setIcon(newIcon);
    }
}



//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/BHU.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(800, 200, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel BHU_label = new JLabel(i3);
//        BHU_label.setBounds(0, 10, 800, 200);
//        add(BHU_label);