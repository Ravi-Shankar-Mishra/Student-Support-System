package Student.Support.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result extends JFrame implements ActionListener {
    JLabel first,second, results1, results2, results3;
    JTextField firstText, secondText;
    JButton adds, sub, mul;

    Result() {
        setTitle("-----------Student Support System----------");
        setLayout(null);
        setBounds(100, 100, 845, 1700);
        //        setSize(845,1700);
//        setLocation(300, 15);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        first=new JLabel("Enter First Number : ");
        first.setBounds(20, 10, 150, 30);
        first.setForeground(Color.BLACK);
        add(first);

        firstText=new JTextField();
        firstText.setBounds(200, 10, 100, 30);
        firstText.setForeground(Color.BLACK);
        add(firstText);

        second=new JLabel("Enter Second Number : ");
        second.setBounds(20, 50, 150, 30);
        second.setForeground(Color.BLACK);
        add(second);


        secondText=new JTextField();
        secondText.setBounds(200, 50, 100, 30);
        secondText.setForeground(Color.BLACK);
        add(secondText);

        adds=new JButton("Add");
        adds.setBounds(20, 100, 100, 30);
        adds.setForeground(Color.BLACK);
        add(adds);

        results1=new JLabel("Result : ");
        results1.setBounds(140, 100, 100, 30);
        add(results1);

        sub=new JButton("Substract");
        sub.setBounds(20, 150, 100, 30);
        sub.setForeground(Color.BLACK);
        add(sub);

        results2=new JLabel("Result : ");
        results2.setBounds(140, 150, 100, 30);
        add(results2);

        mul=new JButton("Multiplication");
        mul.setBounds(20, 200, 100, 30);
        mul.setForeground(Color.BLACK);
        add(mul);

        results3=new JLabel("Result : ");
        results3.setBounds(140, 200, 100, 30);
        add(results3);
        adds.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);

        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String num1=firstText.getText();
        String num2=secondText.getText();
        double addd=0;
        double subb=0;
        double mull=0;

        try
        {
            if (e.getSource()==adds) {
                addd = Double.parseDouble(num1) + Double.parseDouble(num2);
                results1.setText(String.valueOf(addd));
            }
            if (e.getSource()==sub) {
                subb = Double.parseDouble(num1) - Double.parseDouble(num2);
                results2.setText(String.valueOf(subb));
            }
            if (e.getSource()==mul) {
                mull = Double.parseDouble(num1) * Double.parseDouble(num2);
                results3.setText(String.valueOf(mull));
            }
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Result();
    }


}