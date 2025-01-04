package twentyfour.fall.oop.group1.lesson11.m24w0199;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame {
    JTable table;

    Room() {
        // Set frame properties
        setTitle("Room Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1280, 720);
        setLayout(null);

        // Create a panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1280, 720);
        panel.setBackground(new Color(93, 118, 205));
        panel.setLayout(null);
        add(panel);

        // Add an image
        try {
            ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/floor.png"));
            Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            JLabel label = new JLabel(new ImageIcon(image));
            label.setBounds(850, 50, 300, 300);
            panel.add(label);
        } catch (Exception e) {
            System.out.println("Image not found: " + e.getMessage());
        }

        // Create a JTable for room information
        table = new JTable();
        table.setBounds(400, 50, 800, 600); // Adjust position and size
        table.setBackground(new Color(121, 146, 236));
        table.setFont(new Font("Mono", Font.PLAIN, 14));
        table.setForeground(Color.white);
        JScrollPane scrollPane = new JScrollPane(table); // Add scroll pane for better visibility
        scrollPane.setBounds(50, 50, 800, 600);

        panel.add(scrollPane);

        // Retrieve data from the database
        try {
            DataBaseConnection c = new DataBaseConnection();
            String query = "SELECT * FROM room";
            ResultSet resultSet = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching data from database: " + e.getMessage());
        }


        JButton close = new JButton("Close");
        close.setBounds(90,650,120,40);
        close.setBackground(Color.white);
        close.setForeground(Color.black);
        panel.add(close);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });



        // Make the frame visible
        setVisible(true);

    }

    public static void main(String[] args) {
        new Room();
    }
}
