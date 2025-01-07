package twentyfour.fall.oop.group1.lesson11.m24w0199;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class All_patient_info extends JFrame {
    All_patient_info(){

            JPanel panel = new JPanel();
            panel.setBounds(5,5,1280,720);
            panel.setBackground(new Color(93, 118, 205));
            panel.setLayout(null);
            add(panel);

            JTable table = new JTable();
            table.setBounds(10,40,1000,400);
            table.setBackground(new Color(93, 118, 205));
            table.setFont(new Font("Mono",Font.PLAIN,14));
            table.setForeground(Color.YELLOW);

            panel.add(table);


            JLabel label1 = new JLabel("ID Type");
            label1.setBounds(10,17,150,20);
            label1.setFont(new Font("Mono",Font.PLAIN,17));
            label1.setForeground(Color.WHITE);
            panel.add(label1);

            JLabel label2 = new JLabel("ID Number");
            label2.setBounds(135,17,150,20);
            label2.setFont(new Font("Mono",Font.PLAIN,17));
            label2.setForeground(Color.WHITE);
            panel.add(label2);

            JLabel label3 = new JLabel("Name");
            label3.setBounds(270,17,150,20);
            label3.setFont(new Font("Mono",Font.PLAIN,17));
            label3.setForeground(Color.WHITE);
            panel.add(label3);

            JLabel label4 = new JLabel("Gender");
            label4.setBounds(390,17,150,20);
            label4.setFont(new Font("Mono",Font.PLAIN,17));
            label4.setForeground(Color.WHITE);
            panel.add(label4);

            JLabel label5 = new JLabel("Symptoms");
            label5.setBounds(515,17,150,20);
            label5.setFont(new Font("Mono",Font.PLAIN,17));
            label5.setForeground(Color.WHITE);
            panel.add(label5);

            JLabel label6 = new JLabel("Room");
            label6.setBounds(640,17,150,20);
            label6.setFont(new Font("Mono",Font.PLAIN,17));
            label6.setForeground(Color.WHITE);
            panel.add(label6);

            JLabel label7 = new JLabel("Date & Time");
            label7.setBounds(770,17,150,20);
            label7.setFont(new Font("Mono",Font.PLAIN,17));
            label7.setForeground(Color.WHITE);
            panel.add(label7);

            JLabel label8 = new JLabel("Amount");
            label8.setBounds(890,17,150,20);
            label8.setFont(new Font("Mono",Font.PLAIN,17));
            label8.setForeground(Color.WHITE);
            panel.add(label8);


        JButton b1 = new JButton("Close");
        b1.setBounds(10,600,100,40);
        b1.setBackground(Color.WHITE);
        b1.setFont(new Font("Mono",Font.PLAIN,20));
        b1.setForeground(Color.BLACK);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });



            //Retrive Data form Patient Database Table

        try {
            DataBaseConnection c = new DataBaseConnection();
            String query = "select * from patient_info";
            ResultSet resultSet = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        }catch (Exception E){
            E.printStackTrace();
        }

        setUndecorated(false);
        setSize(1280,720);
        setLayout(null);
        setLocation(100,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new All_patient_info();
    }
}
