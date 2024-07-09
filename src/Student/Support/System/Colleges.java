package Student.Support.System;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class Colleges extends JFrame {
    private JPanel mainPannel, topPanel, imagePanel,tablePanel;

    public Colleges() {
        setTitle("-----------Top Colleges----------");
    //    setLayout(null);
        setBounds(200,15,1000,650);
        // setLocation(300, 15);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//===============-----------Create Main_panel for Scroll Page------------=================
        mainPannel=new JPanel();
        mainPannel.setLayout(null);
        mainPannel.setBounds(5,5,1000,700);


        //===============-----------Create Top panel for logo------------=================
                topPanel = new JPanel();
                topPanel.setLayout(null);
                topPanel.setBounds(5,5,1000,101);
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
                imagePanel.setBounds(5,101,1000,250);
                mainPannel.add(imagePanel);

        //----------------------Lable set on Pannel  //image set-----------------------------
                ImageNavigator pics=new ImageNavigator();
                JLabel imgpic=pics.picsSet();
                imagePanel.add(imgpic);

                JLabel mainHead=new JLabel("----------------------------------List of College in India----------------------------------");
                mainHead.setBounds(10, 355, 1000, 30);
                mainHead.setFont(new Font("Times New Roman",Font.BOLD, 30));
                mainHead.setForeground(new Color(0,94,78));
                mainPannel.add(mainHead);


                tablePanel = new JPanel(new BorderLayout());
                tablePanel.setBounds(35, 400, 950,200);

                    String[][] data = {
                                        {"1", "IIT Madras", "1,90,300", "21,45,000 LPA", "4.2"},
                                        {"2", "IIM Ahmedabad", "25,00,000", "34,36,000 LPA", "4.5"},
                                        {"3", "IIM Kolkata", "24,50,000", "35,00,000 LPA", "4.4"},
                                        {"4", "IIM Banglore", "25,00,000", "35,31,000 LPA", "4.6"},
                                        {"5", "IIT Delhi", "1,90,000", "25,82,000 LPA", "4.3"},
                                        {"6", "IIT Bombay", "2,30,000", "21,82,000 LPA", "4.4"}
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

                mainPannel.add(tablePanel, BorderLayout.CENTER);


        add(mainPannel);

        setVisible(true);

    }
    public static void main(String[] args) {
        new Colleges();
    }
}
