package twentyfour.fall.oop.group1.lesson11.m24w0199;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    Department(){

        JPanel panel = new JPanel();
        panel.setBounds(0,0,1280,720);
        panel.setLayout(null);
        panel.setBackground(new Color(93, 118, 205));
        add(panel);


        /// Create Table
        JTable table = new JTable();
        table.setBounds(100,50,700,300);
        table.setBackground(new Color(132, 156, 239));
        table.setFont(new Font("Mono",Font.BOLD,15));
        table.setForeground(Color.WHITE);
        panel.add(table);


        // Add Lable
        JLabel label1 = new JLabel("Hospital Department");
        label1.setBounds(100,20,200,30);
        label1.setFont(new Font("Mono",Font.BOLD,17));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("Phone Number");
        label2.setBounds(450,20,300,30);
        label2.setFont(new Font("Mono",Font.BOLD,17));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JButton b1 = new JButton("Close");
        b1.setBounds(100,370,100,40);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.black);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        // Retrive Data form Databases

        try{
            DataBaseConnection c = new DataBaseConnection();
            String query = "select * from department";
            ResultSet resultSet = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception E){
            E.printStackTrace();
        }



        setSize(1280,720);
        setLayout(null);
        setLocation(100,100);
        setVisible(true);
    }
    public static void main(String[] args) {
    new Department();
    }
}
