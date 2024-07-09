package Student.Support.System;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import java.net.URL;

public class test extends JFrame {
    test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 400);
        setLayout(new BorderLayout());


        URL rankIconUrl = getClass().getClassLoader().getResource("images/Ranks.png");
        ImageIcon rankIcon = new ImageIcon(rankIconUrl);
        Image rankImg = rankIcon.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
        ImageIcon rankIconScaled = new ImageIcon(rankImg);
        JLabel rankIconLabel = new JLabel(rankIconScaled);
        rankIconLabel.setBounds(175, 8, 100, 90);


        // ImageIcon rank_icon=new ImageIcon(ClassLoader.getSystemResource("images/Ranks.png"));
        // Image rank_img = rank_icon.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
        // ImageIcon rank_icon_scaled = new ImageIcon(rank_img);
        // JLabel rank_icon_label = new JLabel(rank_icon_scaled);
        // rank_icon_label.setBounds(175,8,100,90);


        String[] columnNames = {"Column 1", "Column 2", "Column 3", "Column 4", "Column 5"};
        Object[][] data = {
                {"1", " 1", "Row 1, Column 3", "Row 1, Column 4", "Row 1, Column 5"},
                {"2", "Row 2, Column 2", "Row 2, Column 3", "Row 2, Column 4", "Row 2, Column 5"},
                {"3", "Row 3, Column 2", "Row 3, Column 3", "Row 3, Column 4", "Row 3, Column 5"},
                {"4", "Row 4, Column 2", "Row 4, Column 3", "Row 4, Column 4", "Row 4, Column 5"}
                };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        TableColumnModel columnModel = table.getColumnModel();
        TableColumn column = columnModel.getColumn(0);
        column.setPreferredWidth(20);

        add(new JScrollPane(table), BorderLayout.CENTER);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new test().setVisible(true);
            }
        });
    }
}


// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.concurrent.TimeUnit;

// public class MarqueeLabelExample extends JFrame {
//     private JLabel marqueeLabel;
//     private Timer timer;

//     public MarqueeLabelExample() {
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(300, 100);
//         setLayout(new FlowLayout());

//         // Create the marquee label
//         marqueeLabel = new JLabel("This is a marquee label");
//         marqueeLabel.setForeground(Color.RED);
//         marqueeLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

//         // Create a timer to update the label's text
//         timer = new Timer(50, new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 marqueeLabel.setText(marqueeLabel.getText() + " ");
//                 marqueeLabel.repaint();
//             }
//         });

//         // Start the timer
//         timer.start();

//         // Add the marquee label to the frame
//         add(marqueeLabel);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new MarqueeLabelExample().setVisible(true);
//             }
//         });
//     }
// }