package Student.Support.System;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.*;

public class Coursees extends JFrame {
    private JPanel tablePanel;

    public Coursees() {
        setTitle("-----------Student Support System----------");
        setLayout(null);
        setBounds(200,35,1020,690);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Sage1.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1000, 290, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel sage_label = new JLabel(i3);
       sage_label.setBounds(0, 10, 1000, 290);
       add(sage_label);

        JLabel headings = new JLabel("List Of Courses in SAGE University.");
        headings.setFont(new Font("Arial Black", Font.BOLD, 35));
        headings.setForeground(new Color(0, 94, 78));
        headings.setBounds(50, 300, 950, 50);
        add(headings);


        tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBounds(35, 380, 950,200);

        String[][] data = {
                {"1", "Bachelor of Technology", "75000", "5 LPA", "4.2"},
                {"2", "Master of Computer Application", "50000", "2.5 LPA", "2.9"},
                {"3", "Bachelor of Computer Application", "40000", "2 LPA", "3.1"},
                {"4", "Bachelor of Science", "20000", "2.5 LPA", "3.2"},
                {"5", "Master of Business Administration", "60000", "4 LPA", "3.8"},
                {"6", "Bachelor of Commerce", "35000", "1.8 LPA", "2.3"}
        };
        String[] columnName = {"Sr. No.", "Courses", "Course fee", "Placement", "Rating"};
        DefaultTableModel model = new DefaultTableModel(data, columnName);

       

        JTable table = new JTable(model);
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setSelectionBackground(Color.RED);
        table.setGridColor(Color.red);
        table.setSelectionForeground(Color.white);
        table.setFont(new Font("Tahoma", Font.PLAIN, 17));
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(10);
        table.setAutoCreateRowSorter(true);

        TableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 0 || column==1 || column==2 || column==3 || column==4) {
                    c.setForeground(Color.WHITE); // set color
                    c.setBackground(new Color(0, 94, 78));
                    // c.setBackground(Color.RED);
                    c.setFont(new Font("Arial", Font.BOLD, 25)); // set font size
                }
                return c;
            }
        };

// Set the renderer for the column names
        table.getTableHeader().setDefaultRenderer(renderer);

        JScrollPane scrol = new JScrollPane(table);
        tablePanel.add(scrol, BorderLayout.CENTER);

        add(tablePanel, BorderLayout.CENTER);

        // pack();
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater(() -> {
        //     new Coursees();
        // });

        new Coursees();
    }
}

