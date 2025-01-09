package twentyfour.fall.oop.group1.lesson11.m24w0199;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Discharge_patient extends JFrame {
    Discharge_patient(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,1275,718);
        panel.setBackground(new Color(93, 118, 205));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Patient Check Out");
        label.setBounds(50,10,250,40);
        label.setFont(new Font("Mono",Font.PLAIN,20));
        label.setBackground(Color.BLACK);
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel lable1 = new JLabel("Customer ID");
        lable1.setBounds(50,100,200,40);
        lable1.setFont(new Font("Mono",Font.PLAIN,17));
        lable1.setForeground(Color.WHITE);
        panel.add(lable1);

        JLabel patient_name = new JLabel("Patient Name:");
        patient_name.setBounds(50,150,200,40);
        patient_name.setFont(new Font("Mono",Font.PLAIN,17));
        patient_name.setForeground(Color.WHITE);
        panel.add(patient_name);

        JLabel patient_name1 = new JLabel();
        patient_name1.setBounds(200,150,300,40);
        patient_name1.setFont(new Font("Mono",Font.PLAIN,17));
        patient_name1.setForeground(Color.YELLOW);
        panel.add(patient_name1);

        Choice choice = new Choice();
        choice.setBounds(250,100,250,40);
        panel.add(choice);

        try{
            DataBaseConnection c = new DataBaseConnection();
            ResultSet resultSet= c.statement.executeQuery("select * from patient_info ");
            while (resultSet.next()){
                choice.add(resultSet.getString("Number"));
            }


        }catch (Exception E){
            E.printStackTrace();
        }
        JLabel label2 = new JLabel("Room Number");
        label2.setBounds(50,200,200,40);
        label2.setFont(new Font("Mono",Font.PLAIN,17));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JLabel Room_Number = new JLabel();
        Room_Number.setBounds(200,200,250,40);
        Room_Number.setFont(new Font("Mono",Font.PLAIN,17));
        Room_Number.setForeground(Color.YELLOW);
        panel.add(Room_Number);

        JLabel lable3 = new JLabel(" Admission Date");
        lable3.setBounds(50,250,200,40);
        lable3.setFont(new Font("Mono",Font.PLAIN,17));
        lable3.setForeground(Color.WHITE);
        panel.add(lable3);

        JLabel Admissiion_data = new JLabel("");
        Admissiion_data.setBounds(200,250,250,40);
        Admissiion_data.setFont(new Font("Mono",Font.PLAIN,17));
        Admissiion_data.setForeground(Color.YELLOW);
        panel.add(Admissiion_data);

        JLabel lable4 = new JLabel(" CheckOut Date");
        lable4.setBounds(50,300,200,40);
        lable4.setFont(new Font("Mono",Font.PLAIN,17));
        lable4.setForeground(Color.WHITE);
        panel.add(lable4);


        Date date = new Date();
        JLabel CheckOut_data = new JLabel(""+date);
        CheckOut_data.setBounds(200,300,250,40);
        CheckOut_data.setFont(new Font("Mono",Font.PLAIN,17));
        CheckOut_data.setForeground(Color.WHITE);
        panel.add(CheckOut_data);


        // Discharge
        JButton discharge = new JButton("Discharge");
        discharge.setBounds(50,400,150,40);
        discharge.setBackground(Color.WHITE);
        discharge.setForeground(Color.BLACK);
        discharge.setFont(new Font("Mono",Font.PLAIN,17));
        panel.add(discharge);
        discharge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataBaseConnection c = new DataBaseConnection();
                try{

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


//        JButton Check = new JButton("Check");
//        Check.setBounds(200,350,150,40);
//        Check.setBackground(Color.WHITE);
//        Check.setForeground(Color.BLACK);
//        Check.setFont(new Font("Mono",Font.PLAIN,17));
//        panel.add(Check);

        JButton check = new JButton("Check");
        check.setBounds(200,400,150,40);
        check.setBackground(Color.WHITE);
        check.setForeground(Color.BLACK);
        check.setFont(new Font("Mono",Font.PLAIN,17));
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataBaseConnection c = new DataBaseConnection();
                try{
                    ResultSet resultSet = c.statement.executeQuery("select * from patient_info where Number='"+choice.getSelectedItem()+"'");
                    while (resultSet.next()) {

                        Room_Number.setText(resultSet.getString("Room_Number"));
                        Admissiion_data.setText(resultSet.getString("Time"));
                        patient_name1.setText(resultSet.getString("Name"));


                    }


                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Close");
        back.setBounds(350,400,150,40);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Mono",Font.PLAIN,17));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });








        setSize(1280,720);
        setLayout(null);
        setVisible(true);
        setLocation(100,100);
    }

    public static void main(String[] args) {
        new Discharge_patient();
    }
}
