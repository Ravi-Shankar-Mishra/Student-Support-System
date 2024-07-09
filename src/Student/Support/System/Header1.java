package Student.Support.System;

import javax.swing.*;
import java.awt.*;

public class Header1 extends JFrame {

    public JLabel logoSet()
    {
        setLayout(null);
        ImageIcon imglogo = new ImageIcon(ClassLoader.getSystemResource("images/logos.png"));
        Image imglg = imglogo.getImage().getScaledInstance(250, 100, Image.SCALE_DEFAULT);
        ImageIcon newlogo = new ImageIcon(imglg);
        JLabel logo = new JLabel(newlogo);
        return  logo;
    }
}
